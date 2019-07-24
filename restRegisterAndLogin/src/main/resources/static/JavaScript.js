function authentication() {

    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var userPass = {username:username ,password:password}
    var auth = JSON.stringify(userPass);


     $.ajax({
        type: 'POST',
        contentType:"application/json",
        url: "authentication",
        data: auth,

        dataType: "text",
        error : function () {
        console.log("error");

        },
         success : function (data) {
             alert(data)
         }


})};



function register() {

    var name = document.getElementById("name").value;
    var family = document.getElementById("family").value;
    var age = document.getElementById("age").value;
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    var member = {name:name,family:family,age:age,username:username,password:password}
    var jsonMember = JSON.stringify(member);



    $.ajax({
        type: 'POST',
        contentType:"application/json",
        url: "/register",
        data: jsonMember,

        dataType: "text",
        error : function () {
            console.log("error");

        },
        success : function (data) {
        alert(data)
        }


    })};