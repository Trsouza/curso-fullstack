function iniciaJogo(){

    var url = window.location.search; // search faz pegar o que vem depois da url, o que é passado por parametro
    var nivelJogo = url.replace('?', '');
    var  tempoSegundos = 0;
    var timerId = null;

    document.getElementById('nivel').innerHTML = 'Nível: '+ nivelJogo;

    if(nivelJogo == 1){
        tempoSegundos = 120;
    }
    if(nivelJogo == 2){
        tempoSegundos = 60;
    }
    if(nivelJogo == 3){
        tempoSegundos = 30;
    }

    //inserindo segundos no span
    document.getElementById('cronometro').innerHTML = tempoSegundos;

    var qtdBaloes = 80;

    document.getElementById('baloesInteiros').innerHTML = qtdBaloes;
    document.getElementById('baloesEstourados').innerHTML = 0;

    criaBaloes(qtdBaloes);
    contagemTempo(tempoSegundos + 1);
}

function contagemTempo(segundos){
    segundos -=1;

    if(segundos == -1){
        clearTimeout(timerId);
        gameOver();
        return false;
    }

    document.getElementById('cronometro').innerHTML = segundos; // para setar no html
    timerId = setTimeout("contagemTempo("+segundos+")", 1000);
}

function removeEventosBaloes(){
    var i = 1;
    while(document.getElementById('b'+i)){
        document.getElementById('b'+i).onclick =''; // remove o evento de onclick do elemento
        i++;
    }
}

function criaBaloes(qtdBaloes){
    for(let i=1; i<= qtdBaloes; i++){
        var balao = document.createElement('img');
        balao.src = 'img/balao_azul_pequeno.png';
        balao.style.margin = '10px';
        balao.id = 'b'+i;// gerando ids unicos para cada balao
        balao.onclick = function(){
            estouraBaloes(this); // o this serve para passar como parametro a propria imagem/tag, para ser alterada
        }
        document.getElementById('cenario').appendChild(balao); // junta a tag img, como filha da tag  cenario
    }
}

function estouraBaloes(img){
    var idBalao = img.id;
    document.getElementById(idBalao).setAttribute("onclick",""); // remove o onclick para não permitir clicar novamente em um botão estourado
    document.getElementById(idBalao).src = 'img/balao_azul_pequeno_estourado.png';
    pontuacao(-1);
}

function pararJogo() {
    clearTimeout(timerId);
}

function situacaoJogo(baloesInteiros) {
    if (baloesInteiros == 0) {
        alert('Parabéns, Você venceu');
        pararJogo();
    }
}

function pontuacao(acao){
    var baloesInteiros = document.getElementById('baloesInteiros').innerHTML;
    var baloesEstourados = document.getElementById('baloesEstourados').innerHTML;
    
    baloesInteiros = parseInt(baloesInteiros);
    baloesEstourados = parseInt(baloesEstourados);

    baloesInteiros--;
    baloesEstourados++;

    document.getElementById('baloesInteiros').innerHTML = baloesInteiros;
    document.getElementById('baloesEstourados').innerHTML = baloesEstourados;

    situacaoJogo(baloesInteiros);
}

function gameOver() {
    removeEventosBaloes();
    alert('O jogo acabou, você não conseguiu estourar todos os balões!')
}
