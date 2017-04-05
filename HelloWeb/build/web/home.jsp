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

<table align="center" cellpadding="5" cellspacing="5" border="1" >
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

<tr bgcolor="#DEB887">

<td>${id}</td>
<td>${title}</td>
<td>${author}</td>
<td>${creation_date}</td>
<td>${duration}</td>
<td>${reproductions}</td>
<td>${description}</td>
<td>${format}</td>


</tr>

</table>

      
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <%@include file="footer.jsp" %>