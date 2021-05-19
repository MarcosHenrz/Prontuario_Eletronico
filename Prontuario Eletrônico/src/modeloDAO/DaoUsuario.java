/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;


import java.sql. *;
import java.util.ArrayList;
import java.util.List;
import modelo.beans.BeansUsuario;



public class DaoUsuario {
   private Connection conecta;
   
   public DaoUsuario(){
       this.conecta = new DAO().conecta();
   }
    
    
    public void salvar (BeansUsuario usuario){
        String sql = "insert into tb_usuarios(cod_usuario,nome_usuario,senha_usuario, tipo) values(?,?,?,?)";
        
        try {
            PreparedStatement stmt  = conecta.prepareStatement(sql);
            stmt.setInt(1, usuario.getCodUsuario());
            stmt.setString(2, usuario.getNomeUsuario());
            stmt.setString(3, usuario.getSenhaUsuario());
            stmt.setString(4, usuario.getTipo());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        
    }
    
    public void alterar(BeansUsuario usuario){
        String sql = "update tb_usuarios set nome_usuario=?, senha_usuario=?, tipo = ?  where cod_usuario=?";
      
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getSenhaUsuario());
            stmt.setString(3, usuario.getTipo());
            stmt.setInt(4, usuario.getCodUsuario());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException (e);
        }       
        
    }
    
    public List<BeansUsuario> pesquisarUsuarios(String nome){
        String sql = "select * from tb_usuarios where nome_usuario like ? order by nome_usuario";
        ResultSet rs;
        List<BeansUsuario> usuario = new ArrayList<BeansUsuario>();
        try{
           PreparedStatement stmt = conecta.prepareStatement(sql);
           stmt.setString(1, nome);
           rs = stmt.executeQuery();
           while(rs.next()){
               BeansUsuario usu = new BeansUsuario();
               usu.setCodUsuario(rs.getInt("cod_usuario"));
               usu.setNomeUsuario(rs.getString("nome_usuario"));
               usu.setSenhaUsuario(rs.getString("senha_usuario"));
               usu.setTipo(rs.getString("tipo"));
               usuario.add(usu);
           }
           rs.close();
           stmt.close();
           return  usuario;
        }catch (SQLException e) {
           throw new RuntimeException("Erro: " + e); 
        }
    }
    
    public void excluir(BeansUsuario mod){
         String sql = "delete from tb_usuarios where cod_usuario=?";          
        try {
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, mod.getCodUsuario());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException (e);
        }
        
    }
    
    
    public List<BeansUsuario> listarUsuarios(){
        String sql = "select * from tb_usuarios";
        ResultSet rs;
        List<BeansUsuario> usuario = new ArrayList<BeansUsuario>();
        try{
           PreparedStatement stmt = conecta.prepareStatement(sql);
           rs = stmt.executeQuery();
           while(rs.next()){
               BeansUsuario usu = new BeansUsuario();
               usu.setCodUsuario(rs.getInt("cod_usuario"));
               usu.setNomeUsuario(rs.getString("nome_usuario"));
               usu.setSenhaUsuario(rs.getString("senha_usuario"));
               usu.setTipo(rs.getString("tipo"));
               usuario.add(usu);
           }
           rs.close();
           stmt.close();
           return  usuario;
        }catch (SQLException e) {
           throw new RuntimeException("Erro: " + e); 
        }
    }
}
