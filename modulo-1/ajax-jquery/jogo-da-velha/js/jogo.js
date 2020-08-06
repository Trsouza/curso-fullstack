var rodada = 1;
var matriz_jogo = Array(3); //[[0,0,0],[0,0,0],[0,0,0]]

matriz_jogo['a'] = Array(3);
matriz_jogo['b'] = Array(3);
matriz_jogo['c'] = Array(3);

matriz_jogo['a'][1] = 0;
matriz_jogo['a'][2] = 0;
matriz_jogo['a'][3] = 0;

matriz_jogo['b'][1] = 0;
matriz_jogo['b'][2] = 0;
matriz_jogo['b'][3] = 0;

matriz_jogo['c'][1] = 0;
matriz_jogo['c'][2] = 0;
matriz_jogo['c'][3] = 0;


$(document).ready(function () {

    $('#btn_iniciar').click(function () {

        //valida se o nome dos jogadores está vazio
        if ($('#entradaNome1').val() == '') {
            alert('Nome do jogador 1 não foi preenchido')
            return false;
        }

        //valida se o nome dos jogadores está vazio
        if ($('#entradaNome2').val() == '') {
            alert('Nome do jogador 2 não foi preenchido')
            return false;
        }

        $('#nome1').html($('#entradaNome1').val());
        $('#nome2').html($('#entradaNome2').val());

        $('#box-topo').hide();
        $('#box-jogo').show();

        $('.jogada').click(function () {
            var id_campo_clicado = this.id;
            jogada(id_campo_clicado);
        });
    });

    function jogada(id) {
        var icone = ''; // 
        var ponto = 0;

        //a cada rodada verfica qual jogador está jogando(par ou impar)
        if ((rodada % 2) == 1) {
            icone = 'url("img/marcacao_1.png")';
            ponto = -1;
        } else {
            icone = 'url("img/marcacao_2.png")';
            ponto = 1;
        }

        rodada++;

        $('#' + id).css('background-image', icone);

        var linhaColuna = id.split('-');

        matriz_jogo[linhaColuna[0]][linhaColuna[1]] = ponto;
        console.log(matriz_jogo);

        verificaCombinacao();
    }

    function verificaCombinacao() {
        //verifica na horizontal linha A
        var pontos = 0;
        for (var i = 1; i <= 3; i++) {
            pontos = pontos + matriz_jogo['a'][i];
        }
        ganhador(pontos);
        //verifica na horizontal linha B
        pontos = 0;
        for (var i = 1; i <= 3; i++) {
            pontos = pontos + matriz_jogo['b'][i];
        }
        ganhador(pontos);
        //verifica na horizontal linha C
        pontos = 0;
        for (var i = 1; i <= 3; i++) {
            pontos = pontos + matriz_jogo['c'][i];
        }
        ganhador(pontos);
        //verifica na vertical
        for (var l = 1; l <= 3; l++) {
            pontos = 0;
            pontos = pontos + matriz_jogo['a'][l];
            pontos = pontos + matriz_jogo['b'][l];
            pontos = pontos + matriz_jogo['c'][l];
            ganhador(pontos);
        }
        //verificar na diagonal
        pontos = 0;
        pontos = matriz_jogo['a'][1] + matriz_jogo['b'][2] + matriz_jogo['c'][3];
        ganhador(pontos);
        pontos = 0;
        pontos = matriz_jogo['a'][3] + matriz_jogo['b'][2] + matriz_jogo['c'][1];
        ganhador(pontos);
    }

    function ganhador(pontos) {
        if (pontos == -3) {
            var jogada_1 = $('#entradaNome1').val();
            $('#placar-final').html(jogada_1 + ' é o vencedor!');
            $('.jogada').off();
        } else if (pontos == 3) {
            var jogada_2 = $('#entradaNome2').val();
            $('#placar-final').html(jogada_2 + ' é o vencedor!');
            $('.jogada').off();
        } else if ((rodada - 1) == 9) {
            $('#placar-final').html('EMPATE!!!');
            $('.jogada').off();
        }
    }

});