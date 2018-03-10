function login() {
    var username = $('#username').val();
    var password = $('#password').val();
    console.log(username);
    console.log(password);
    $.ajax({
        url:"/bloguser/login",
        type:"POST",
        contentType: "application/x-www-form-urlencoded",
        data : {'username':username,'password':password},
        dataType : "text",
        success:function(result){
            if(result == "success"){
                location.href="system.html"
            }else {
                location.href="/system"
            }
        },
        error:function (result) {
            if(result == "error"){
                location.href="/system"
            }
        }
    });
}

$(document).keypress(function (e) {
    if (e.which == 13){
        login();
    }
})