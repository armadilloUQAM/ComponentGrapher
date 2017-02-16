 /*  COMPONENT-GRAPHER v1.0
 *  
 *  Copyright (C) 2015-2017  Etienne Lord
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the 
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package dialog;

import COMPONENT_GRAPHER.datasets;
import COMPONENT_GRAPHER.util;
import config.Config;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Etienne
 */
public class ExportTripletJDialog extends javax.swing.JDialog {

    datasets data=null;
    Config config=new Config();
    public boolean status_save=false;
    public String filename="";
    Frame parent;
    
    /**
     * Creates new form ExportNetworkJDialog
     */
    public ExportTripletJDialog(java.awt.Frame parent, datasets data_) {
        super(parent, true);
        this.parent=parent;
        this.data=data_;
        initComponents();
        this.Filename_jTextField.setText(data.filename);    
        this.filename=data.filename;
          this.setTitle("Save matrix");
          MessageText("Save matrix to file","");
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();         
        Dimension d = getSize();
        setLocation((screenSize.width-d.width)/2,
					(screenSize.height-d.height)/2);       
         setVisible(true);
    }

    
    public void saveFile() {
          filename=this.Filename_jTextField.getText();
         switch(format_jComboBox.getSelectedIndex()) {
             
         }        
         
         this.setVisible(false);
    }
    
     /**
     * Affiche un message dans la status bar
     * La provenance peut être mise dans un tooltip
     * @param text Le texte
     * @param tooltip Le tooltip texte
     */
    void MessageText(String text, String tooltip) {
        this.jStatusMessage.setEnabled(true);
        this.jStatusMessage.setForeground(new java.awt.Color(0, 51, 153));
        this.jStatusMessage.setBackground(Color.WHITE);
        this.jStatusMessage.setToolTipText(tooltip);
        this.jStatusMessage.setText(text);
    }

    /**
     * Affiche un message d'erreur en rouge dans la status bar
     * La provenance peut être mise dans un tooltip
     * @param text Le texte
     * @param tooltip Le tooltip texte
     */
    void MessageErreur(String text, String tooltip) {
        this.jStatusMessage.setEnabled(true);
        this.jStatusMessage.setForeground(Color.RED);
        this.jStatusMessage.setBackground(Color.WHITE);
        this.jStatusMessage.setToolTipText(tooltip);
        this.jStatusMessage.setText(text);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Save_jButton = new javax.swing.JButton();
        Cancel_jButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Filename_jTextField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        format_jComboBox = new javax.swing.JComboBox();
        jStatusMessage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Save_jButton.setText("Save");
        Save_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_jButtonActionPerformed(evt);
            }
        });

        Cancel_jButton.setText("Cancel");
        Cancel_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_jButtonActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Filename");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Filename_jTextField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Filename_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Format"));

        format_jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TSV (tab-separated values)", "CSV (comma-separated values)" }));
        format_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                format_jComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(format_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(format_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jStatusMessage.setForeground(new java.awt.Color(51, 51, 255));
        jStatusMessage.setText("Info");

        jLabel2.setBackground(new java.awt.Color(0, 153, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Export triplets list");
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jStatusMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cancel_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Save_jButton))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Save_jButton)
                        .addComponent(Cancel_jButton))
                    .addComponent(jStatusMessage, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Save_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_jButtonActionPerformed
        filename=this.Filename_jTextField.getText();
        if (util.FileExists(filename)) {
          int n = JOptionPane.showConfirmDialog(parent,
                "Warning!\n" +
                "The file "+filename+" exists.\n"+
                "Do you want to replace it?","Replace existing file?",               
                JOptionPane.YES_NO_OPTION);
            if (n==0) {
               saveFile();
               this.status_save=true;
            }
        } else {
            saveFile();
            this.status_save=true;
        }
         
       
    }//GEN-LAST:event_Save_jButtonActionPerformed

    private void Cancel_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_jButtonActionPerformed
        this.filename=data.filename;
        this.status_save=false;
        this.setVisible(false);
    }//GEN-LAST:event_Cancel_jButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       JFileChooser chooser = new JFileChooser(config.getExplorerPath());
              chooser.setDialogType(JFileChooser.SAVE_DIALOG);
              chooser.setApproveButtonText("Select");
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY); 
                chooser.setDialogTitle("Select filename");
                int returnVal = chooser.showOpenDialog(this);
                if(returnVal == JFileChooser.APPROVE_OPTION) {
                    this.Filename_jTextField.setText(chooser.getSelectedFile().getPath());                
                }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void format_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_format_jComboBoxActionPerformed
        if (this.format_jComboBox.getSelectedIndex()==2&&data.info_total_multistate>0) {
            MessageErreur("Phylip doesn't accept multistate characters.", "");
            this.Save_jButton.setEnabled(false);
        } else {
            this.Save_jButton.setEnabled(true);
        }
    }//GEN-LAST:event_format_jComboBoxActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_jButton;
    private javax.swing.JTextField Filename_jTextField;
    private javax.swing.JButton Save_jButton;
    private javax.swing.JComboBox format_jComboBox;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jStatusMessage;
    // End of variables declaration//GEN-END:variables
}