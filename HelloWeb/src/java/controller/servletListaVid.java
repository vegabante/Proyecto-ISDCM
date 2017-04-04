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
    private ServletConfig config;
    private static String url = "jdbc:derby://localhost:1527/DBUsuarios";
    private static String user1 = "isdcm";
    private static String password1 = "1234";
    
    //Setting JSP page

    String page="home.jsp";
    
    public void init(ServletConfig config)
        throws ServletException{
            this.config=config;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException,IOException
    {
        PrintWriter out = response.getWriter();
        
        //Establish connection to MySQL database
        //String connectionURL = "jdbc:derby://localhost:1527/DBUsuarios";
        Connection connection = null;
        ResultSet rs;
        response.setContentType("text/html");
        List dataList = new ArrayList(); 

        try {

            // Load the database driver
            Class.forName("com.mysql.jdbc.Driver");

            // Get a Connection to the database
            connection = DriverManager.getConnection(url,user1,password1); 

            //Select the data from the database
            String sql = "select * from VIDEOS";
            Statement s = connection.createStatement();
            s.executeQuery (sql);
            rs = s.getResultSet();

            while (rs.next ()){

            //Add records into data list
                dataList.add(rs.getString("id"));
                dataList.add(rs.getString("title"));
                dataList.add(rs.getString("author"));
                dataList.add(rs.getString("creationdate"));
                dataList.add(rs.getString("duration"));
                dataList.add(rs.getString("reproductions"));
                dataList.add(rs.getString("description"));
                dataList.add(rs.getString("format"));
            }
            rs.close ();
            s.close ();
        
        }catch(Exception e){
            System.out.println("Exception is ;"+e);
        }

        request.setAttribute("data",dataList);

        //Disptching request
        RequestDispatcher dispatcher = request.getRequestDispatcher(page);

        if (dispatcher != null){
            dispatcher.forward(request, response);
        } 

    }
//     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//         PrintWriter out = res.getWriter();
//         res.setContentType("text/html");
//         out.println("<html><body>");
//         try {
//             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//             Connection con = DriverManager.getConnection(url,user1,password1);
//             // Here dsnname- mydsn,user id- system(for oracle 10g),password is pintu.
//             Statement stmt = con.createStatement();
//             ResultSet rs = stmt.executeQuery("select * from videos");
//             out.println("<table border=1 width=50% height=50%>");
//             out.println("<tr><th>EmpId</th><th>EmpName</th><th>Salary</th><tr>");
//             while (rs.next()) {
//                 String n = rs.getString("empid");
//                 String nm = rs.getString("empname");
//                 int s = rs.getInt("sal"); 
//                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>"); 
//             }
//             out.println("</table>");
//             out.println("</html></body>");
//             con.close();
//            }
//             catch (Exception e) {
//             out.println("error");
//         }
//     }
}
