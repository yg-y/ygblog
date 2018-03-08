function login() {
    var username = $('#username').val();
    var password = $('#password').val();
    console.log(username);
    console.log(password);
    $.ajax({
        url:"/bloguser/login",
        type:"POST",
        date:"{username:'" + username + "',password:'" + password + "'}",
        success:function(result){
            alert(result);
        },
        error:function (result) {
            alert(result);
        }
    });
}