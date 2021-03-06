/*
 * PackJacket - GUI frontend to IzPack to make Java-based installers
 * Copyright (C) 2008 - 2009  Amandeep Grewal, Manodasan Wignarajah
 *
 * PackJacket is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PackJacket is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with PackJacket.  If not, see <http://www.gnu.org/licenses/>.
 */
package packjacket.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import packjacket.RunnerClass;
import packjacket.StaticUtils;
import packjacket.xml.XProcess;

/**
 * ProcessesPanel
 * @author Manodasan Wignarajah
 * @author Amandeep Grewal
 */
public class ProcessesPanel extends javax.swing.JPanel {

    public ArrayListModel<XProcess> process;
    public boolean isEditing;

    /** Creates new form PacksPanel */
    public ProcessesPanel() {
        initComponents();
        process = new ArrayListModel(processList);
        isEditing = false;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteBtn = new javax.swing.JButton();
        upBtn = new javax.swing.JButton();
        downBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        processList = new javax.swing.JList();
        logFileOption = new javax.swing.JCheckBox();
        logFilePath = new javax.swing.JComboBox();

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/remove.png"))); // NOI18N
        deleteBtn.setText("Remove");
        deleteBtn.setPreferredSize(new java.awt.Dimension(35, 25));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        upBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/up.png"))); // NOI18N
        upBtn.setText("Up");
        upBtn.setPreferredSize(new java.awt.Dimension(35, 25));
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
            }
        });

        downBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/down.png"))); // NOI18N
        downBtn.setText("Down");
        downBtn.setPreferredSize(new java.awt.Dimension(35, 25));
        downBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downBtnActionPerformed(evt);
            }
        });

        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit.png"))); // NOI18N
        editBtn.setText("Edit");
        editBtn.setPreferredSize(new java.awt.Dimension(35, 25));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        addBtn.setText("Add");
        addBtn.setPreferredSize(new java.awt.Dimension(35, 25));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(processList);

        logFileOption.setText("Generate Log File in Directory");
        logFileOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logFileOptionActionPerformed(evt);
            }
        });

        logFilePath.setEditable(true);
        logFilePath.setModel(GUIUtils.getAllFilesForComboBoxModel(true));
        AutoCompleteDecorator.decorate(logFilePath);
        logFilePath.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(logFileOption)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logFilePath, 0, 360, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(downBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(downBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logFileOption)
                    .addComponent(logFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        //Sets the values of the fields in the GUI if user is editing
        isEditing = true;

        final GeneralProcessPanel gen = new GeneralProcessPanel();
        final OptionalProcessPanel genop = new OptionalProcessPanel();
        XProcess p = process.getElement();
        gen.name.setText(p.job_name);
        gen.executeFile.setSelectedItem(p.executefile);
        for (String s : p.args)
            gen.args.append(s + "\n");
        ((OSPanel) genop.osPanel).setOS(p.os);
        makePanel(gen, genop);
}//GEN-LAST:event_editBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        //Performs appropirate actions when adding a process
        isEditing = false;

        final GeneralProcessPanel gen = new GeneralProcessPanel();
        final OptionalProcessPanel genop = new OptionalProcessPanel();
        makePanel(gen, genop);
}//GEN-LAST:event_addBtnActionPerformed

    private void downBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downBtnActionPerformed
        //Moves down the element one index
        process.moveDown();
}//GEN-LAST:event_downBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        //Removes the current element
        process.remove();
        if (process.list.isEmpty())
            RunnerClass.mf.panelsPanel.panelsModel.set(StaticUtils.max(StaticUtils.indexesOf(RunnerClass.mf.panelsPanel.panelsModel, new String[]{
                        "ProcessPanel", "ProcessPaneltrue", "ProcessPanelfalse"})),
                    "ProcessPanelfalse");
}//GEN-LAST:event_deleteBtnActionPerformed

    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed
        //Moves up the element one index
        process.moveUp();
}//GEN-LAST:event_upBtnActionPerformed

    private void logFileOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logFileOptionActionPerformed
        //Enables/disabled the logFilePath depending on whether the option is chosen
        logFilePath.setEnabled(logFileOption.isSelected());
}//GEN-LAST:event_logFileOptionActionPerformed

    /**
     * Creates the panel, and adds appropriate action listener and adds it
     * @param general the general panel
     * @param op the optional panel
     */
    private void makePanel(final GeneralProcessPanel general, final OptionalProcessPanel op) {
        RunnerClass.mf.addP(GUIUtils.makeCollapserPanel(general, op, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //Checks for errors
                StringBuffer errorMsg = new StringBuffer();
                if (general.name.getText().trim().equals(""))
                    errorMsg.append("You have not specified a process name.\n");
                if (general.executeFile.getSelectedItem().equals(""))
                    errorMsg.append("You have not specified a file to execute.\n");
                errorMsg.append(((OSPanel) op.osPanel).getError());
                if (errorMsg.length() != 0) {
                    String msg = errorMsg.substring(0, errorMsg.length() - 1);
                    JOptionPane.showMessageDialog(RunnerClass.mf, msg, "Incomplete Data", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                //Creates a new XProcess or gets the current one depending on whether editing or not
                XProcess p;
                if (isEditing)
                    p = process.getElement();
                else
                    p = new XProcess();
                //Sets the value of the XProcess
                p.job_name = general.name.getText();
                p.executefile = (String) general.executeFile.getSelectedItem();
                p.args = Arrays.asList(general.args.getText().split("\n"));
                p.os = ((OSPanel) op.osPanel).getOS();
                //Adds the XProcess if not editing
                if (!isEditing)
                    process.add(p);
                RunnerClass.mf.panelsPanel.panelsModel.set(StaticUtils.max(StaticUtils.indexesOf(RunnerClass.mf.panelsPanel.panelsModel, new String[]{
                            "ProcessPanel", "ProcessPaneltrue", "ProcessPanelfalse"})),
                        "ProcessPaneltrue");

                RunnerClass.mf.removeP();
            }
        },
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        RunnerClass.mf.removeP();
                    }
                }));
    }

    /**
     * Adjusts the GUI
     */
    public void adjustGUI() {
        logFileOptionActionPerformed(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addBtn;
    public javax.swing.JButton deleteBtn;
    public javax.swing.JButton downBtn;
    public javax.swing.JButton editBtn;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JCheckBox logFileOption;
    public javax.swing.JComboBox logFilePath;
    public javax.swing.JList processList;
    public javax.swing.JButton upBtn;
    // End of variables declaration//GEN-END:variables
}
