$(document).ready(function() {
    $.ajax({
        url:"/bloguser/system",
        type:"GET",
        contentType: "application/x-www-form-urlencoded",
        success:function(result){
            if(result.status == 200){
                $.each(result.data,function () {
                    alert(this.imgPath);
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