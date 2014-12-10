/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.jah.model.DAO;

import br.jah.model.POJO.Usuario;
import br.jah.model.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 1946810
 */
public class UsuarioDAO {
    
    //Conexao con;
    private Connection con;
    
    //private String dao;
    
    public UsuarioDAO() throws ClassNotFoundException{
        this.con =  new ConnectionFactory().getConnection();
        System.out.println("Conexão realizada com sucesso");
    }
//    public void logar(String usuario, String senha) 
//            throws ClassNotFoundException, SQLException{
//        String sql = "SELECT log_usuario, log_senha FROM login WHERE log_usuario = ? AND log_senha = ?";
//        try{
//            Conexao.getConnection();
//            PreparedStatement ps = con.getConnection().prepareStatement(sql);
//            ps.setString(1, usuario);
//            ps.setString(2, senha);
//            ResultSet result = ps.executeQuery();
//                while(result.next()){
//                    
//                }
//        }catch(SQLException e){
//            
//        }
//    }
    
    public boolean logar(Usuario usuario) 
            throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM login WHERE log_usuario = ? AND log_senha = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getSenha());
            ResultSet result = ps.executeQuery();
                if(result.next()){
                    return true;  
                }
        }catch(SQLException e){
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            if(con != null){
                con.close();
                System.out.println("Desconectado!");
            }
        }
        return false;
    }
    
    public Usuario getUsuario(String nomeUsuario, String senha){
        String sql = "SELECT * FROM login WHERE log_usuario = ? AND log_senha = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nomeUsuario);
            ps.setString(2, senha);
            ResultSet result = ps.executeQuery();
                if(result.next()){
                    Usuario usuario = new Usuario();
                    usuario.setUsuario(nomeUsuario);
                    usuario.setSenha(senha);
                    usuario.setPermissao(result.getInt("log_permissao"));
                    usuario.setIdUsuario(result.getInt("log_id"));
                    return usuario;  
                }
        }catch(SQLException e){
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            if(con != null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Desconectado!");
            }
        }
        return null;
    }
}
