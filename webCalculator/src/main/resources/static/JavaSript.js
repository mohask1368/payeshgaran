function addToTextBox(value) {
    var textBoxValue =  document.getElementById("textBox").value;
    var newValue =  textBoxValue + value;
    document.getElementById("textBox").value = newValue;
}
function cleanTextBox() {
     document.getElementById("textBox").value = null;
}

function backspace() {

    var textBoxValue =  document.getElementById("textBox").value;
    document.getElementById("textBox").value = textBoxValue.slice(0 ,textBoxValue.toString().length -1)
}

function enter() {
    var textBoxValue =  document.getElementById("textBox").value;

    $.ajax({

        type:'POST',
        contentType:"application/text",
        data:textBoxValue,
        url:'/test',
        error : function() {
            console.log("error");
        },
        success: function (data) {
        alert(data);


        }
    });


}

