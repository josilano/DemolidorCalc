/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.jah.model.DAO;


import br.jah.model.POJO.Cliente;
import br.jah.model.POJO.Funcionario;
import br.jah.model.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1946810
 */
public class FuncionarioDAO {
    
    
    private Connection con;
    
     public FuncionarioDAO() throws ClassNotFoundException{
        this.con =  new ConnectionFactory().getConnection();
        System.out.println("Conexão realizada com sucesso");
    }
    
    public boolean inserir(Funcionario funcionario){
        String sql = "INSERT INTO funcionarios (func_nome, func_cpf, func_sexo,"
                + "func_data_nascimento, func_logradouro_tipo, func_logradouro,"
                + "func_numero, func_complemento, func_cidade, func_uf,"
                + "func_bairro, func_cep, func_cargo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getCpf());
            ps.setString(3, funcionario.getSexo());
            ps.setDate(4, new Date(funcionario.getDataNascimento().getTime()));
            ps.setString(5, funcionario.getLogradouroTipo());
            ps.setString(6, funcionario.getLogradouro());
            ps.setLong(7, funcionario.getNumero());
            ps.setString(8, funcionario.getComplemento());
            ps.setString(9, funcionario.getCidade());
            ps.setString(10, funcionario.getUF());
            ps.setString(11, funcionario.getBairro());
            ps.setString(12, funcionario.getCep());
            ps.setString(13, funcionario.getCargo());
            
            int teste = ps.executeUpdate();
                if(teste == 1){
                    return true;  
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
        return false;
    }
    
    public List<Funcionario> getListaFuncionarios(){
         
         System.out.println("Acessou");
         
        String sql = "SELECT func_id, func_nome, func_cpf, func_sexo, func_data_nascimento,"
                + "func_logradouro_tipo, func_logradouro, func_numero, func_complemento,"
                + "func_cidade, func_uf, func_bairro, func_cep, func_cargo"
                + " FROM funcionarios";
                    
        List<Funcionario> lista = new ArrayList<>();
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet result = ps.executeQuery();
                while(result.next()){
                    Funcionario funcionario = new Funcionario();
                    funcionario.setId(result.getInt("func_id"));
                    funcionario.setNome(result.getString("func_nome"));
                    funcionario.setCpf(result.getString("func_cpf"));
                    funcionario.setSexo(result.getString("func_sexo"));
                    funcionario.setDataNascimento(result.getDate("func_data_nascimento"));
                    funcionario.setLogradouroTipo(result.getString("func_logradouro_tipo"));
                    funcionario.setLogradouro(result.getString("func_logradouro"));
                    funcionario.setNumero(result.getLong("func_numero"));
                    funcionario.setComplemento(result.getString("func_complemento"));
                    funcionario.setCidade(result.getString("func_cidade"));
                    funcionario.setUF(result.getString("func_uf"));
                    funcionario.setBairro(result.getString("func_bairro"));
                    funcionario.setCep(result.getString("func_cep"));
                    funcionario.setCargo(result.getString("func_cargo"));
                    
                    lista.add(funcionario);
                }
                    return lista;
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
