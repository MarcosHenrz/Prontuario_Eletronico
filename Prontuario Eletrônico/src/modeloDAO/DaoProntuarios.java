/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.beans.BeansProntuario;

/**
 *
 * @author PC
 */
public class DaoProntuarios {
     private Connection conecta;
    
    public DaoProntuarios(){
        this.conecta =  new DAO().conecta();
    }
    
    public void salvar(BeansProntuario prontuario){
        String sql = "insert into tb_prontuario (cod_prontuario, nome_paciente, diagnostico,exames, receitas, situação, localização) values(?,?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1,prontuario.getCodProntuario());
            stmt.setString(2, prontuario.getNomePaciente());
            stmt.setString(3,prontuario.getDiagnostico());
            stmt.setString(4,prontuario.getExame());
            stmt.setString(5,prontuario.getReceita());
            stmt.setString(6,prontuario.getSituaçao());
            stmt.setString(7,prontuario.getLocalização());
            stmt.execute();
            stmt.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void alterar(BeansProntuario prontuario){
        String sql = "update tb_prontuario set nome_paciente=?, diagnostico=?, exames=?, receitas=?, situação=?, localização=? where cod_prontuario=?";
        try{
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, prontuario.getNomePaciente());
            stmt.setString(2,prontuario.getDiagnostico());
            stmt.setString(3,prontuario.getExame());
            stmt.setString(4,prontuario.getReceita());
            stmt.setString(5,prontuario.getSituaçao());
            stmt.setString(6,prontuario.getLocalização());
            stmt.setInt(7,prontuario.getCodProntuario());
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        } 
    }
    
     public List<BeansProntuario> pesquisarProntuarios(String nome){
        String sql = "select * from tb_prontuario where nome_paciente like ? order by nome_paciente";
        ResultSet rs;
        List<BeansProntuario> prontuario = new ArrayList<BeansProntuario>();
        try{
           PreparedStatement stmt = conecta.prepareStatement(sql);
           stmt.setString(1, nome);
           rs = stmt.executeQuery();
           while(rs.next()){
               BeansProntuario p = new BeansProntuario();
               
               p.setCodProntuario(rs.getInt("cod_prontuario"));
               p.setNomePaciente(rs.getString("nome_paciente"));
               p.setDiagnostico(rs.getString("diagnostico"));
               p.setExame(rs.getString("exames"));
               p.setReceita(rs.getString("receitas"));
               p.setSituaçao(rs.getString("situação"));
               p.setLocalização(rs.getString("localização"));
               prontuario.add(p);
           }
           rs.close();
           stmt.close();
           return prontuario;
        }catch (SQLException e) {
            throw new RuntimeException (e);  
        }
    }
    
    public void excluir(BeansProntuario prontuario){
        String sql = "delete from tb_prontuario where cod_prontuario=?";
        try{
           PreparedStatement stmt = conecta.prepareStatement(sql);
           stmt.setInt(1, prontuario.getCodProntuario());
           stmt.execute();
           stmt.close();
        }catch(SQLException e){
           throw new RuntimeException(e);
        }
    }
        
        public List<BeansProntuario> listarProntuarios(){
        String sql = "select * from tb_prontuario";
        ResultSet rs;
        List<BeansProntuario> prontuario = new ArrayList<BeansProntuario>();
        try{
           PreparedStatement stmt = conecta.prepareStatement(sql);
           rs = stmt.executeQuery();
           while(rs.next()){
               BeansProntuario p = new BeansProntuario();
               
               p.setCodProntuario(rs.getInt("cod_prontuario"));
               p.setNomePaciente(rs.getString("nome_paciente"));
               p.setDiagnostico(rs.getString("diagnostico"));
               p.setExame(rs.getString("exames"));
               p.setReceita(rs.getString("receitas"));
               p.setSituaçao(rs.getString("situação"));
               p.setLocalização(rs.getString("localização"));
               prontuario.add(p);
           }
           rs.close();
           stmt.close();
           return prontuario;
        }catch (SQLException e) {
            throw new RuntimeException (e);  
        }
      
    }
}
