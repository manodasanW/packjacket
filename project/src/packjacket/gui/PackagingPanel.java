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

/**
 * Panel for multi volume packaging of installers.
 * @author Amandeep Grewal
 */
public class PackagingPanel extends javax.swing.JPanel {

    /** Creates new form PackagingPanel */
    public PackagingPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        multiVolumeOption = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        volumeSize = new javax.swing.JTextField();
        firstvolumefreespace = new javax.swing.JTextField();
        sizeUnit1 = new javax.swing.JComboBox();
        sizeUnit2 = new javax.swing.JComboBox();

        multiVolumeOption.setText("Use Multi-Volume Packaging");
        multiVolumeOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiVolumeOptionActionPerformed(evt);
            }
        });

        jLabel16.setText("Size of Each Volume");

        jLabel17.setText("Free Space on First Volume");

        volumeSize.setEnabled(false);

        firstvolumefreespace.setEnabled(false);

        sizeUnit1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bytes", "KB", "MB", "GB", "TB" }));
        sizeUnit1.setSelectedIndex(2);
        sizeUnit1.setEnabled(false);

        sizeUnit2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bytes", "KB", "MB", "GB", "TB" }));
        sizeUnit2.setSelectedIndex(2);
        sizeUnit2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(multiVolumeOption)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstvolumefreespace)
                            .addComponent(volumeSize, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sizeUnit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sizeUnit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(multiVolumeOption)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(volumeSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sizeUnit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(firstvolumefreespace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sizeUnit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Sets UI values from data values
     */
    public void adjustGUI() {
        multiVolumeOptionActionPerformed(null);
    }

    private void multiVolumeOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiVolumeOptionActionPerformed
        //Enables depending on if user wants to determine multi volumes
        if (multiVolumeOption.isSelected()) {
            sizeUnit1.setEnabled(true);
            sizeUnit2.setEnabled(true);
            volumeSize.setEnabled(true);
            firstvolumefreespace.setEnabled(true);
        } else {
            sizeUnit1.setEnabled(false);
            sizeUnit2.setEnabled(false);
            volumeSize.setEnabled(false);
            firstvolumefreespace.setEnabled(false);
        }
}//GEN-LAST:event_multiVolumeOptionActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField firstvolumefreespace;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JCheckBox multiVolumeOption;
    public javax.swing.JComboBox sizeUnit1;
    public javax.swing.JComboBox sizeUnit2;
    public javax.swing.JTextField volumeSize;
    // End of variables declaration//GEN-END:variables
}
