$(document).ready(function() {
    $.ajax({
        url:"/img/system",
        type:"GET",
        contentType: "application/x-www-form-urlencoded",
        success:function(result){
            if(result.status == 200){
                new Vue({
                   el:'#app1',
                   data:{
                       images:result.data
                    }
                  })
            }else {
                alert("error")
            }
        },
        error:function (result) {
            if(result == "error"){
                alert("error")
            }
        }
    });
});


