/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.jah.control.servlets;

import br.jah.model.DAO.UsuarioDAO;
import br.jah.model.POJO.Usuario;
import java.io.IOException;
import java.sql.SQLException;
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
 * @author 1946810
 */
public class Autenticacao extends HttpServlet {

    UsuarioDAO usuarioDAO;
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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
//        response.setContentType("text/html;charset-UTF=8");
//        String txtUsuario = request.getParameter("txtUsuario");
//        String txtSenha = request.getParameter("txtSenha");
//        
//        Usuario usuario = new Usuario();
//        usuario.setUsuario(txtUsuario);
//        usuario.setSenha(txtSenha);
//        //usuarioDAO.logar(request.getParameter("txtUsuario"), request.getParameter("txtSenha"));
//        RequestDispatcher reqDis = null;
//        usuarioDAO = new UsuarioDAO();
//            if(usuarioDAO.logar(usuario)){
//                HttpSession session = request.getSession();
//                session.setAttribute("sessaoUsuario", request.getParameter("txtUsuario"));
//                reqDis = request.getRequestDispatcher("/paginaInicial.jsp");
//                reqDis.forward(request, response);
//            }else{
//                request.setAttribute("mensagemErro", "Usuário/Senha Inválidos!");
//                reqDis = request.getRequestDispatcher("/index.jsp");
//                reqDis.forward(request, response);
//            }
        
        
        String txtUsuario = request.getParameter("txtUsuario");
        String txtSenha = request.getParameter("txtSenha");
        
        usuarioDAO = new UsuarioDAO();
        Usuario usuario = usuarioDAO.getUsuario(txtUsuario, txtSenha);
        
        RequestDispatcher reqDis = null;
            if(usuario != null){
                HttpSession session = request.getSession();
                session.setAttribute("sessaoUsuario", txtUsuario);
                session.setAttribute("permissaomenu", usuario.getPermissao());
                session.setAttribute("idUsuario", usuario.getIdUsuario());
                reqDis = request.getRequestDispatcher("/paginaInicial.jsp");
                reqDis.forward(request, response);
            }else{
                request.setAttribute("mensagemErro", "Usuário/Senha Inválidos!");
                reqDis = request.getRequestDispatcher("/index.jsp");
                reqDis.forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Autenticacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Autenticacao.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Autenticacao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erro classnotfound");
        } catch (SQLException ex) {
            Logger.getLogger(Autenticacao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erro sqlexception");
        }
    }

}
