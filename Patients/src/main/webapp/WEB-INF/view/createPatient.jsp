<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css"
href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Ajouter Patient</title>
</head>
<body>
<div class="container mt-5" >
<div class="card-body">
<form action="saveProduit" method="post">
 <div class="form-group">
 <label class="control-label">Nom Patient :</label>
 <input type="text" name="nomPatient" class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Prix Patient :</label>
 <input type="text" name="prixPatient" class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">date consultation :</label>
 <input type="date" name="date" class="form-control"/>
 </div>

 <div>
 <button type="submit" class="btn btn-primary">Ajouter</button>
</div>
</form>
</div>
${msg}
<br/>
<br/>
<a href="ListePatients">Liste Patients</a>
</div>
</body>
</html>