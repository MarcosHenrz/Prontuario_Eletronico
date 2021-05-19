/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class DAO {
    
    public Connection conecta(){ 
        try {
            String url = "jdbc:postgresql://localhost:5432/APS";
            String usuario = "postgres";
            String senha = "1234"; 
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);            
        }
    }
    
}
