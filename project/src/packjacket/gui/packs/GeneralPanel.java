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
package packjacket.gui.packs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import packjacket.gui.ArrayListModel;
import packjacket.xml.XFile;
import packjacket.RunnerClass;
import packjacket.gui.GUIUtils;
import packjacket.gui.OSPanel;

/**
 * The general packs panel
 * @author Amandeep Grewal
 */
public class GeneralPanel extends javax.swing.JPanel {

    public ArrayListModel<XFile> files;
    public boolean isEditing;

    /** Creates new form General */
    public GeneralPanel() {
        initComponents();
        files = new ArrayListModel<XFile>(filesList);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        required = new javax.swing.JCheckBox();
        preselected = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        filesList = new javax.swing.JList();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();

        jLabel1.setText("Name");

        required.setText("Required");
        required.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requiredActionPerformed(evt);
            }
        });

        preselected.setText("Pre-selected");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Files"));

        jScrollPane3.setViewportView(filesList);

        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        addBtn.setToolTipText("Edit");
        addBtn.setPreferredSize(new java.awt.Dimension(35, 25));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit.png"))); // NOI18N
        editBtn.setToolTipText("Edit");
        editBtn.setPreferredSize(new java.awt.Dimension(35, 25));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/remove.png"))); // NOI18N
        deleteBtn.setToolTipText("Edit");
        deleteBtn.setPreferredSize(new java.awt.Dimension(35, 25));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, 0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jLabel2.setText("Description");

        description.setLineWrap(true);
        description.setWrapStyleWord(true);
        jScrollPane1.setViewportView(description);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(required)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(preselected))
                            .addComponent(jLabel2))
                        .addGap(12, 12, 12))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(required)
                            .addComponent(preselected))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        final FileOptionalPanel fop = new FileOptionalPanel();
        final FilePanel fp = new FilePanel(fop);
        isEditing = false;
        preselectedBefore = false;

        RunnerClass.mf.addP(GUIUtils.makeCollapserPanel(fp, fop,
                getOKListener(fp, fop), getCancelListener(fp, fop)));
    }//GEN-LAST:event_addBtnActionPerformed

    public ActionListener getOKListener(final FilePanel fp, final FileOptionalPanel fop) {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                XFile xfile;
                if (isEditing)
                    xfile = files.getElement();
                else
                    xfile = new XFile();

                StringBuffer errormsg = new StringBuffer();
                if (fp.sourceDirOption.isSelected()) {
                    if (fp.sourceDir.getText().trim().equals(""))
                        errormsg.append("You have not specified a source directory.\n");
                } else {
                    if (fp.sourceFile.getText().trim().equals(""))
                        errormsg.append("You have not specified a source file.\n");
                    if (fop.renameTargetChoice.isSelected())
                        if (fop.renameTarget.getText().trim().equals(""))
                            errormsg.append("You have specified that you would like to rename the file, but have not specified a new name.\n");
                }
                errormsg.append(((OSPanel) fop.osPanel).getError());
                if (errormsg.length() != 0) {
                    String msg = errormsg.substring(0, errormsg.length() - 1);
                    JOptionPane.showMessageDialog(RunnerClass.mf, msg, "Incomplete Data", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                xfile.packs_file_os = ((OSPanel) fop.osPanel).getOS();
                xfile.packs_file_overwrite = fop.overwrite.getSelectedItem().toString();
                xfile.packs_file_renameTarget = fop.renameTarget.getText().trim();
                xfile.packs_file_sourceDir = fp.sourceDir.getText().trim();
                xfile.packs_file_sourceFile = fp.sourceFile.getText().trim();
                xfile.packs_file_targetdir = fop.targetdir.getText().trim();
                xfile.renameTargetFileOption = fop.renameTargetChoice.isSelected();
                xfile.sourceDirOption = fp.sourceDirOption.isSelected();
                xfile.sourceFileOption = fp.sourceFileOption.isSelected();
                xfile.packs_file_unpack = fop.unpack.isSelected();

                if (!isEditing)
                    files.add(xfile);


                RunnerClass.mf.removeP();
            }
        };
    }

    public ActionListener getCancelListener(final FilePanel fp, final FileOptionalPanel fop) {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                RunnerClass.mf.removeP();
            }
        };
    }

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        files.remove();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        final FileOptionalPanel fop = new FileOptionalPanel();
        final FilePanel fp = new FilePanel(fop);
        isEditing = true;

        XFile xfile = files.getElement();
        ((OSPanel) fop.osPanel).setOS(xfile.packs_file_os);
        fop.overwrite.setSelectedItem(xfile.packs_file_overwrite);
        fop.renameTarget.setText(xfile.packs_file_renameTarget);
        fp.sourceDir.setText(xfile.packs_file_sourceDir);
        fp.sourceFile.setText(xfile.packs_file_sourceFile);
        fop.targetdir.setText(xfile.packs_file_targetdir);
        fop.renameTargetChoice.setSelected(xfile.renameTargetFileOption);
        fp.sourceDirOption.setSelected(xfile.sourceDirOption);
        fp.sourceFileOption.setSelected(xfile.sourceFileOption);
        fop.unpack.setSelected(xfile.packs_file_unpack);

        fp.perfomInitialAction();
        fop.perfomInitialAction();

        RunnerClass.mf.addP(GUIUtils.makeCollapserPanel(fp, fop,
                getOKListener(fp, fop), getCancelListener(fp, fop)));
    }//GEN-LAST:event_editBtnActionPerformed
    public boolean preselectedBefore;

    private void requiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requiredActionPerformed
        if (required.isSelected()) {
            preselectedBefore = preselected.isSelected();
            preselected.setSelected(true);
            preselected.setEnabled(false);
        } else {
            preselected.setEnabled(true);
            preselected.setSelected(preselectedBefore);
        }
    }//GEN-LAST:event_requiredActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addBtn;
    public javax.swing.JButton deleteBtn;
    public javax.swing.JTextArea description;
    public javax.swing.JButton editBtn;
    public javax.swing.JList filesList;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextField name;
    public javax.swing.JCheckBox preselected;
    public javax.swing.JCheckBox required;
    // End of variables declaration//GEN-END:variables
}