package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("This is a starter template page. Use this page to start your new project from\n");
      out.write("scratch. This page gets rid of all links and provides the needed markup only.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <title>ISDCM</title>\n");
      out.write("  <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("  <!-- Bootstrap 3.3.6 -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("  <!-- Font Awesome -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("  <!-- Ionicons -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("  <!-- Theme style -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/AdminLTE.min.css\">\n");
      out.write("  <!-- AdminLTE Skins. We have chosen the skin-blue for this starter\n");
      out.write("        page. However, you can choose any other skin. Make sure you\n");
      out.write("        apply the skin class to the body tag so the changes take effect.\n");
      out.write("  -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/skins/skin-blue.min.css\">\n");
      out.write("\n");
      out.write("  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("  <!--[if lt IE 9]>\n");
      out.write("  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("  <![endif]-->\n");
      out.write("</head>\n");
      out.write("<!--\n");
      out.write("BODY TAG OPTIONS:\n");
      out.write("=================\n");
      out.write("Apply one or more of the following classes to get the\n");
      out.write("desired effect\n");
      out.write("|---------------------------------------------------------|\n");
      out.write("| SKINS         | skin-blue                               |\n");
      out.write("|               | skin-black                              |\n");
      out.write("|               | skin-purple                             |\n");
      out.write("|               | skin-yellow                             |\n");
      out.write("|               | skin-red                                |\n");
      out.write("|               | skin-green                              |\n");
      out.write("|---------------------------------------------------------|\n");
      out.write("|LAYOUT OPTIONS | fixed                                   |\n");
      out.write("|               | layout-boxed                            |\n");
      out.write("|               | layout-top-nav                          |\n");
      out.write("|               | sidebar-collapse                        |\n");
      out.write("|               | sidebar-mini                            |\n");
      out.write("|---------------------------------------------------------|\n");
      out.write("-->\n");
      out.write("<body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("\n");
      out.write("  <!-- Main Header -->\n");
      out.write("  <header class=\"main-header\">\n");
      out.write("\n");
      out.write("    <!-- Logo -->\n");
      out.write("    <a href=\"#\" class=\"logo\">\n");
      out.write("      <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("      <span class=\"logo-mini\"></span>\n");
      out.write("      <!-- logo for regular state and mobile devices -->\n");
      out.write("      <span class=\"logo-lg\">ISDCM</span>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <!-- Header Navbar -->\n");
      out.write("    <nav class=\"navbar navbar-static-top\" role=\"navigation\">\n");
      out.write("      <!-- Sidebar toggle button-->\n");
      out.write("      <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("      </a>\n");
      out.write("      <!-- Navbar Right Menu -->\n");
      out.write("      <div class=\"navbar-custom-menu\">\n");
      out.write("        <ul class=\"nav navbar-nav\">\n");
      out.write("          <!-- Messages: style can be found in dropdown.less-->\n");
      out.write("          <li class=\"dropdown messages-menu\">\n");
      out.write("            <!-- Menu toggle button -->\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("              <i class=\"fa fa-envelope-o\"></i>\n");
      out.write("              <span class=\"label label-success\">4</span>\n");
      out.write("            </a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("              <li class=\"header\">You have 4 messages</li>\n");
      out.write("              <li>\n");
      out.write("                <!-- inner menu: contains the messages -->\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("                  <li><!-- start message -->\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                      <div class=\"pull-left\">\n");
      out.write("                        <!-- User Image -->\n");
      out.write("                        <img src=\"img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                      </div>\n");
      out.write("                      <!-- Message title and timestamp -->\n");
      out.write("                      <h4>\n");
      out.write("                        Support Team\n");
      out.write("                        <small><i class=\"fa fa-clock-o\"></i> 5 mins</small>\n");
      out.write("                      </h4>\n");
      out.write("                      <!-- The message -->\n");
      out.write("                      <p>Why not buy a new awesome theme?</p>\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                  <!-- end message -->\n");
      out.write("                </ul>\n");
      out.write("                <!-- /.menu -->\n");
      out.write("              </li>\n");
      out.write("              <li class=\"footer\"><a href=\"#\">See All Messages</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          <!-- /.messages-menu -->\n");
      out.write("\n");
      out.write("          <!-- Notifications Menu -->\n");
      out.write("          <li class=\"dropdown notifications-menu\">\n");
      out.write("            <!-- Menu toggle button -->\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("              <i class=\"fa fa-bell-o\"></i>\n");
      out.write("              <span class=\"label label-warning\">10</span>\n");
      out.write("            </a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("              <li class=\"header\">You have 10 notifications</li>\n");
      out.write("              <li>\n");
      out.write("                <!-- Inner Menu: contains the notifications -->\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("                  <li><!-- start notification -->\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                      <i class=\"fa fa-users text-aqua\"></i> 5 new members joined today\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                  <!-- end notification -->\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"footer\"><a href=\"#\">View all</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          <!-- Tasks Menu -->\n");
      out.write("          <li class=\"dropdown tasks-menu\">\n");
      out.write("            <!-- Menu Toggle Button -->\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("              <i class=\"fa fa-flag-o\"></i>\n");
      out.write("              <span class=\"label label-danger\">9</span>\n");
      out.write("            </a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("              <li class=\"header\">You have 9 tasks</li>\n");
      out.write("              <li>\n");
      out.write("                <!-- Inner menu: contains the tasks -->\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("                  <li><!-- Task item -->\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                      <!-- Task title and progress text -->\n");
      out.write("                      <h3>\n");
      out.write("                        Design some buttons\n");
      out.write("                        <small class=\"pull-right\">20%</small>\n");
      out.write("                      </h3>\n");
      out.write("                      <!-- The progress bar -->\n");
      out.write("                      <div class=\"progress xs\">\n");
      out.write("                        <!-- Change the css width attribute to simulate progress -->\n");
      out.write("                        <div class=\"progress-bar progress-bar-aqua\" style=\"width: 20%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n");
      out.write("                          <span class=\"sr-only\">20% Complete</span>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                  <!-- end task item -->\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"footer\">\n");
      out.write("                <a href=\"#\">View all tasks</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          <!-- User Account Menu -->\n");
      out.write("          <li class=\"dropdown user user-menu\">\n");
      out.write("            <!-- Menu Toggle Button -->\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                <i class=\"fa fa-gears\"></i>\n");
      out.write("              <!-- The user image in the navbar-->\n");
      out.write("              <img src=\"img/user2-160x160.jpg\" class=\"user-image\" alt=\"User Image\">\n");
      out.write("              <!-- hidden-xs hides the username on small devices so only the image appears. -->\n");
      out.write("              <span class=\"hidden-xs\">Alexander Pierce</span>\n");
      out.write("            </a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("              <!-- The user image in the menu -->\n");
      out.write("              <li class=\"user-header\">\n");
      out.write("                <img src=\"img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("\n");
      out.write("                <p>\n");
      out.write("                  Alexander Pierce - Web Developer\n");
      out.write("                  <small>Member since Nov. 2012</small>\n");
      out.write("                </p>\n");
      out.write("              </li>\n");
      out.write("              <!-- Menu Body -->\n");
      out.write("              <li class=\"user-body\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col-xs-4 text-center\">\n");
      out.write("                    <a href=\"#\">Followers</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-xs-4 text-center\">\n");
      out.write("                    <a href=\"#\">Sales</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-xs-4 text-center\">\n");
      out.write("                    <a href=\"#\">Friends</a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("              </li>\n");
      out.write("              <!-- Menu Footer-->\n");
      out.write("              <li class=\"user-footer\">\n");
      out.write("                <div class=\"pull-left\">\n");
      out.write("                  <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"pull-right\">\n");
      out.write("                  <a href=\"servletLogout\" class=\"btn btn-default btn-flat\">Sign out</a>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          <!-- Control Sidebar Toggle Button -->\n");
      out.write("          <li>\n");
      out.write("            <a href=\"#\" data-toggle=\"control-sidebar\"><i class=\"fa fa-gears\"></i></a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("  </header>\n");
      out.write("  <!-- Left side column. contains the logo and sidebar -->\n");
      out.write("  <aside class=\"main-sidebar\">\n");
      out.write("\n");
      out.write("    <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("    <section class=\"sidebar\">\n");
      out.write("\n");
      out.write("      <!-- Sidebar user panel (optional) -->\n");
      out.write("      <div class=\"user-panel\">\n");
      out.write("        <div class=\"pull-left image\">\n");
      out.write("          <img src=\"img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"pull-left info\">\n");
      out.write("          <p>Alexander Pierce</p>\n");
      out.write("          <!-- Status -->\n");
      out.write("          <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- search form (Optional) -->\n");
      out.write("      <form action=\"#\" method=\"get\" class=\"sidebar-form\">\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("          <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("              <span class=\"input-group-btn\">\n");
      out.write("                <button type=\"submit\" name=\"search\" id=\"search-btn\" class=\"btn btn-flat\"><i class=\"fa fa-search\"></i>\n");
      out.write("                </button>\n");
      out.write("              </span>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("      <!-- /.search form -->\n");
      out.write("\n");
      out.write("      <!-- Sidebar Menu -->\n");
      out.write("      <ul class=\"sidebar-menu\">\n");
      out.write("        <li class=\"header\">HEADER</li>\n");
      out.write("        <!-- Optionally, you can add icons to the links -->\n");
      out.write("        <li><a href=\"home.jsp\"><i class=\"fa fa-link\"></i> <span>Ver videos</span></a></li>\n");
      out.write("        <li><a href=\"addvideos.jsp\"><i class=\"fa fa-link\"></i> <span>Agregar videos</span></a></li>\n");
      out.write("        <li class=\"treeview\">\n");
      out.write("          <a href=\"#\"><i class=\"fa fa-link\"></i> <span>Multilevel</span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"#\">Link in level 2</a></li>\n");
      out.write("            <li><a href=\"#\">Link in level 2</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <!-- /.sidebar-menu -->\n");
      out.write("    </section>\n");
      out.write("    <!-- /.sidebar -->\n");
      out.write("  </aside>\n");
      out.write("\n");
      out.write("  <!-- Content Wrapper. Contains page content -->\n");
      out.write("  <div class=\"content-wrapper\">\n");
      out.write("    <!-- Content Header (Page header) -->\n");
      out.write("    <section class=\"content-header\">\n");
      out.write("      <h1>\n");
      out.write("        Videos disponibles\n");
      out.write("      </h1>\n");
      out.write("<!--      <ol class=\"breadcrumb\">\n");
      out.write("        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Level</a></li>\n");
      out.write("        <li class=\"active\">Here</li>\n");
      out.write("      </ol>-->\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Main content -->\n");
      out.write("    <section class=\"content\">\n");
      out.write("\n");
      out.write("\t<table border=\"1\" width=\"303\">\n");
      out.write("\t  <tr>\n");
      out.write("\t\t<td width=\"119\"><b>ID</b></td>\n");
      out.write("\t\t<td width=\"168\"><b>Titulo</b></td>\n");
      out.write("\t\t<td width=\"168\"><b>Autor</b></td>\n");
      out.write("\t\t<td width=\"168\"><b>Fecha de Creación</b></td>\n");
      out.write("\t\t<td width=\"168\"><b>Duración</b></td>\n");
      out.write("\t\t<td width=\"168\"><b>Reproducciones</b></td>\n");
      out.write("\t\t<td width=\"168\"><b>Descripción</b></td>\n");
      out.write("\t\t<td width=\"168\"><b>Formato</b></td>\n");
      out.write("\t  </tr>\n");
      out.write("\t");
Iterator itr;
      out.write('\n');
      out.write('	');
 List data= (List)request.getAttribute("data");
		for (itr=data.iterator(); itr.hasNext(); )
		{
	
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td width=\"119\">");
      out.print(itr.next());
      out.write("</td>\n");
      out.write("\t\t<td width=\"168\">");
      out.print(itr.next());
      out.write("</td>\n");
      out.write("\t</tr>\n");
      out.write("\t");
}
      out.write("\n");
      out.write("\t</table>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("    <!-- /.content -->\n");
      out.write("  </div>\n");
      out.write("  <!-- /.content-wrapper -->\n");
      out.write("\n");
      out.write("  ");
      out.write("<!-- Main Footer -->\n");
      out.write("  <footer class=\"main-footer\">\n");
      out.write("    <!-- To the right -->\n");
      out.write("    <div class=\"pull-right hidden-xs\">\n");
      out.write("      Anything you want\n");
      out.write("    </div>\n");
      out.write("    <!-- Default to the left -->\n");
      out.write("    <strong>Copyright &copy; 2016 <a href=\"#\">Company</a>.</strong> All rights reserved.\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("  <!-- Control Sidebar -->\n");
      out.write("  <aside class=\"control-sidebar control-sidebar-dark\">\n");
      out.write("    <!-- Create the tabs -->\n");
      out.write("    <ul class=\"nav nav-tabs nav-justified control-sidebar-tabs\">\n");
      out.write("      <li class=\"active\"><a href=\"#control-sidebar-home-tab\" data-toggle=\"tab\"><i class=\"fa fa-home\"></i></a></li>\n");
      out.write("      <li><a href=\"#control-sidebar-settings-tab\" data-toggle=\"tab\"><i class=\"fa fa-gears\"></i></a></li>\n");
      out.write("    </ul>\n");
      out.write("    <!-- Tab panes -->\n");
      out.write("    <div class=\"tab-content\">\n");
      out.write("      <!-- Home tab content -->\n");
      out.write("      <div class=\"tab-pane active\" id=\"control-sidebar-home-tab\">\n");
      out.write("        <h3 class=\"control-sidebar-heading\">Recent Activity</h3>\n");
      out.write("        <ul class=\"control-sidebar-menu\">\n");
      out.write("          <li>\n");
      out.write("            <a href=\"javascript:;\">\n");
      out.write("              <i class=\"menu-icon fa fa-birthday-cake bg-red\"></i>\n");
      out.write("\n");
      out.write("              <div class=\"menu-info\">\n");
      out.write("                <h4 class=\"control-sidebar-subheading\">Langdon's Birthday</h4>\n");
      out.write("\n");
      out.write("                <p>Will be 23 on April 24th</p>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("        <!-- /.control-sidebar-menu -->\n");
      out.write("\n");
      out.write("        <h3 class=\"control-sidebar-heading\">Tasks Progress</h3>\n");
      out.write("        <ul class=\"control-sidebar-menu\">\n");
      out.write("          <li>\n");
      out.write("            <a href=\"javascript:;\">\n");
      out.write("              <h4 class=\"control-sidebar-subheading\">\n");
      out.write("                Custom Template Design\n");
      out.write("                <span class=\"pull-right-container\">\n");
      out.write("                  <span class=\"label label-danger pull-right\">70%</span>\n");
      out.write("                </span>\n");
      out.write("              </h4>\n");
      out.write("\n");
      out.write("              <div class=\"progress progress-xxs\">\n");
      out.write("                <div class=\"progress-bar progress-bar-danger\" style=\"width: 70%\"></div>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("        <!-- /.control-sidebar-menu -->\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- /.tab-pane -->\n");
      out.write("      <!-- Stats tab content -->\n");
      out.write("      <div class=\"tab-pane\" id=\"control-sidebar-stats-tab\">Stats Tab Content</div>\n");
      out.write("      <!-- /.tab-pane -->\n");
      out.write("      <!-- Settings tab content -->\n");
      out.write("      <div class=\"tab-pane\" id=\"control-sidebar-settings-tab\">\n");
      out.write("        <form method=\"post\">\n");
      out.write("          <h3 class=\"control-sidebar-heading\">General Settings</h3>\n");
      out.write("\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"control-sidebar-subheading\">\n");
      out.write("              Report panel usage\n");
      out.write("              <input type=\"checkbox\" class=\"pull-right\" checked>\n");
      out.write("            </label>\n");
      out.write("\n");
      out.write("            <p>\n");
      out.write("              Some information about this general settings option\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("          <!-- /.form-group -->\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      <!-- /.tab-pane -->\n");
      out.write("    </div>\n");
      out.write("  </aside>\n");
      out.write("  <!-- /.control-sidebar -->\n");
      out.write("  <!-- Add the sidebar's background. This div must be placed\n");
      out.write("       immediately after the control sidebar -->\n");
      out.write("  <div class=\"control-sidebar-bg\"></div>\n");
      out.write("</div>\n");
      out.write("<!-- ./wrapper -->\n");
      out.write("\n");
      out.write("<!-- REQUIRED JS SCRIPTS -->\n");
      out.write("\n");
      out.write("<!-- jQuery 2.2.3 -->\n");
      out.write("<script src=\"plugins/jQuery/jquery-2.2.3.min.js\"></script>\n");
      out.write("<!-- Bootstrap 3.3.6 -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!-- AdminLTE App -->\n");
      out.write("<script src=\"js/app.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Optionally, you can add Slimscroll and FastClick plugins.\n");
      out.write("     Both of these plugins are recommended to enhance the\n");
      out.write("     user experience. Slimscroll is required when using the\n");
      out.write("     fixed layout. -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
