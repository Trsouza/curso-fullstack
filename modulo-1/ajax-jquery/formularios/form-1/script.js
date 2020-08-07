function enviar() {
    var id = document.getElementById('id').value;
    var name = document.getElementById('name').value;
    var location = document.getElementById('location').value;

    $.ajax({
        method: "POST",
        url: "http://localhost:3000/users",
        data: {
            "id": id,
            "name": name,
            "location": location
        },
        success: function () {
            alert("Dados inseridos com sucesso!");
        },
        error: function () {
            alert("Dados não inseridos!");
        }
    });
}

// function editar() {

//     $.ajax({
//         method: "PUT",
//         url: "http://localhost:3000/users" + id,

//     });
// }

function deletar() {
    var id = document.getElementById('id').value;

    $.ajax({
        url: "http://localhost:3000/users/" + id,
        method: "DELETE",
        success: function () {
            alert("Dados deletados com sucesso! " + id);
        },
        error: function () {
            alert("Erro, ID não encontrado! " + id);
        }
    });
}

function buscar() {
    var id = document.getElementById('id').value;

    $.ajax({
        url: "http://localhost:3000/users/" + id,
        method: "GET",
        success: function (response) {
            document.getElementById('id').value = response.id;
            document.getElementById('name').value = response.name;
            document.getElementById('location').value = response.location;
        },
        error: function () {
            alert("Erro, ID " + id + " não encontrado! ");
        }
    });
}



// function enviar() {

//     var id = document.getElementById('id').value;
//     var nome = document.getElementById('nome').value;
//     var pais = document.getElementById('pais').value;

//     $.ajax({
//         method: "POST",
//         url: "http://localhost:3000/users",
//         data: {
//             "id": id,
//             "nome": nome,
//             "pais": pais
//         },
//         success: function () {
//             alert("Dados inseridos com sucesso!");
//         },
//         error: function () {
//             alert("Dados não inseridos!");
//         }
//     })
// }


// function buscar() {

//     var id = document.getElementById('id').value;

//     $.get("http://localhost:3000/users/" + id, function (data) {
//         document.getElementById('id').value = data.id;
//         document.getElementById('name').value = data.name;
//         document.getElementById('location').value = data.location;
//     });
// }