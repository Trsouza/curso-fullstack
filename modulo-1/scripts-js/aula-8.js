// 1. Crie uma função que recebe um número e verifica se ele é par ou ímpar.
/* function numParImpar(num) {
    if (num % 2 == 0) {
        console.log(num + ' é par!')
    } else {
        console.log(num + ' é impar!')
    }
}

for (let i = 10; i <= 15; i++) {
    numParImpar(i);
} */


// 2. Crie uma arrow function que receba um número e verifique se é primo.
/* Número Primo
let numPrimo = (num) => {
    var cont = 0;
    for (let i = 1; i <= num; i++) {
        if (num % i == 0) {
            cont++;
        }
    }
    if (cont == 2)
        console.log(num + " é primo");
    else
        console.log(num + " não é primo");
} 

 numPrimo(15); */


// 3. Crie uma função que imprime de 10 até 1 e depois imprime na tela“ feliz ano novo” através de uma callback
/* var msg = () => {
    console.log("feliz ano novo");
};

function imprime(callback) {
    for (let i = 10; i >= 1; i--) {
        console.log(i);
    }
    callback();
}

imprime(msg); */


// 4. Faça o mesmo utilizando Promise com concatenação de then
/* const promise = new Promise((resolve, reject) => {

    for (let i = 10; i >= 1; i--) {
        console.log(i);
    }
    setTimeout(() => resolve('Feliz ano novo'), 2000)
});

promise.then((res) => {
    console.log(res);
}); */


// 5. Agora repita a função utilizando o método async/await
/* var msg = () => {
    return new Promise(resolve => {
        setTimeout(() => resolve("Feliz ano novo"), 2000)
    })
};

async function imprime() {
    for (let i = 10; i >= 1; i--) {
        console.log(i);
    }
    var res = await msg();
    console.log(res)
}

imprime(); */


// 6. Crie um array com as seguintes notas[5.3, 4.7, 8.5, 7.1, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0], construa uma função para imprimir apenas as notas acima de 7
/* function numMaioresSete(){
    var notas = [5.3, 4.7, 8.5, 7.1, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0];

    for(let i=0; i<notas.length; i++){
        if(notas[i]>7.0){
            console.log(notas[i]);
        }
    }
}

numMaioresSete(); */


// 7. Crie um array de objetos onde cada objeto será um produto de supermercado e terá o nome do produto e o seu respectivo preço, agora construa uma função que some todos os valores e te devolva o total.
/* 
function somaProdutos() {
    var produtos = [
        {
            nome: "maça",
            preco: 2.0
        },
        {
            nome: "banana",
            preco: 1.0
        },
        {
            nome: "melancia",
            preco: 5.0
        }
    ];

    total = 0;
    for (p in produtos) {
        total += produtos[p].preco;

    }
    console.log(total)
}

somaProdutos();
 */


//8. Em uma escola ficou definido que os alunos do 8º ano terão aulas de história e os alunos do 9º terão aulas de física às quartas - feiras.Você deve criar uma função que receba um array de objetos contendo nome e série de cada aluno e atribua a sua respectiva disciplina da quarta - feira.(O array de alunos deve ser criado como você desejar contanto que contenha pelo menos 5 alunos).

/* function cadastraTurmas() {
    var alunos = [{
            nome: "Maria",
            serie: 8
        },
        {
            nome: "Bruno",
            serie: 9
        },

        {
            nome: "Juliane",
            serie: 8
        },
        {
            nome: "Joana",
            serie: 9
        },
        {
            nome: "Karlos",
            serie: 9
        }
    ];

    for (alu in alunos) {
        if (alunos[alu].serie == 9) {
            alunos[alu]["disciplina"] = "fisica";
        } else if (alunos[alu].serie == 8) {
            alunos[alu]["disciplina"] = "história"
        }
    }
    return alunos;
}

console.log(cadastraTurmas()) */

