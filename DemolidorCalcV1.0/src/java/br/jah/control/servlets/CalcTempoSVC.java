/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.jah.control.servlets;

import br.jah.model.DAO.ClienteDAO;
import java.io.IOException;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 1946810
 */
public class CalcTempoSVC extends HttpServlet {

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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date dataE01;
        Date dataE02;
        Date dataE03;
        Date dataE04;
        Date dataE05;
        Date dataE06;
        Date dataE07;
        Date dataE08;
        Date dataE09;
        Date dataE010;
        try {
            dataE01 = (Date) sdf.parse(request.getParameter("dataE1"));
            dataE02 = (Date) sdf.parse(request.getParameter("dataE2"));
            dataE03 = (Date) sdf.parse(request.getParameter("dataE3"));
            dataE04 = (Date) sdf.parse(request.getParameter("dataE4"));
            dataE05 = (Date) sdf.parse(request.getParameter("dataE5"));
            dataE06 = (Date) sdf.parse(request.getParameter("dataE6"));
            dataE07 = (Date) sdf.parse(request.getParameter("dataE7"));
            dataE08 = (Date) sdf.parse(request.getParameter("dataE8"));
            dataE09 = (Date) sdf.parse(request.getParameter("dataE9"));
            dataE010 = (Date) sdf.parse(request.getParameter("dataE10"));
            //converte para sql.Date
            java.sql.Date dataE1 = new java.sql.Date(dataE01.getTime());
            java.sql.Date dataE2 = new java.sql.Date(dataE02.getTime());
            java.sql.Date dataE3 = new java.sql.Date(dataE03.getTime());
            java.sql.Date dataE4 = new java.sql.Date(dataE04.getTime());
            java.sql.Date dataE5 = new java.sql.Date(dataE05.getTime());
            java.sql.Date dataE6 = new java.sql.Date(dataE06.getTime());
            java.sql.Date dataE7 = new java.sql.Date(dataE07.getTime());
            java.sql.Date dataE8 = new java.sql.Date(dataE08.getTime());
            java.sql.Date dataE9 = new java.sql.Date(dataE09.getTime());
            java.sql.Date dataE10 = new java.sql.Date(dataE010.getTime());
            ClienteDAO dao;
            dao = new ClienteDAO();
            dao.addNaLista(dataE1, dataE2, dataE3, dataE4, dataE5, dataE6,
                    dataE7, dataE8, dataE9, dataE10);
        } catch (ParseException | ClassNotFoundException ex) {
            Logger.getLogger(CalcTempoSVC.class.getName()).log(Level.SEVERE, null, ex);
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
//        Calendar dataE1 = Calendar.getInstance();
//        Calendar dataE2 = Calendar.getInstance();
//        Calendar dataE3 = Calendar.getInstance();
//        Calendar dataE4 = Calendar.getInstance();
//        Calendar dataE5 = Calendar.getInstance();
//        Calendar dataE6 = Calendar.getInstance();
//        Calendar dataE7 = Calendar.getInstance();
//        Calendar dataE8 = Calendar.getInstance();
//        Calendar dataE9 = Calendar.getInstance();
//        Calendar dataE10 = Calendar.getInstance();
        
//        try {
//            dataE1.setTime(sdf.parse(request.getParameter("dataE1")));
//            dataE2.setTime(sdf.parse(request.getParameter("dataE2")));
//            dataE3.setTime(sdf.parse(request.getParameter("dataE3")));
//            dataE4.setTime(sdf.parse(request.getParameter("dataE4")));
//            dataE5.setTime(sdf.parse(request.getParameter("dataE5")));
//            dataE6.setTime(sdf.parse(request.getParameter("dataE6")));
//            dataE7.setTime(sdf.parse(request.getParameter("dataE7")));
//            dataE8.setTime(sdf.parse(request.getParameter("dataE8")));
//            dataE9.setTime(sdf.parse(request.getParameter("dataE9")));
//            dataE10.setTime(sdf.parse(request.getParameter("dataE10")));
//        } catch (ParseException ex) {
//            Logger.getLogger(CalcTempoSVC.class.getName()).log(Level.SEVERE, null, ex);
//        }
}
