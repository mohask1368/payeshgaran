function save() {
    var name = document.getElementById("name").value;
    var family = document.getElementById("family").value;
    var fullName = {name:name, family:family};
    var jsonFullName = JSON.stringify(fullName);

      sendToController(jsonFullName);
}

function clean() {

    document.getElementById("name").value = null;
    document.getElementById("family").value = null;
}


function sendToController(s){

alert(s);
    $.ajax({

        type:'POST',
        contentType:"application/json",
        data:s,
        url:'/member',
        error : function() {
            console.log("error");
        },
        success: function (s) {
            console.log("success");
            alert("Saved");


        }
    });

 }