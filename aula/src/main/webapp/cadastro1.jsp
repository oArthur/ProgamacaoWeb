<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>Preencha seus dados profissionais</p>
<form action="ServletCadastro" method="post">
<label for="empresa">Empresa</label>
<input type="text" id="empresa" name="empresa"> <br>
<p>Endereco Profissional</p>

<label for="rua">Rua</label>
<input type="text" id="rua" name="rua_emp"> <br>
<label for="complemento">Complemento</label>
<input type="text" id="complemento" name="complemento_emp"> <br>
<label for="cidade">Cidade</label>
<input type="text" id="cidade" name="cidade_emp"> <br>
<label for="cep">Cep</label>
<input type="text" id="cep" name="cep_emp"> <br>
<label for="estado">Estado</label>
<input type="text" id="estado" name="estado_emp"> <br>
<input type="submit" value="Confirmar">
</form>
</body>
</html>