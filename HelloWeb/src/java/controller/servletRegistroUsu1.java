/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.usuario;

/**
 *
 * @author Victoria
 */
public class servletRegistroUsu1 extends HttpServlet {

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
        String name =request.getParameter("name");  
        String lastname =request.getParameter("lastname");  
        String email =request.getParameter("email");
        String user =request.getParameter("user");
        String password =request.getParameter("password");
        String repassword =request.getParameter("repassword");
        String message="";
        String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

        if(!password.equals(repassword)){ 
            message = "ERROR: Las contraseñas no coinciden. Intente de nuevo";
        }

        //-->función añadida<--
        else if(name.isEmpty() || lastname.isEmpty() || email.isEmpty() || user.isEmpty() || password.isEmpty() || repassword.isEmpty()){
            message = "Por favor, completar el formulario antes de enviar.";
        }
        ////-->función añadida<--


        else if(usuario.checkIfUserExists(user)){
            message = "Este usuario ya se encuentra registrado.";
        }

        ////-->función añadida<--
        else if(email.matches(emailregex)==false){
            message = "Dirección de correo electrónico inválida.";   
        }
        ////-->función añadida<--

        else{
            String[] strArray = new String[]{name,lastname,email, user, password, repassword};
            usuario.insert(strArray);
            message = "El usuario fue registrado con éxito.";   
        }

        request.setAttribute("message", message);
        request.getRequestDispatcher("/registroRes.jsp").forward(request, response);
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
