/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Osmar
 */
public class servletListaVid extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException,IOException
    {
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:derby://localhost:1527/";
        String dbName = "DBUsuarios";
        String userId = "isdcm";
        String password = "1234";

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{ 
            connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            statement=connection.createStatement();
            String sql ="SELECT * FROM VIDEOS";

            resultSet = statement.executeQuery(sql);
            
                String id =resultSet.getString("ID");
                String title =resultSet.getString("TITULO");
                String author =resultSet.getString("AUTOR");
                String creation_date =resultSet.getString("FECHA_CREACION");
                String duration = resultSet.getString("DURACION");
                String reproductions = resultSet.getString("REPRODUCCIONES");
                String description = resultSet.getString("DESCRIPCION");
                String format = resultSet.getString("FORMATO");
                
            while(resultSet.next()){
                

                
                request.setAttribute("id", id);
                
                request.setAttribute("title", title);

                request.setAttribute("author", author);

                request.setAttribute("creation_date", creation_date);

                request.setAttribute("duration", duration);

                request.setAttribute("reproductions", reproductions);

                request.setAttribute("description", description);

                request.setAttribute("format", format);
                request.getRequestDispatcher("/home.jsp").forward(request, response);
 
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
