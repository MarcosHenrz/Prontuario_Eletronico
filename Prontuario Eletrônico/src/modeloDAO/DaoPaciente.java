/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.beans.BeansPaciente;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.beans.BeansUsuario;



public class DaoPaciente {
    
    private Connection conecta;
   
   public DaoPaciente(){
       this.conecta = new DAO().conecta();
   }
   
   
    
    
    public void salvar (BeansPaciente pac){
        String sql = "insert into tb_pacientes(cod_paciente, nome_paciente,nasc_paciente, rg_paciente, cpf_paciente, num_cartão_sus, fone_paciente, rua_paciente, num_casa, bairro_paciente) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, pac.getCodPaciente());
            stmt.setString(2, pac.getNomePaciente());
            stmt.setString(3, pac.getDtNascimento());
            stmt.setString(4, pac.getRg());
            stmt.setString(5, pac.getCpf());
            stmt.setInt(6, pac.getNumCartaoSus());
            stmt.setString(7, pac.getTelefone());
            stmt.setString(8, pac.getRua());
            stmt.setInt(9, pac.getNum_casa());
            stmt.setString(10, pac.getBairro());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro: " + e);
        }
    }
    
    public void alterar(BeansPaciente pac){
        
        String sql = "update tb_pacientes set nome_paciente=?, nasc_paciente=?, rg_paciente=?, cpf_paciente=?, num_cartão_sus=?, fone_paciente=?, rua_paciente=?, num_casa =?, bairro_paciente=? where cod_paciente=?";
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, pac.getNomePaciente());
            stmt.setString(2, pac.getDtNascimento());
            stmt.setString(3, pac.getRg());
            stmt.setString(4,pac.getCpf());
            stmt.setInt(5, pac.getNumCartaoSus());
            stmt.setString(6, pac.getTelefone());
            stmt.setString(7, pac.getRua());
            stmt.setInt(8, pac.getNum_casa());
            stmt.setString(9, pac.getBairro());
            stmt.setInt(10, pac.getCodPaciente());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro: " + e);
        }   
    }

     public List<BeansPaciente> pesquisarPaciente(String nome){
         String sql = "select * from tb_pacientes where nome_paciente like ? order by nome_paciente";
         ResultSet rs;
         List<BeansPaciente> paciente = new ArrayList<BeansPaciente>();
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, nome);
            rs = stmt.executeQuery();
            while(rs.next()){
            BeansPaciente pac = new BeansPaciente();
            pac.setCodPaciente(Integer.parseInt(rs.getString("cod_paciente")));
            pac.setNomePaciente(rs.getString("nome_paciente"));
            pac.setDtNascimento(rs.getString("nasc_paciente"));
            pac.setRg(rs.getString("rg_paciente"));
            pac.setCpf(rs.getString("cpf_paciente"));
            pac.setNumCartaoSus(Integer.parseInt(rs.getString("num_cartão_sus")));
            pac.setTelefone(rs.getString("fone_paciente"));
            pac.setRua(rs.getString("rua_paciente"));
            pac.setNum_casa(rs.getInt("num_casa"));
            pac.setBairro(rs.getString("bairro_paciente"));
            paciente.add(pac);
            }
            rs.close();
            stmt.close();
           return paciente;
        } catch (SQLException e) {
            throw new RuntimeException("Erro: " + e);
        }
      
     }


    
    
    public void excluir(BeansPaciente pac){
        String sql = "delete from tb_pacientes where cod_paciente=?";           
             
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, pac.getCodPaciente());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro: " + ex);
        }
       
    }
    

       
     public List<BeansPaciente> listarPaciente(){
         String sql = "select * from tb_pacientes";
         ResultSet rs;
         List<BeansPaciente> paciente = new ArrayList<BeansPaciente>();
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
            BeansPaciente pac = new BeansPaciente();
            pac.setCodPaciente(Integer.parseInt(rs.getString("cod_paciente")));
            pac.setNomePaciente(rs.getString("nome_paciente"));
            pac.setDtNascimento(rs.getString("nasc_paciente"));
            pac.setRg(rs.getString("rg_paciente"));
            pac.setCpf(rs.getString("cpf_paciente"));
            pac.setNumCartaoSus(Integer.parseInt(rs.getString("num_cartão_sus")));
            pac.setTelefone(rs.getString("fone_paciente"));
            pac.setRua(rs.getString("rua_paciente"));
            pac.setNum_casa(rs.getInt("num_casa"));
            pac.setBairro(rs.getString("bairro_paciente"));
            paciente.add(pac);
            }
            rs.close();
            stmt.close();
           return paciente;
        } catch (SQLException e) {
            throw new RuntimeException("Erro: " + e);
        }
      
     }
    
}
