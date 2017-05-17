<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>Minura Stand - Login</title>

        <!-- WEB FONTS : use %7C instead of | (pipe) -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400%7CRaleway:300,400,500,600,700%7CLato:300,400,400italic,600,700" rel="stylesheet" type="text/css" />

        <!-- CORE CSS -->
        <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/metis-menu/metisMenu.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/simple-line-icons-master/css/simple-line-icons.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/animate/animate.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/c3/c3.min.css" rel="stylesheet">
        <link href="assets/plugins/widget/widget.css" rel="stylesheet">
        <link href="assets/plugins/calendar/fullcalendar.min.css" rel="stylesheet">
        <link href="assets/plugins/ui/jquery-ui.css" rel="stylesheet">
		
		<!-- Bootstrap Material Design -->
		<link href="assets/plugins/material-design/css/bootstrap-material-design.css" rel="stylesheet">
		<link href="assets/plugins/material-design/css/ripples.min.css" rel="stylesheet">
        
        <!-- THEME CSS -->
        <link href="assets/css/style.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/theme/dark.css" rel="stylesheet" type="text/css" />
        
        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="account">
        <div class="container">
            <div class="row">
                <div class="account-col text-center">
                    <h1><i>Minura</i> Stand</h1>
                    <h3>Entrar na conta</h3>
                    <form class="m-t" role="form" action="index.html">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Username" required="">
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="Passowrd" required="">
                        </div>
                        <button type="submit" class="btn btn-primary btn-block ">Login</button>
                        <a href="#"><small>Esqueceu-se da password?</small></a>
                        <p class=" text-center"><small>Ainda não tens uma conta?</small></p>
                        <a class="btn  btn-default btn-block" href="register.jsp">Criar uma conta</a>
                        <p>&copy; Minura Enterprise 2017.</p>
                    </form>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="assets/plugins/jquery/jquery.min.js"></script>
        <script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>
