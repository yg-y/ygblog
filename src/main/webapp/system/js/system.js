$(document).ready(function() {
    $.ajax({
        url:"/img/system",
        type:"GET",
        contentType: "application/x-www-form-urlencoded",
        success:function(result){
            if(result.status == 200){
                var img = new Vue({
                    el:'#app1',
                    data:{
                        images:[
                            {
                                message:{
                                    imgId:this.data.imgId,
                                    imgName:this.data.imgName,
                                    imgPath:this.data.imgPath,
                                    imgPath:this.data.imgPath,
                                    imgDate:this.data.imgDate
                                }
                            }
                        ]
                    }
                })
                $.each(result.data,function () {
                    console.log(this.imgPath)
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

