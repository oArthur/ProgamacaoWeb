function inserirRegistro() {
    var nome = document.getElementById("inputNome").value;
    var cpf = document.getElementById("RegraValida").value;
    var tabela = document.getElementById("registros");

    // Recupera a quantidade de linhas da tabela
    var qtdLinhas = tabela.rows.length;

    // Adicionar uma linha ao final da tabela
    var novaLinha = tabela.insertRow(qtdLinhas);

    // Adiciona duas células à linha
    var celula1 = novaLinha.insertCell(0);
    var celula2 = novaLinha.insertCell(1);

    // Definir o conteúdo das células criadas
    celula1.innerHTML = nome;
    celula2.innerHTML = cpf;
}

function ValidaCPF() {
    var RegraValida = document.getElementById("RegraValida").value;
    var cpfValido = /^(([0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2})|([0-9]{11}))$/;
    if (cpfValido.test(RegraValida) == true) {
        console.log("CPF Válido");
    } else {
        console.log("CPF Inválido");
    }
}

function fMasc(objeto, mascara) {
    obj = objeto
    masc = mascara
    setTimeout("fMascEx()", 1)
}

function fMascEx() {
    obj.value = masc(obj.value)
}

function mCPF(cpf) {
    cpf = cpf.replace(/\D/g, "")
    cpf = cpf.replace(/(\d{3})(\d)/, "$1.$2")
    cpf = cpf.replace(/(\d{3})(\d)/, "$1.$2")
    cpf = cpf.replace(/(\d{3})(\d{1,2})$/, "$1-$2")
    return cpf
}