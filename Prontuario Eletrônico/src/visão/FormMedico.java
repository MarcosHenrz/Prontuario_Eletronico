/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modeloDAO.DaoMedico;
import modelo.beans.BeansMedico;

/**
 *
 * @author PC
 */
public class FormMedico extends javax.swing.JFrame {
    
  
    
    public FormMedico() {
        initComponents();
        listarTabela();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldCRM = new javax.swing.JFormattedTextField();
        jTextFieldNomeMedico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxEspecialidade = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedicos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldIDmedico = new javax.swing.JTextField();
        jLabelRG = new javax.swing.JLabel();
        jFormattedTextFieldRGMedico = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextCPFMedico = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldFoneMedico = new javax.swing.JFormattedTextField();
        jButtonCarregarCampos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Médicos");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 10, 190, 22);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(40, 30, 80, 23);

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar);
        jButtonEditar.setBounds(40, 70, 80, 23);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir);
        jButtonExcluir.setBounds(40, 110, 80, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 80, 60, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CRM");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 120, 28, 17);
        getContentPane().add(jFormattedTextFieldCRM);
        jFormattedTextFieldCRM.setBounds(240, 120, 160, 30);
        getContentPane().add(jTextFieldNomeMedico);
        jTextFieldNomeMedico.setBounds(240, 70, 260, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Especialidade");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(530, 70, 90, 20);

        jComboBoxEspecialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Clinico Geral", "Cardiologia", "Pediatria", "Ginecologia" }));
        jComboBoxEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEspecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxEspecialidade);
        jComboBoxEspecialidade.setBounds(630, 70, 120, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CRM", "RG", "CPF", "Especialidade", "Telefone"
            }
        ));
        jTableMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMedicos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 250, 840, 260);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ID:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 40, 19, 17);

        jTextFieldIDmedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDmedicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIDmedico);
        jTextFieldIDmedico.setBounds(240, 40, 30, 20);

        jLabelRG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRG.setText("RG");
        getContentPane().add(jLabelRG);
        jLabelRG.setBounds(440, 120, 18, 17);

        jFormattedTextFieldRGMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldRGMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldRGMedico);
        jFormattedTextFieldRGMedico.setBounds(470, 120, 230, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("CPF");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 170, 40, 20);
        getContentPane().add(jFormattedTextCPFMedico);
        jFormattedTextCPFMedico.setBounds(240, 170, 180, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Telefone");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 170, 60, 20);
        getContentPane().add(jFormattedTextFieldFoneMedico);
        jFormattedTextFieldFoneMedico.setBounds(550, 170, 180, 30);

        jButtonCarregarCampos.setText("Carregar Campos");
        jButtonCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarCamposActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCarregarCampos);
        jButtonCarregarCampos.setBounds(20, 190, 140, 30);

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 150, 100, 23);

        setSize(new java.awt.Dimension(865, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        BeansMedico med = new BeansMedico();
        med.setId_medico(Integer.parseInt(jTextFieldIDmedico.getText()));
        med.setNome(jTextFieldNomeMedico.getText());
        med.setCrm(Integer.parseInt(jFormattedTextFieldCRM.getText()));
        med.setRg(jFormattedTextFieldRGMedico.getText());
        med.setCpf(jFormattedTextCPFMedico.getText());
        med.setEspecialidade((String) jComboBoxEspecialidade.getSelectedItem());
        med.setTelefone(jFormattedTextFieldFoneMedico.getText());
        

        DaoMedico medDao = new DaoMedico();
        medDao.salvar(med);
        JOptionPane.showMessageDialog(this, "Salvo");
        
        listarTabela();
        limparCampos();
       
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        BeansMedico med = new BeansMedico();
        med.setId_medico(Integer.parseInt(jTextFieldIDmedico.getText()));
        med.setNome(jTextFieldNomeMedico.getText());
        med.setCrm(Integer.parseInt(jFormattedTextFieldCRM.getText()));
        med.setRg(jFormattedTextFieldRGMedico.getText());
        med.setCpf(jFormattedTextCPFMedico.getText());
        med.setEspecialidade((String) jComboBoxEspecialidade.getSelectedItem());
        med.setTelefone(jFormattedTextFieldFoneMedico.getText());

        DaoMedico medDao = new DaoMedico();
        medDao.alterar(med);
        JOptionPane.showMessageDialog(this, "Alterado");
        
        listarTabela();
        limparCampos();
              
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
      int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir??", "Confirma Exclusão", JOptionPane.YES_NO_OPTION);
        
      if (resposta == 0) {
        BeansMedico med = new BeansMedico();
        med.setId_medico(Integer.parseInt(jTextFieldIDmedico.getText()));
       
        DaoMedico medDao = new DaoMedico();
        medDao.excluir(med);
        JOptionPane.showMessageDialog(this, "Deletado");
      }
        listarTabela();
        limparCampos();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        
    }//GEN-LAST:event_formMouseClicked

    private void jTableMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicosMouseClicked

        
    }//GEN-LAST:event_jTableMedicosMouseClicked

    private void jTextFieldIDmedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDmedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDmedicoActionPerformed

    private void jFormattedTextFieldRGMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldRGMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldRGMedicoActionPerformed

    private void jButtonCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarCamposActionPerformed
       CarregarCampos();
    }//GEN-LAST:event_jButtonCarregarCamposActionPerformed

    private void jComboBoxEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEspecialidadeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String nome = jTextFieldNomeMedico.getText();
       this.listarTabelaNomes(nome);
    }//GEN-LAST:event_jButton1ActionPerformed

     public void listarTabela(){
      
       DefaultTableModel val = (DefaultTableModel) jTableMedicos.getModel();
       val.getDataVector().removeAllElements();
       DaoMedico medDao = new DaoMedico();
       List <BeansMedico> medico = medDao.listarMedicos();
       int i = 0;
       while(medico.size() > i){
           
       val.addRow(new Object[] {medico.get(i).getId_medico(), String.valueOf(medico.get(i).getNome()), medico.get(i).getCrm(),medico.get(i).getRg(), medico.get(i).getCpf(), medico.get(i).getEspecialidade(), medico.get(i).getTelefone()});
       i++;
       }
    } 
     
    public void listarTabelaNomes(String nome){
      
       DefaultTableModel val = (DefaultTableModel) jTableMedicos.getModel();
       val.getDataVector().removeAllElements();
       DaoMedico medDao = new DaoMedico();
       List <BeansMedico> medico = medDao.pesquisarMedicos(nome);
       int i = 0;
       while(medico.size() > i){
           
       val.addRow(new Object[] {medico.get(i).getId_medico(), String.valueOf(medico.get(i).getNome()), medico.get(i).getCrm(),medico.get(i).getRg(), medico.get(i).getCpf(), medico.get(i).getEspecialidade(), medico.get(i).getTelefone()});
       i++;
       }
    } 
       
    
    public void CarregarCampos(){
        int setar = jTableMedicos.getSelectedRow();
        
        jTextFieldIDmedico.setText(jTableMedicos.getModel().getValueAt(setar, 0).toString());
        jTextFieldNomeMedico.setText(jTableMedicos.getModel().getValueAt(setar, 1).toString());
        jFormattedTextFieldCRM.setText(jTableMedicos.getModel().getValueAt(setar, 2).toString());
        jFormattedTextFieldRGMedico.setText(jTableMedicos.getModel().getValueAt(setar, 3).toString());
        jFormattedTextCPFMedico.setText(jTableMedicos.getModel().getValueAt(setar, 4).toString());
        jComboBoxEspecialidade.setSelectedItem(jTableMedicos.getModel().getValueAt(setar, 5).toString());
        jFormattedTextFieldFoneMedico.setText(jTableMedicos.getModel().getValueAt(setar, 6).toString());
    }
         
    public void limparCampos(){
        jTextFieldIDmedico.setText("");
        jTextFieldNomeMedico.setText("");
        jFormattedTextFieldCRM.setText("");
        jFormattedTextFieldRGMedico.setText("");
        jFormattedTextCPFMedico.setText("");
        jComboBoxEspecialidade.setSelectedItem("Selecione");
        jFormattedTextFieldFoneMedico.setText("");
  }
   
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCarregarCampos;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxEspecialidade;
    private javax.swing.JFormattedTextField jFormattedTextCPFMedico;
    private javax.swing.JFormattedTextField jFormattedTextFieldCRM;
    private javax.swing.JFormattedTextField jFormattedTextFieldFoneMedico;
    private javax.swing.JFormattedTextField jFormattedTextFieldRGMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedicos;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldIDmedico;
    private javax.swing.JTextField jTextFieldNomeMedico;
    // End of variables declaration//GEN-END:variables
}
