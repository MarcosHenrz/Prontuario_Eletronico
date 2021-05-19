/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import modelo.beans.BeansPaciente;
import modeloDAO.DaoPaciente;

/**
 *
 * @author PC
 */
public class FormPaciente extends javax.swing.JFrame {

    
    public FormPaciente() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jTextFieldNum = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomePaciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldNascimento = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRG = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldFone = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablePacientes = new javax.swing.JTable();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCartaoSus = new javax.swing.JTextField();
        jButtonCarregarCampos = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCodPac = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setEnabled(false);
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Rua");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(1, 56, 24, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Nº");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(669, 52, 16, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Bairro:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(11, 86, 40, 17);
        jPanel2.add(jTextFieldRua);
        jTextFieldRua.setBounds(59, 45, 571, 28);
        jPanel2.add(jTextFieldNum);
        jTextFieldNum.setBounds(720, 48, 89, 28);
        jPanel2.add(jTextFieldBairro);
        jTextFieldBairro.setBounds(69, 84, 241, 24);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 220, 950, 170);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Pacientes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 10, 189, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 80, 41, 17);

        jTextFieldNomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePacienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomePaciente);
        jTextFieldNomePaciente.setBounds(220, 70, 400, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Data de Nascimento:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 180, 128, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("RG:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(670, 80, 23, 17);
        getContentPane().add(jFormattedTextFieldNascimento);
        jFormattedTextFieldNascimento.setBounds(300, 170, 179, 30);
        getContentPane().add(jFormattedTextFieldRG);
        jFormattedTextFieldRG.setBounds(720, 70, 218, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(530, 180, 86, 17);
        getContentPane().add(jFormattedTextFieldFone);
        jFormattedTextFieldFone.setBounds(600, 170, 175, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Endereço:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 200, 70, 17);

        jTablePacientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "RG", "CPF", "Numero Cartão SUS", "Data Nascimento", "Telefone", "Rua", "Numero", "Bairro"
            }
        ));
        jScrollPane4.setViewportView(jTablePacientes);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(10, 390, 950, 180);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(20, 30, 80, 23);

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlterar);
        jButtonAlterar.setBounds(20, 70, 80, 23);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir);
        jButtonExcluir.setBounds(20, 100, 80, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 410, 452, 402);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("CPF");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(180, 130, 24, 17);

        jFormattedTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCPFActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldCPF);
        jFormattedTextFieldCPF.setBounds(230, 120, 210, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Cartão do SUS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(460, 130, 100, 17);
        getContentPane().add(jTextFieldCartaoSus);
        jTextFieldCartaoSus.setBounds(600, 120, 310, 30);

        jButtonCarregarCampos.setText("Carregar Campos");
        jButtonCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarCamposActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCarregarCampos);
        jButtonCarregarCampos.setBounds(10, 160, 130, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Código");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(160, 40, 50, 20);
        getContentPane().add(jTextFieldCodPac);
        jTextFieldCodPac.setBounds(220, 30, 70, 30);

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(20, 130, 90, 23);

        setSize(new java.awt.Dimension(1009, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        BeansPaciente pac = new BeansPaciente();
        pac.setCodPaciente(Integer.parseInt(jTextFieldCodPac.getText()));
        pac.setNomePaciente(jTextFieldNomePaciente.getText());
        pac.setDtNascimento(jFormattedTextFieldNascimento.getText());
        pac.setRg(jFormattedTextFieldRG.getText());
        pac.setCpf(jFormattedTextFieldCPF.getText());
        pac.setNumCartaoSus(Integer.parseInt(jTextFieldCartaoSus.getText()));
        pac.setTelefone(jFormattedTextFieldFone.getText());
        pac.setRua(jTextFieldRua.getText());
        pac.setNum_casa(Integer.parseInt(jTextFieldNum.getText()));
        pac.setBairro(jTextFieldBairro.getText());
       
        DaoPaciente pacDao = new DaoPaciente();
        pacDao.salvar(pac);
        JOptionPane.showMessageDialog(this, "Salvo");
        
        listarTabela();  
       
         jTextFieldCodPac.setText("");
        jTextFieldNomePaciente.setText("");
        jFormattedTextFieldRG.setText("");
        jFormattedTextFieldCPF.setText("");
        jTextFieldCartaoSus.setText("");
        jFormattedTextFieldNascimento.setText("");
        jFormattedTextFieldFone.setText("");
        jTextFieldRua.setText("");
        jTextFieldNum.setText("");
        jTextFieldBairro.setText("");
         
                                               
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldNomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomePacienteActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        BeansPaciente pac = new BeansPaciente();
        pac.setCodPaciente(Integer.parseInt(jTextFieldCodPac.getText()));
        pac.setNomePaciente(jTextFieldNomePaciente.getText());
        pac.setDtNascimento(jFormattedTextFieldNascimento.getText());
        pac.setRg(jFormattedTextFieldRG.getText());
        pac.setCpf(jFormattedTextFieldCPF.getText());
        pac.setNumCartaoSus(Integer.parseInt(jTextFieldCartaoSus.getText()));
        pac.setTelefone(jFormattedTextFieldFone.getText());
        pac.setRua(jTextFieldRua.getText());
        pac.setNum_casa(Integer.parseInt(jTextFieldNum.getText()));
        pac.setBairro(jTextFieldBairro.getText());
        
        
       
        DaoPaciente pacDao = new DaoPaciente();
        pacDao.alterar(pac);
        JOptionPane.showMessageDialog(this, "Alterado");
        
        listarTabela();  
       
        jTextFieldCodPac.setText("");
        jTextFieldNomePaciente.setText("");
        jFormattedTextFieldRG.setText("");
        jFormattedTextFieldCPF.setText("");
        jTextFieldCartaoSus.setText("");
        jFormattedTextFieldNascimento.setText("");
        jFormattedTextFieldFone.setText("");
        jTextFieldRua.setText("");
        jTextFieldNum.setText("");
        jTextFieldBairro.setText("");
       
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
     int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?", "Confirma Exclusão", JOptionPane.YES_NO_OPTION);  
        
    if (resposta == 0){ 
        BeansPaciente pac = new BeansPaciente();
        pac.setCodPaciente(Integer.parseInt(jTextFieldCodPac.getText()));
       
        DaoPaciente pacDao = new DaoPaciente();
        pacDao.excluir(pac);
        JOptionPane.showMessageDialog(this, "Deletado");
    }
    
     listarTabela();  
       
   
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jFormattedTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCPFActionPerformed

    private void jButtonCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarCamposActionPerformed
        CarregarCampos();
    }//GEN-LAST:event_jButtonCarregarCamposActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
       String nome = jTextFieldNomePaciente.getText();
       this.listarTabelaNomes(nome);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    
    public void listarTabela(){
      
       DefaultTableModel val = (DefaultTableModel) jTablePacientes.getModel();
       val.getDataVector().removeAllElements();
       DaoPaciente pacDao = new DaoPaciente();
       List <BeansPaciente> usuario = pacDao.listarPaciente();
       int i = 0;
       while(usuario.size() > i){
           
       val.addRow(new Object[] {usuario.get(i).getCodPaciente(),  usuario.get(i).getNomePaciente(), usuario.get(i).getRg(), usuario.get(i).getCpf(), usuario.get(i).getNumCartaoSus(),usuario.get(i).getDtNascimento(), usuario.get(i).getTelefone(), usuario.get(i).getRua(), usuario.get(i).getNum_casa(), usuario.get(i).getBairro()});
       i++;
       }
    } 
    
    public void listarTabelaNomes(String nome){
      
       DefaultTableModel val = (DefaultTableModel) jTablePacientes.getModel();
       val.getDataVector().removeAllElements();
       DaoPaciente pacDao = new DaoPaciente();
       List <BeansPaciente> usuario = pacDao.pesquisarPaciente(nome);
       int i = 0;
       while(usuario.size() > i){
           
       val.addRow(new Object[] {usuario.get(i).getCodPaciente(),  usuario.get(i).getNomePaciente(), usuario.get(i).getRg(), usuario.get(i).getCpf(), usuario.get(i).getNumCartaoSus(),usuario.get(i).getDtNascimento(), usuario.get(i).getTelefone(), usuario.get(i).getRua(), usuario.get(i).getNum_casa(), usuario.get(i).getBairro()});
       i++;
       }
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
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPaciente().setVisible(true);
            }
        });
    }
    
     public void CarregarCampos(){
        int setar = jTablePacientes.getSelectedRow();
        
        jTextFieldCodPac.setText(jTablePacientes.getModel().getValueAt(setar, 0).toString());
        jTextFieldNomePaciente.setText(jTablePacientes.getModel().getValueAt(setar, 1).toString());
        jFormattedTextFieldRG.setText(jTablePacientes.getModel().getValueAt(setar, 2).toString());
        jFormattedTextFieldCPF.setText(jTablePacientes.getModel().getValueAt(setar, 3).toString());
        jTextFieldCartaoSus.setText(jTablePacientes.getModel().getValueAt(setar, 4).toString());
        jFormattedTextFieldNascimento.setText(jTablePacientes.getModel().getValueAt(setar, 5).toString());
        jFormattedTextFieldFone.setText(jTablePacientes.getModel().getValueAt(setar, 6).toString());
        jTextFieldRua.setText(jTablePacientes.getModel().getValueAt(setar, 7).toString());
        jTextFieldNum.setText(jTablePacientes.getModel().getValueAt(setar, 8).toString());
        jTextFieldBairro.setText(jTablePacientes.getModel().getValueAt(setar, 9).toString());
        
    }
     
     public void apagarCampos(){
       jTextFieldCodPac.setText("");
       jTextFieldNomePaciente.setText("");
       jFormattedTextFieldRG.setText("");
       jFormattedTextFieldCPF.setText("");
       jTextFieldCartaoSus.setText("");
       jFormattedTextFieldNascimento.setText("");
       jFormattedTextFieldFone.setText("");
       jTextFieldRua.setText("");
       jTextFieldNum.setText("");
       jTextFieldBairro.setText("");
   
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCarregarCampos;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone;
    private javax.swing.JFormattedTextField jFormattedTextFieldNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldRG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTablePacientes;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCartaoSus;
    private javax.swing.JTextField jTextFieldCodPac;
    private javax.swing.JTextField jTextFieldNomePaciente;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JTextField jTextFieldRua;
    // End of variables declaration//GEN-END:variables
}
