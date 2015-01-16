/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.jah.model.DAO;

import br.jah.model.POJO.Cliente;
import br.jah.model.POJO.Usuario;
import br.jah.model.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1946810
 */
public class ClienteDAO {
    
    
    private Connection con;
    
    
    //private String dao;
    
    public ClienteDAO() throws ClassNotFoundException{
        this.con =  new ConnectionFactory().getConnection();
        System.out.println("Conexão realizada com sucesso");
    }
    
    public boolean inserir(Cliente cliente){
        String sql = "INSERT INTO clientes (clie_nome, clie_cpf, clie_sexo,"
                + "clie_data_nascimento, clie_logradouro_tipo, clie_logradouro,"
                + "clie_numero, clie_complemento, clie_cidade, clie_uf,"
                + "clie_bairro, clie_cep, clie_tipo_aposentadoria,"
                + "clie_rmi, clie_dib) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getSexo());
            ps.setDate(4, new Date(cliente.getDataNascimento().getTime()));
            ps.setString(5, cliente.getLogradouroTipo());
            ps.setString(6, cliente.getLogradouro());
            ps.setLong(7, cliente.getNumero());
            ps.setString(8, cliente.getComplemento());
            ps.setString(9, cliente.getCidade());
            ps.setString(10, cliente.getUF());
            ps.setString(11, cliente.getBairro());
            ps.setString(12, cliente.getCep());
            ps.setString(13, cliente.getTipoAposentadoriaCliente());
            ps.setDouble(14, (cliente.getRMI()));
            ps.setDate(15, new Date(cliente.getDIB().getTime()));
            
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
    
    public boolean calcularTempoServico(Cliente idCliente, List<Cliente> listaEmpresas){
        String sql = "INSERT INTO tempoServico (id_c, dataE, dataS, tempo_comum, tempoConver) VALUES (?, ?, ?, ?, ?)";
        
        for(Cliente teste: listaEmpresas){
            long tempoComum = calcTempoComum(teste.getDataS(), teste.getDataE());
            long tempoConvertido = calcTempoConvertido(teste.getDataS(), teste.getDataE());
            
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idCliente.getId());
                ps.setDate(2, new Date(teste.getDataE().getTime()));
                ps.setDate(3, new Date(teste.getDataS().getTime()));
                ps.setLong(4, tempoComum);
                ps.setLong(5, tempoConvertido);

                int testeupdate = ps.executeUpdate();
                    if(testeupdate == 1){
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
        }
        return false;
    }
    
//    private GregorianCalendar calcTempoComum(String dataS, String dataE){
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Calendar cal = Calendar.getInstance();
//        try {
//            cal.setTime(sdf.parse(dataS));
//            long tempoComum = cal.setTime(sdf.parse(dataS)).getTimeInMillis() - cal.setTime(sdf.parse(dataE));
//            return tempoComum;
//        } catch (ParseException ex) {
//            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
    
    //calcula o tempo comum por cada empresa que o cliente passou
    private long calcTempoComum(java.util.Date dataS, java.util.Date dataE){
        long tempoComum = dataS.getTime() - dataE.getTime();
        return tempoComum /(24 * 60 * 60 * 100);
    }
    
    //calcula o tempo insalubre por cada empresa caso seja especial (por enquanto, somente para homens)
    private long calcTempoConvertido(java.util.Date dataS, java.util.Date dataE){
        long tempoConvertido = dataS.getTime() - dataE.getTime();
        tempoConvertido = (long) (tempoConvertido * 1.4 /(24 * 60 * 60 * 100));
        return tempoConvertido;
    }
    
    public List<Cliente> converteParaGregCal(List<Cliente> lista){
        for(Cliente testeConversao: lista){
            
        }
        return null;
    }
    
    //método para calcular tempo de serviço
    public List<Cliente> addNaLista(Date dataE1, Date dataE2, Date dataE3,
            Date dataE4, Date dataE5, Date dataE6, Date dataE7, Date dataE8,
            Date dataE9, Date dataE10){
        List<Cliente> lista = new ArrayList<>();
        Cliente teste = new Cliente();
            teste.setDataE(dataE1);
            lista.set(0, teste);
            teste.setDataE(dataE2);
            lista.set(1, teste);
            teste.setDataE(dataE3);
            lista.set(2, teste);
            teste.setDataE(dataE4);
            lista.set(3, teste);
            teste.setDataE(dataE5);
            lista.set(4, teste);
            teste.setDataE(dataE6);
            lista.set(5, teste);
            teste.setDataE(dataE7);
            lista.set(6, teste);
            teste.setDataE(dataE8);
            lista.set(7, teste);
            teste.setDataE(dataE9);
            lista.set(8, teste);
            teste.setDataE(dataE10);
            lista.set(9, teste);
        return lista;
    }
    
    public List<Cliente> getListaClientes(){
         
         System.out.println("Acessou");
         
        String sql = "SELECT clie_id, clie_nome, clie_cpf, clie_sexo, clie_data_nascimento,"
                + "clie_logradouro_tipo, clie_logradouro, clie_numero, clie_complemento,"
                + "clie_cidade, clie_uf, clie_bairro, clie_cep, clie_tipo_aposentadoria, "
                + "clie_rmi, clie_dib FROM clientes";
                
        List<Cliente> lista = new ArrayList<>();
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet result = ps.executeQuery();
                while(result.next()){
                    Cliente cliente = new Cliente();
                    cliente.setId(result.getInt("clie_id"));
                    cliente.setNome(result.getString("clie_nome"));
                    cliente.setCpf(result.getString("clie_cpf"));
                    cliente.setSexo(result.getString("clie_sexo"));
                    cliente.setDataNascimento(result.getDate("clie_data_nascimento"));
                    cliente.setLogradouroTipo(result.getString("clie_logradouro_tipo"));
                    cliente.setLogradouro(result.getString("clie_logradouro"));
                    cliente.setNumero(result.getLong("clie_numero"));
                    cliente.setComplemento(result.getString("clie_complemento"));
                    cliente.setCidade(result.getString("clie_cidade"));
                    cliente.setUF(result.getString("clie_uf"));
                    cliente.setBairro(result.getString("clie_bairro"));
                    cliente.setCep(result.getString("clie_cep"));
                    cliente.setTipoAposentadoriaCliente(result.getString("clie_tipo_aposentadoria"));
                    cliente.setRMI(result.getDouble("clie_rmi"));
                    cliente.setDIB(result.getDate("clie_dib"));
                    lista.add(cliente);
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

//    public boolean pedidoSuporte(String txtSuporte) {
//        
//    }
    public boolean pedidoSuporte(int idCliente, String suporte){
        String sql = "INSERT INTO suporte (log_id, sup_texto) VALUES (?, ?)";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idCliente);
            ps.setString(2, suporte);

            int testeupdate = ps.executeUpdate();
                if(testeupdate == 1){
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
    
    public Cliente seleciona(int idCliente){
         
         System.out.println("Acessou");
         
        String sql = "SELECT clie_id, clie_nome, clie_cpf, clie_sexo, clie_data_nascimento,"
                + "clie_logradouro_tipo, clie_logradouro, clie_numero, clie_complemento,"
                + "clie_cidade, clie_uf, clie_bairro, clie_cep, clie_tipo_aposentadoria, "
                + "clie_rmi, clie_dib FROM clientes WHERE clie_id = ?";
                
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idCliente);
            ResultSet result = ps.executeQuery();
                if(result.next()){
                    Cliente cliente = new Cliente();
                    cliente.setId(result.getInt("clie_id"));
                    cliente.setNome(result.getString("clie_nome"));
                    cliente.setCpf(result.getString("clie_cpf"));
                    cliente.setSexo(result.getString("clie_sexo"));
                    cliente.setDataNascimento(result.getDate("clie_data_nascimento"));
                    cliente.setLogradouroTipo(result.getString("clie_logradouro_tipo"));
                    cliente.setLogradouro(result.getString("clie_logradouro"));
                    cliente.setNumero(result.getLong("clie_numero"));
                    cliente.setComplemento(result.getString("clie_complemento"));
                    cliente.setCidade(result.getString("clie_cidade"));
                    cliente.setUF(result.getString("clie_uf"));
                    cliente.setBairro(result.getString("clie_bairro"));
                    cliente.setCep(result.getString("clie_cep"));
                    cliente.setTipoAposentadoriaCliente(result.getString("clie_tipo_aposentadoria"));
                    cliente.setRMI(result.getDouble("clie_rmi"));
                    cliente.setDIB(result.getDate("clie_dib"));
                    return cliente;
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
