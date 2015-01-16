/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.jah.control.servlets;

import br.jah.model.DAO.ClienteDAO;
import br.jah.model.POJO.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nath Rodrigues
 */
public class Suporte extends HttpServlet {
    ClienteDAO clienteDAO;

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
            String txtSuporte = request.getParameter("textoSuporte");
            int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
            
        try {
            clienteDAO = new ClienteDAO();
            boolean sup = clienteDAO.pedidoSuporte(idUsuario, txtSuporte);
            RequestDispatcher reqDis = null;
                if(sup){  
                request.setAttribute("mensagemDialogo", "Pedido enviado com sucesso!");
                reqDis = request.getRequestDispatcher("/dialogo.jsp");
                reqDis.forward(request, response);
            }else{
                request.setAttribute("mensagemDialogo", "Erro ao solicitar suporte!");
                reqDis = request.getRequestDispatcher("/dialogo.jsp");
                reqDis.forward(request, response);
                }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Suporte.class.getName()).log(Level.SEVERE, null, ex);
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
