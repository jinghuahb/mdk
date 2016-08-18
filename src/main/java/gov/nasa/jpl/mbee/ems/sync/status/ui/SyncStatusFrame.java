package gov.nasa.jpl.mbee.ems.sync.status.ui;

import com.nomagic.magicdraw.core.Application;

import javax.swing.*;
import java.awt.*;

/**
 * Created by igomes on 8/16/16.
 */
public class SyncStatusFrame extends JFrame {
    private JPanel rootPanel;
    private JLabel inMemoryLocalCreatedLabel;
    private JLabel inMemoryLocalUpdatedLabel;
    private JLabel inMemoryLocalDeletedLabel;
    private JLabel persistedLocalCreatedLabel;
    private JLabel persistedLocalUpdatedLabel;
    private JLabel persistedLocalDeletedLabel;
    private JLabel totalLocalCreatedLabel;
    private JLabel totalLocalUpdatedLabel;
    private JLabel totalLocalDeletedLabel;
    private JLabel totalInMemoryLocalChangedLabel;
    private JLabel totalPersistedLocalChangedLabel;
    private JLabel totalLocalChangedLabel;
    private JLabel inMemoryJmsCreatedLabel;
    private JLabel inMemoryJmsUpdatedLabel;
    private JLabel inMemoryJmsDeletedLabel;
    private JLabel persistedJmsCreatedLabel;
    private JLabel persistedJmsUpdatedLabel;
    private JLabel persistedJmsDeletedLabel;
    private JLabel totalJmsCreatedLabel;
    private JLabel totalJmsUpdatedLabel;
    private JLabel totalJmsDeletedLabel;
    private JLabel totalInMemoryJmsChangedLabel;
    private JLabel totalPersistedJmsChangedLabel;
    private JLabel totalJmsChangedLabel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JLabel getInMemoryLocalCreatedLabel() {
        return inMemoryLocalCreatedLabel;
    }

    public JLabel getInMemoryLocalUpdatedLabel() {
        return inMemoryLocalUpdatedLabel;
    }

    public JLabel getInMemoryLocalDeletedLabel() {
        return inMemoryLocalDeletedLabel;
    }

    public JLabel getPersistedLocalCreatedLabel() {
        return persistedLocalCreatedLabel;
    }

    public JLabel getPersistedLocalUpdatedLabel() {
        return persistedLocalUpdatedLabel;
    }

    public JLabel getPersistedLocalDeletedLabel() {
        return persistedLocalDeletedLabel;
    }

    public JLabel getTotalLocalCreatedLabel() {
        return totalLocalCreatedLabel;
    }

    public JLabel getTotalLocalUpdatedLabel() {
        return totalLocalUpdatedLabel;
    }

    public JLabel getTotalLocalDeletedLabel() {
        return totalLocalDeletedLabel;
    }

    public JLabel getTotalInMemoryLocalChangedLabel() {
        return totalInMemoryLocalChangedLabel;
    }

    public JLabel getTotalPersistedLocalChangedLabel() {
        return totalPersistedLocalChangedLabel;
    }

    public JLabel getTotalLocalChangedLabel() {
        return totalLocalChangedLabel;
    }

    public JLabel getInMemoryJmsCreatedLabel() {
        return inMemoryJmsCreatedLabel;
    }

    public JLabel getInMemoryJmsUpdatedLabel() {
        return inMemoryJmsUpdatedLabel;
    }

    public JLabel getInMemoryJmsDeletedLabel() {
        return inMemoryJmsDeletedLabel;
    }

    public JLabel getPersistedJmsCreatedLabel() {
        return persistedJmsCreatedLabel;
    }

    public JLabel getPersistedJmsUpdatedLabel() {
        return persistedJmsUpdatedLabel;
    }

    public JLabel getPersistedJmsDeletedLabel() {
        return persistedJmsDeletedLabel;
    }

    public JLabel getTotalJmsCreatedLabel() {
        return totalJmsCreatedLabel;
    }

    public JLabel getTotalJmsUpdatedLabel() {
        return totalJmsUpdatedLabel;
    }

    public JLabel getTotalJmsDeletedLabel() {
        return totalJmsDeletedLabel;
    }

    public JLabel getTotalInMemoryJmsChangedLabel() {
        return totalInMemoryJmsChangedLabel;
    }

    public JLabel getTotalPersistedJmsChangedLabel() {
        return totalPersistedJmsChangedLabel;
    }

    public JLabel getTotalJmsChangedLabel() {
        return totalJmsChangedLabel;
    }

    public SyncStatusFrame() {
        super("Sync Status");
        setContentPane(rootPanel);
        setLocationRelativeTo(Application.getInstance().getMainFrame());
        pack();
        setMinimumSize(getSize());
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setAlwaysOnTop(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new GridBagLayout());
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(6, 6, 6, 6);
        rootPanel.add(panel1, gbc);
        final JLabel label1 = new JLabel();
        label1.setText("Stored in Memory");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(label1, gbc);
        final JLabel label2 = new JLabel();
        label2.setText("Stored in Model");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(label2, gbc);
        persistedLocalCreatedLabel = new JLabel();
        persistedLocalCreatedLabel.setText("1");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(persistedLocalCreatedLabel, gbc);
        persistedLocalUpdatedLabel = new JLabel();
        persistedLocalUpdatedLabel.setText("2");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(persistedLocalUpdatedLabel, gbc);
        persistedLocalDeletedLabel = new JLabel();
        persistedLocalDeletedLabel.setText("3");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(persistedLocalDeletedLabel, gbc);
        persistedJmsCreatedLabel = new JLabel();
        persistedJmsCreatedLabel.setText("4");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(persistedJmsCreatedLabel, gbc);
        persistedJmsUpdatedLabel = new JLabel();
        persistedJmsUpdatedLabel.setText("5");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(persistedJmsUpdatedLabel, gbc);
        persistedJmsDeletedLabel = new JLabel();
        persistedJmsDeletedLabel.setText("6");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(persistedJmsDeletedLabel, gbc);
        inMemoryLocalCreatedLabel = new JLabel();
        inMemoryLocalCreatedLabel.setText("6");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(inMemoryLocalCreatedLabel, gbc);
        inMemoryLocalUpdatedLabel = new JLabel();
        inMemoryLocalUpdatedLabel.setText("5");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(inMemoryLocalUpdatedLabel, gbc);
        inMemoryLocalDeletedLabel = new JLabel();
        inMemoryLocalDeletedLabel.setText("4");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(inMemoryLocalDeletedLabel, gbc);
        inMemoryJmsCreatedLabel = new JLabel();
        inMemoryJmsCreatedLabel.setText("3");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(inMemoryJmsCreatedLabel, gbc);
        inMemoryJmsUpdatedLabel = new JLabel();
        inMemoryJmsUpdatedLabel.setText("2");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(inMemoryJmsUpdatedLabel, gbc);
        inMemoryJmsDeletedLabel = new JLabel();
        inMemoryJmsDeletedLabel.setText("1");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(inMemoryJmsDeletedLabel, gbc);
        final JLabel label3 = new JLabel();
        label3.setFont(new Font(label3.getFont().getName(), Font.BOLD, 14));
        label3.setText("Unsynced Local Changes");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 5;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(label3, gbc);
        final JLabel label4 = new JLabel();
        label4.setFont(new Font(label4.getFont().getName(), Font.BOLD, 14));
        label4.setText("Unsynced MMS Changes");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 0;
        gbc.gridwidth = 5;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(label4, gbc);
        final JLabel label5 = new JLabel();
        label5.setText("Created");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(label5, gbc);
        final JLabel label6 = new JLabel();
        label6.setText("Updated");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(label6, gbc);
        final JLabel label7 = new JLabel();
        label7.setText("Deleted");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(label7, gbc);
        final JLabel label8 = new JLabel();
        label8.setText("Created");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(label8, gbc);
        final JLabel label9 = new JLabel();
        label9.setText("Updated");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(label9, gbc);
        final JLabel label10 = new JLabel();
        label10.setText("Deleted");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(label10, gbc);
        final JLabel label11 = new JLabel();
        label11.setFont(new Font(label11.getFont().getName(), Font.BOLD, label11.getFont().getSize()));
        label11.setText("Total");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(label11, gbc);
        totalLocalCreatedLabel = new JLabel();
        totalLocalCreatedLabel.setFont(new Font(totalLocalCreatedLabel.getFont().getName(), Font.BOLD, totalLocalCreatedLabel.getFont().getSize()));
        totalLocalCreatedLabel.setText("7");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(totalLocalCreatedLabel, gbc);
        totalLocalUpdatedLabel = new JLabel();
        totalLocalUpdatedLabel.setFont(new Font(totalLocalUpdatedLabel.getFont().getName(), Font.BOLD, totalLocalUpdatedLabel.getFont().getSize()));
        totalLocalUpdatedLabel.setText("7");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(totalLocalUpdatedLabel, gbc);
        totalLocalDeletedLabel = new JLabel();
        totalLocalDeletedLabel.setFont(new Font(totalLocalDeletedLabel.getFont().getName(), Font.BOLD, totalLocalDeletedLabel.getFont().getSize()));
        totalLocalDeletedLabel.setText("7");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(totalLocalDeletedLabel, gbc);
        totalJmsCreatedLabel = new JLabel();
        totalJmsCreatedLabel.setFont(new Font(totalJmsCreatedLabel.getFont().getName(), Font.BOLD, totalJmsCreatedLabel.getFont().getSize()));
        totalJmsCreatedLabel.setText("7");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(totalJmsCreatedLabel, gbc);
        totalJmsUpdatedLabel = new JLabel();
        totalJmsUpdatedLabel.setFont(new Font(totalJmsUpdatedLabel.getFont().getName(), Font.BOLD, totalJmsUpdatedLabel.getFont().getSize()));
        totalJmsUpdatedLabel.setText("7");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(totalJmsUpdatedLabel, gbc);
        totalJmsDeletedLabel = new JLabel();
        totalJmsDeletedLabel.setFont(new Font(totalJmsDeletedLabel.getFont().getName(), Font.BOLD, totalJmsDeletedLabel.getFont().getSize()));
        totalJmsDeletedLabel.setText("7");
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(totalJmsDeletedLabel, gbc);
        final JSeparator separator1 = new JSeparator();
        separator1.setOrientation(1);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridheight = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(separator1, gbc);
        final JSeparator separator2 = new JSeparator();
        separator2.setOrientation(1);
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 0;
        gbc.gridheight = 7;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(separator2, gbc);
        final JSeparator separator3 = new JSeparator();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(separator3, gbc);
        final JSeparator separator4 = new JSeparator();
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(separator4, gbc);
        final JSeparator separator5 = new JSeparator();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(separator5, gbc);
        final JSeparator separator6 = new JSeparator();
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(separator6, gbc);
        final JLabel label12 = new JLabel();
        label12.setFont(new Font(label12.getFont().getName(), Font.BOLD, label12.getFont().getSize()));
        label12.setText("Total");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(label12, gbc);
        totalInMemoryLocalChangedLabel = new JLabel();
        totalInMemoryLocalChangedLabel.setFont(new Font(totalInMemoryLocalChangedLabel.getFont().getName(), Font.BOLD, totalInMemoryLocalChangedLabel.getFont().getSize()));
        totalInMemoryLocalChangedLabel.setText("15");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(totalInMemoryLocalChangedLabel, gbc);
        totalPersistedLocalChangedLabel = new JLabel();
        totalPersistedLocalChangedLabel.setFont(new Font(totalPersistedLocalChangedLabel.getFont().getName(), Font.BOLD, totalPersistedLocalChangedLabel.getFont().getSize()));
        totalPersistedLocalChangedLabel.setText("6");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(totalPersistedLocalChangedLabel, gbc);
        totalLocalChangedLabel = new JLabel();
        totalLocalChangedLabel.setFont(new Font(totalLocalChangedLabel.getFont().getName(), Font.BOLD, totalLocalChangedLabel.getFont().getSize()));
        totalLocalChangedLabel.setText("21");
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(totalLocalChangedLabel, gbc);
        final JLabel label13 = new JLabel();
        label13.setFont(new Font(label13.getFont().getName(), Font.BOLD, label13.getFont().getSize()));
        label13.setText("Total");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(label13, gbc);
        totalInMemoryJmsChangedLabel = new JLabel();
        totalInMemoryJmsChangedLabel.setFont(new Font(totalInMemoryJmsChangedLabel.getFont().getName(), Font.BOLD, totalInMemoryJmsChangedLabel.getFont().getSize()));
        totalInMemoryJmsChangedLabel.setText("6");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(totalInMemoryJmsChangedLabel, gbc);
        totalPersistedJmsChangedLabel = new JLabel();
        totalPersistedJmsChangedLabel.setFont(new Font(totalPersistedJmsChangedLabel.getFont().getName(), Font.BOLD, totalPersistedJmsChangedLabel.getFont().getSize()));
        totalPersistedJmsChangedLabel.setText("15");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(totalPersistedJmsChangedLabel, gbc);
        totalJmsChangedLabel = new JLabel();
        totalJmsChangedLabel.setFont(new Font(totalJmsChangedLabel.getFont().getName(), Font.BOLD, totalJmsChangedLabel.getFont().getSize()));
        totalJmsChangedLabel.setText("21");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(totalJmsChangedLabel, gbc);
        final JSeparator separator7 = new JSeparator();
        separator7.setOrientation(1);
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 3;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(separator7, gbc);
        final JSeparator separator8 = new JSeparator();
        separator8.setOrientation(1);
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 3;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(separator8, gbc);
        final JSeparator separator9 = new JSeparator();
        separator9.setOrientation(1);
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(separator9, gbc);
        final JSeparator separator10 = new JSeparator();
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(separator10, gbc);
        final JSeparator separator11 = new JSeparator();
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(separator11, gbc);
        final JSeparator separator12 = new JSeparator();
        separator12.setOrientation(1);
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 3, 3, 3);
        panel1.add(separator12, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
