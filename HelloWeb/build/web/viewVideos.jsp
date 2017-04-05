<%@page import="model.video"%>
<%@page language="java" import="java.util.*" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@include file="header.jsp" %>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Videos disponibles
        <small>Optional description</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
        <li class="active">Here</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">


<h2 align="center"><font><strong>Retrieve data from database in jsp</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#A52A2A">
<td><b>ID</b></td>
<td><b>Título</b></td>
<td><b>Autor</b></td>
<td><b>Fecha de Creación</b></td>
<td><b>Duración</b></td>
<td><b>Reproducciones</b></td>
<td><b>Descripción</b></td>
<td><b>Formato</b></td>
</tr>
<%
    
    String user = request.getSession().getAttribute("user").toString();
    ResultSet resultSet = video.getVideos(user);
    while(resultSet.next()){
    
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getString("ID") %></td>
<td><%=resultSet.getString("TITULO") %></td>
<td><%=resultSet.getString("AUTOR") %></td>
<td><%=resultSet.getString("FECHA_CREACION") %></td>
<td><%=resultSet.getString("DURACION") %></td>
<td><%=resultSet.getString("REPRODUCCIONES") %></td>
<td><%=resultSet.getString("DESCRIPCION") %></td>
<td><%=resultSet.getString("FORMATO") %></td>

</tr>

<%
}

%>


</table>

      
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <%@include file="footer.jsp" %>