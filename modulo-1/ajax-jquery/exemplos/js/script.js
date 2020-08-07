var httpRequest;

function fazerRequisicao(url, destino) {
    document.getElementById(destino).innerHTML = "<center><img src='loader.gif'></center>"; // Em quanto o conteudo aninda está sendo processado

    if (window.XMLHttpRequest) { // Browser mais recentes
        httpRequest = new XMLHttpRequest();
    } else if (window.ActiveXObject) { // IE 4,5,6,7

        try {
            httpRequest = new XMLHttpRequest("Msxml2.XMLHTTP");
        } catch (e) {
            try {
                httpRequest = new ActiveXObject("Microsoft.XMLHTTP")
            } catch (e) {
                alert('Impossível instancir o objeto ')
                return false;
            }
        }
    }

    httpRequest.onreadystatechange = situacaoRequisicao; // Propriedade 'onreadystatechange' define uma função a ser executada quando o readyState for alterado.
    httpRequest.open('GET', url); // abre conexão
    httpRequest.send(); // envia requisição
}

function situacaoRequisicao() {
    if (httpRequest.readyState == 4) { // caminho feliz o 4
        if (httpRequest.status == 200) {
            document.getElementById('div_conteudo').innerHTML = httpRequest.responseText;
        }
    }
}


/*------------------ JQUERY --------------------*/













/* 

 var httpRequest;

 function fazerRequisicao(url, destino) {
     document.getElementById(destino).innerHTML = "<center><img src='loader.gif'></center>";
     if (window.XMLHttpRequest) { //Browser mais recente IE8, Mozilla, Chrome
         httpRequest = new XMLHttpRequest();
     } else if (window.ActiveXObject) { //IE 4,5,6,7
         try {
             httpRequest = new ActiveXObject("Msxml2.XMLHTTP");
         } catch (e) {
             try {
                 httpRequest = new ActiveXObject("Microsoft.XMLHTTP");
             } catch (e) {
                 alert("Impossível instanciar o objeto XMLHttpRequest para esse navegador/versão");
                 return false;
             }
         }
     }
     httpRequest.onreadystatechange = situacaoRequisicao;
     httpRequest.open("GET", url);
     httpRequest.send();
 }

 function situacaoRequisicao() {
     if (httpRequest.readyState == 4) {
         if (httpRequest.status == 200) {
             document.getElementById('div_conteudo').innerHTML = httpRequest.responseText;
         }
     }
 }


*/