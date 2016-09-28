package gov.nasa.jpl.mbee.mdk.ems.validation.actions;

import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.project.ProjectDescriptor;
import com.nomagic.magicdraw.teamwork.application.TeamworkUtils;
import gov.nasa.jpl.mbee.mdk.MDKPlugin;
import gov.nasa.jpl.mbee.mdk.ems.ExportUtility;
import gov.nasa.jpl.mbee.mdk.lib.Utils;
import gov.nasa.jpl.mbee.mdk.docgen.validation.IRuleViolationAction;
import gov.nasa.jpl.mbee.mdk.docgen.validation.RuleViolationAction;
import org.joda.time.DateTime;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.awt.event.ActionEvent;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Map;

public class CreateAlfrescoTask extends RuleViolationAction implements AnnotationAction, IRuleViolationAction {

    private static final long serialVersionUID = 1L;
    private String branchName;
    private Map<String, String> wsMapping;
    private Map<String, String> wsIdMapping;
    private Map<String, ProjectDescriptor> branchDescriptors;

    public CreateAlfrescoTask(String branchName, Map<String, String> wsMapping, Map<String, String> wsIdMapping, Map<String, ProjectDescriptor> branchDescriptors) {
        super("CreateAlfrescoTask", "Create Alfresco Task", null, null);
        this.branchName = branchName;
        this.wsMapping = wsMapping;
        this.wsIdMapping = wsIdMapping;
        this.branchDescriptors = branchDescriptors;
    }

    @Override
    public boolean canExecute(Collection<Annotation> arg0) {
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void execute(Collection<Annotation> annos) {

    }

    @SuppressWarnings("unchecked")
    @Override
    public void actionPerformed(ActionEvent e) {
        String[] branches = branchName.split("/");
        String parentBranch = "master";
        for (int i = 1; i < branches.length - 1; i++) {
            parentBranch += "/" + branches[i];
        }
        String parentId = wsMapping.get(parentBranch);
        if (parentId == null) {
            Utils.guilog("The parent branch doesn't have a corresponding alfresco task yet, cannot create this task");
            return;
        }
        String url = ExportUtility.getUrl(Application.getInstance().getProject());
        DateTime current = new DateTime();
        String now = current.toString();
        url += "/workspaces";// + branches[branches.length-1] + "?sourceWorkspace=" + parentId + "&copyTime=" + now;

        JSONObject tosend = new JSONObject();
        JSONArray news = new JSONArray();
        tosend.put("workspaces", news);
        tosend.put("mmsVersion", MDKPlugin.VERSION);

        JSONObject newws = new JSONObject();
        newws.put("name", branches[branches.length - 1]);
        newws.put("parent", parentId);
        newws.put("branched", now);
        newws.put("description", "Created from magicdraw.");
        news.add(newws);

        String result = ExportUtility.send(url, tosend.toJSONString()/*, null*/, false, false);
        if (result == null || !result.startsWith("{")) {
            return;
        }
        JSONObject ob = (JSONObject) JSONValue.parse(result);
        JSONArray array = (JSONArray) ob.get("workspaces");
        if (array.size() == 1) {
            JSONObject workspace = (JSONObject) array.get(0);
            String newid = (String) workspace.get("id");
            String newname = (String) workspace.get("qualifiedName");
            wsMapping.put(newname, newid);
            wsIdMapping.put(newid, newname);
            ProjectDescriptor newBranch = branchDescriptors.get(newname);
            int version;
            try {
                version = TeamworkUtils.getLastVersion(newBranch);
            } catch (RemoteException e1) {
                version = -1;
            }
            ExportUtility.initializeBranchVersion(newid);
            if (version == 0) {
                ExportUtility.initializeDurableQueue(newid);
            }
        }

    }
}