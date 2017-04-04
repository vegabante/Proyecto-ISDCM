<%@include file="header.jsp" %>
<script src="http://cdn.jsdelivr.net/timepicker.js/latest/timepicker.min.js"></script>
<link href="http://cdn.jsdelivr.net/timepicker.js/latest/timepicker.min.css" rel="stylesheet"/>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        A�adir un nuevo video
        <small>Optional description</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
        <li class="active">Here</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
          <div class="col-md-12">
           <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Registro de V�deos</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <form action="servletVideo" method="post">
              <div class="box-body">
                <div class="form-group has-feedback">
                  <label for="exampleInputEmail1">ID</label>
                  <input type="number" name="id" class="form-control" placeholder="ID" required="required">
                </div>
                <div class="form-group has-feedback">
                  <label for="exampleInputPassword1">T�tulo</label>
                  <input type="text" name="title" class="form-control" placeholder="T�tulo" required="required">
                </div>
                <div class="form-group has-feedback">
                  <label for="exampleInputPassword1">Autor</label>
                  <input type="text" name="author" class="form-control" placeholder="Autor" required="required">
                </div>                  
                <div class="form-group has-feedback">
                  <label for="exampleInputPassword1">Fecha de Creaci�n</label>
                  <input type="date" name="creationdate" class="form-control" placeholder="Fecha de Creaci�n" required="required">
                </div>
                <div class="form-group has-feedback">
                  <label for="exampleInputPassword1">Duraci�n</label>
                  <input type="text" name="duration" class="form-control" placeholder="Duraci�n (hh:mm:ss)" pattern="^[0-9][0-9]:[0-5][0-9]:[0-5][0-9]$" required="required">
                </div>
                <div class="form-group has-feedback">
                  <label for="exampleInputPassword1">Reproducciones</label>
                  <input type="number" name="reproductions" class="form-control" placeholder="Reproducciones" required="required">
                </div>
                <div class="form-group has-feedback">
                  <label for="exampleInputPassword1">Descripci�n</label>
                  <input type="text" name="description" class="form-control" placeholder="Decripci�n" required="required">
                </div>
                <div class="form-group has-feedback">
                  <label for="exampleInputPassword1">Formato</label>
                  <input type="text" name="format" class="form-control" placeholder="Formato" required="required">
                </div>                  
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" class="btn btn-primary">Enviar</button>
              </div>
            </form>
          </div>

          </div>
      </div>

    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <%@include file="footer.jsp" %>