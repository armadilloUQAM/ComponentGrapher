/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog;

import COMPONENT_GRAPHER.datasets;
import COMPONENT_GRAPHER.permutation_statistics;
import COMPONENT_GRAPHER.util;
import config.Config;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Etienne
 */
public class ExportResultJDialog extends javax.swing.JDialog {

    permutation_statistics data=null;
    Config config=new Config();
    public boolean status_run=false;
    
    /**
     * Creates new form ExportNetworkJDialog
     */
    public ExportResultJDialog(java.awt.Frame parent, permutation_statistics data_) {
        super(parent, true);
        this.data=data_;
        initComponents();
        this.Name_jTextField.setText(data.reference_data.result_directory);
         this.Directory_jTextField.setText(config.get("resultsDir"));
          this.setTitle("Export result statistics");
          MessageText("Select the export directory","");
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         this.Export_jButton.setEnabled(data.reference_data.analysed); //-*-Disable export if not analysed
         if (!data.reference_data.analysed) {
             MessageErreur("Dataset is not analyzed.", null);
         }
        Dimension d = getSize();
        setLocation((screenSize.width-d.width)/2,
					(screenSize.height-d.height)/2);       
         setVisible(true);
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
        Export_jButton = new javax.swing.JButton();
        Cancel_jButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Directory_jTextField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        type1_jCheckBox = new javax.swing.JCheckBox();
        type2_jCheckBox = new javax.swing.JCheckBox();
        type3_jCheckBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jStatusMessage = new javax.swing.JLabel();
        Name_jTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Export_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Export_jButton.setText("Export");
        Export_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Export_jButtonActionPerformed(evt);
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

        Directory_jTextField.setEditable(false);
        Directory_jTextField.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setText("...");
        jButton3.setToolTipText("Select graph output directory");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Output directory");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Directory_jTextField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Directory_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Network types"));

        type1_jCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        type1_jCheckBox.setSelected(true);
        type1_jCheckBox.setText("Summary statistics");
        type1_jCheckBox.setEnabled(false);

        type2_jCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        type2_jCheckBox.setSelected(true);
        type2_jCheckBox.setText("Network statistics");
        type2_jCheckBox.setEnabled(false);

        type3_jCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        type3_jCheckBox.setSelected(true);
        type3_jCheckBox.setText("Nodes statistics");
        type3_jCheckBox.setEnabled(false);

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("(basic node informations)");

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("(network permutation statistics)");

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("(node permutation statisctics)");

        jLabel10.setBackground(new java.awt.Color(255, 153, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Note: Use the File ->Export networks to export the generated networks");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel10.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(type1_jCheckBox)
                            .addComponent(type2_jCheckBox)
                            .addComponent(type3_jCheckBox))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type1_jCheckBox)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type2_jCheckBox)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type3_jCheckBox)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(15, 15, 15))
        );

        jStatusMessage.setForeground(new java.awt.Color(51, 51, 255));
        jStatusMessage.setText("Info");

        Name_jTextField.setText("jTextField2");
        Name_jTextField.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Matrix");

        jLabel8.setBackground(new java.awt.Color(0, 153, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Results");
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(0, 153, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Output directory");
        jLabel9.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Name_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jStatusMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cancel_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Export_jButton))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Export_jButton)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser chooser = new JFileChooser(config.getExplorerPath());
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setDialogType(JFileChooser.SAVE_DIALOG);
        chooser.setApproveButtonText("Select");
        chooser.setDialogTitle("Select output directory");
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            this.Directory_jTextField.setText(chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Cancel_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_jButtonActionPerformed
        this.status_run=false;
        this.setVisible(false);
    }//GEN-LAST:event_Cancel_jButtonActionPerformed

    private void Export_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Export_jButtonActionPerformed
        String directory=this.Directory_jTextField.getText();
        File f=new File(data.reference_data.filename);
        String filename=directory+File.separator+util.getFilename(f.getName());
        System.out.println(filename);
        data.output_csv(filename);
//        String solution2="";
//        if (data.state_strings.size()>0) {
//            solution2=data.state_strings.get(data.state_strings.size()-1);
//        }
//        if (this.edgelist_jCheckBox.isSelected()) data.export_edgelist(filename+"_"+solution2);
//
//        if (this.type0_jCheckBox.isSelected()) data.export_graphml(filename+"_"+solution2+"_complete",0);
//        if (this.type1_jCheckBox.isSelected())  data.export_graphml(filename+"_"+solution2+"_1",1);
//        if (this.type2_jCheckBox.isSelected()) data.export_graphml(filename+"_"+solution2+"_2",2);
//        if (this.type3_jCheckBox.isSelected()) data.export_graphml(filename+"_"+solution2+"_3",3);
//        if (this.type4_jCheckBox.isSelected()) data.export_graphml(filename+"_"+solution2+"_4",4);
        this.status_run=true;
        this.setVisible(false);
    }//GEN-LAST:event_Export_jButtonActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_jButton;
    private javax.swing.JTextField Directory_jTextField;
    private javax.swing.JButton Export_jButton;
    private javax.swing.JTextField Name_jTextField;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jStatusMessage;
    private javax.swing.JCheckBox type1_jCheckBox;
    private javax.swing.JCheckBox type2_jCheckBox;
    private javax.swing.JCheckBox type3_jCheckBox;
    // End of variables declaration//GEN-END:variables
}
