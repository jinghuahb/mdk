package gov.nasa.jpl.mbee;

import gov.nasa.jpl.mbee.actions.systemsreasoner.CopyAction;
import gov.nasa.jpl.mbee.actions.systemsreasoner.CreateInstanceAction;
import gov.nasa.jpl.mbee.actions.systemsreasoner.DespecializeAction;
import gov.nasa.jpl.mbee.actions.systemsreasoner.SpecializeAction;
import gov.nasa.jpl.mbee.actions.systemsreasoner.ValidateAction;

import com.nomagic.actions.ActionsCategory;
import com.nomagic.actions.ActionsManager;
import com.nomagic.magicdraw.actions.ActionsGroups;
import com.nomagic.magicdraw.actions.BrowserContextAMConfigurator;
import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.actions.MDActionsCategory;
import com.nomagic.magicdraw.ui.browser.Node;
import com.nomagic.magicdraw.ui.browser.Tree;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;

public class SRConfigurator implements BrowserContextAMConfigurator {

    @Override
    public int getPriority() {
        // TODO Auto-generated method stub
        return 0; //medium
    }

    @Override
    public void configure(ActionsManager manager, Tree tree) {
    	if (tree.getSelectedNodes().length > 1)
    		return;
    	Node no = tree.getSelectedNode();
    	if (no == null)
    		return;
    	Object o = no.getUserObject();
    	if(!(o instanceof Element))
    		return;
    	Element target = (Element) o;
        ActionsCategory category = (ActionsCategory)manager.getActionFor("SRMain");
        if (category == null) {
            category = new MDActionsCategory("SRMain", "Reasons Systemer", null, ActionsGroups.APPLICATION_RELATED);
            category.setNested(true);
            manager.addCategory(0, category);
        }
        if (target instanceof Class) {
        	Class clazz = (Class) target;
        	MDAction specAction = new SpecializeAction(clazz);
        	MDAction despecAction = new DespecializeAction(clazz);
        	MDAction valAction = new ValidateAction(clazz);
        	MDAction copyAction = new CopyAction(clazz);
        	MDAction instAction = new CreateInstanceAction(clazz);
        	
        	if (clazz.getGeneralization().isEmpty()) {
        		specAction.updateState();
        		despecAction.updateState();
        	}
        	category.addAction(specAction);
        	category.addAction(despecAction);
        	category.addAction(valAction);
        	category.addAction(copyAction);
        	category.addAction(instAction);
        }
        category.setUseActionForDisable(true);
        if (category.isEmpty()) {
        	// copy of a hacked thing from DocGenConfigurator line 183-ish
        	final MDAction mda = new MDAction(null, null, null, "null");
        	mda.updateState();
        	mda.setEnabled(false);
        	category.addAction(mda);
        }
    }
}
