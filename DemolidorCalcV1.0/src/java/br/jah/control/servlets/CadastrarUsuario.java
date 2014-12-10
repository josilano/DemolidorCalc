/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jah.control.servlets;

import br.jah.model.DAO.ClienteDAO;
import br.jah.model.DAO.FuncionarioDAO;
import br.jah.model.DAO.UsuarioDAO;
import br.jah.model.POJO.Cliente;
import br.jah.model.POJO.Funcionario;
import br.jah.model.POJO.Usuario;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lano_2
 */
public class CadastrarUsuario extends HttpServlet {

    ClienteDAO clientedao;
    FuncionarioDAO funcionariodao;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("txtNome");
        String cpf = request.getParameter("txtCPF");
        String sexo = request.getParameter("txtSexo");
        String logradouroTipo = request.getParameter("txtLogradouroTipo");
        String logradouro = request.getParameter("txtLogradouro");
        String numero = request.getParameter("txtNumero");
        String complemento = request.getParameter("txtComplemento");
        String cidade = request.getParameter("txtCidade");
        String uf = request.getParameter("txtUF");
        String bairro = request.getParameter("txtBairro");
        String cep = request.getParameter("txtCEP");
        //String telefone = request.getParameter("txtTelefone"); falta implantar
        String tipoAposentadoria = request.getParameter("txtTipoAposentadoria");
        String rmi = request.getParameter("txtRMI");
        
        String cargo = request.getParameter("txtCargo");
        
        //converte para util.Date
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNasc = null;
        Date _DIB = null;
               
        try {
            boolean cadastro = false;
            if(cargo == null){//cadastrar cliente
                dataNasc = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("txtDataNascimento"));
                _DIB = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("txtDIB"));

                //converte para long e double
                long num = Long.parseLong(numero);
                double rMI = Double.parseDouble(rmi);

                //seta o objeto cliente
                Cliente cliente = new Cliente();
                cliente.setNome(nome);
                cliente.setCpf(cpf);
                cliente.setSexo(sexo);
                cliente.setDataNascimento(dataNasc);
                cliente.setLogradouroTipo(logradouroTipo);
                cliente.setLogradouro(logradouro);
                cliente.setNumero(num);
                cliente.setComplemento(complemento);
                cliente.setCidade(cidade);
                cliente.setUF(uf);
                cliente.setBairro(bairro);
                cliente.setCep(cep);
                cliente.setTipoAposentadoriaCliente(tipoAposentadoria);
                cliente.setRMI(rMI);
                cliente.setDIB(_DIB);

                //manda os dados do cliente para dao
                clientedao = new ClienteDAO();
                cadastro = clientedao.inserir(cliente);
                
            }else{//cadastrar funcionario
                dataNasc = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("txtDataNascimento"));                
                //converte para long
                long num = Long.parseLong(numero);

                //seta o objeto cliente
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(nome);
                funcionario.setCpf(cpf);
                funcionario.setSexo(sexo);
                funcionario.setDataNascimento(dataNasc);
                funcionario.setLogradouroTipo(logradouroTipo);
                funcionario.setLogradouro(logradouro);
                funcionario.setNumero(num);
                funcionario.setComplemento(complemento);
                funcionario.setCidade(cidade);
                funcionario.setUF(uf);
                funcionario.setBairro(bairro);
                funcionario.setCep(cep);
                funcionario.setCargo(cargo);

                //manda os dados do funcionario para dao
                funcionariodao = new FuncionarioDAO();
                cadastro = funcionariodao.inserir(funcionario);
            }
            
            RequestDispatcher reqDis = null;
            if(cadastro){
                request.setAttribute("mensagemDialogo", "Cadastrado com sucesso!");
                reqDis = request.getRequestDispatcher("/dialogo.jsp");
                reqDis.forward(request, response);
            }else{
                request.setAttribute("mensagemDialogo", "Erro ao cadastrar!");
                reqDis = request.getRequestDispatcher("/dialogo.jsp");
                reqDis.forward(request, response);
            }
        } catch (ClassNotFoundException | ParseException ex) {
            Logger.getLogger(CadastrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
