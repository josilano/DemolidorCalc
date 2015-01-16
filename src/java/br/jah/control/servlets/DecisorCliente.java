/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jah.control.servlets;

import br.jah.model.DAO.ClienteDAO;
import br.jah.model.POJO.Cliente;
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
 * @author Lano
 */
public class DecisorCliente extends HttpServlet {

    ClienteDAO clientedao;
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
        String decisao = request.getParameter("decisao");
        int id = Integer.parseInt(request.getParameter("idCliente"));
        //faz if p saber qual tipo de decisão foi e executa o que pede
        RequestDispatcher reqDis = null;
        if(decisao.equals("Selecionar")){
            try {
                clientedao = new ClienteDAO();
                Cliente cliente = clientedao.seleciona(id);
                if(cliente != null){
                reqDis = request.getRequestDispatcher("/calculos.jsp");
                reqDis.forward(request, response);
            }else{
                request.setAttribute("mensagemDialogo", "Erro ao selecionar!");
                reqDis = request.getRequestDispatcher("/dialogo.jsp");
                reqDis.forward(request, response);
            }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DecisorCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
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
