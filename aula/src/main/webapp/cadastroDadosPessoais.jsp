<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <link rel="stylesheet" href="./style.css">
        <title>Dados Pessoais</title>
    </head>

    <body>
        <main class="container">
            <h2 class="log">Dados Pessoais</h2>
            <form action="ServletCadastro" method="post">
                <div class="input-field">
                    <input type="text" name="nome" placeholder="Nome">
                    <div class="underline"></div>
                </div>
                <div class="input-field">
                    <input type="text" name="sobrenome" placeholder="Sobrenome">
                    <div class="underline"></div>
                </div>
                <div class="input-field">
                    <input type="text" name="rua" placeholder="Rua">
                    <div class="underline"></div>
                </div>
                <div class="input-field">
                    <input type="text" name="complemento" placeholder="Complemento">
                    <div class="underline"></div>
                </div>
                <div class="input-field">
                    <input type="text" name="cidade" placeholder="Cidade">
                    <div class="underline"></div>
                </div>
                <div class="input-field">
                    <input type="text" name="cep" placeholder="CEP">
                    <div class="underline"></div>
                </div>
                <div class="input-field">
                    <input type="text" name="estado" placeholder="Estado">
                    <div class="underline"></div>
                </div>
                <input type="submit" id="btn-submit" value="Próxima Página">
            </form>
        </main>

    </body>

    </html>