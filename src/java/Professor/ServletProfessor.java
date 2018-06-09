/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Professor;

import Professor.Professor;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC CASA
 */
@WebServlet(name = "ServletProfessor", urlPatterns = {"/ServletProfessor"})
public class ServletProfessor extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            response.sendRedirect("/TEST/Paginas/HTML/Pesquisar/Pesquisar.jsp");
            Professor Princ=new Professor();
           if(request.getParameter("Açao")!=null){
                if(request.getParameter("Açao").equals("Pesquisar")){//Devera dar uma lista de resultados(ResultSet)
                        ResultSet RS=null;
                         //Tambem util em angular
                        Princ.AçoesProcura(
                                request.getParameter("TipoCondiçao"),//tipo de condiçao(id,nome ou CPF)
                                request.getParameter("Condiçao"));//valor da condiçao
                        request.setAttribute("Resultado",Princ.getResultado());
                }if(request.getParameter("Açao").equals("Selecionar")){//se um professor foi escolhido
                        Princ.MostrarTodosOsDadosDeUmProfessor(request.getParameter("Condiçao"));
                        request.setAttribute("Resultado",Princ.getResultado());
                        request.setAttribute("ResultadoRelaçoes",Princ.getResultadoDeRelacionamentos());
                }else{
                        ArrayList Informaçoes=new ArrayList();

                        Princ.AçoesInsertUpdateDelete(
                                request.getParameter("Açao"),//Saber açao a ser feita(insert,update ou delete)
                                request.getParameter("Condiçao"),//id da entidade que vai ocorrer a açao(util em update e delete) 
                                Informaçoes);
                        response.sendRedirect("/TEST/MarcarPonto.jsp");
                }
          }
            
        }
    }

    public ServletProfessor() {
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
        } catch (SQLException ex) {
            Logger.getLogger(ServletProfessor.class.getName()).log(Level.SEVERE, null, ex);
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
      //  processRequest(request, response);
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
