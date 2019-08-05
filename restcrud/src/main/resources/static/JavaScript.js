function add() {

    var name = document.getElementById("name").value;
    var family = document.getElementById("family").value;
    var age = document.getElementById("age").value;
    var member = {name:name,family:family,age:age};
    var JsonMember = JSON.stringify(member);


$.ajax({

    type:'POST',
    contentType:"application/json",
    url:"add",
    data : JsonMember,
    dataType:"text",
    error : function () {
        console.log("error");
    },
    success : function (data) {

    }

    });




}

function view() {
    alert("view invoked")
}

function edit() {
    alert("edit invoked")
}

function remove() {
    alert("remove invoked")
}