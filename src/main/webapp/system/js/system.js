$(document).ready(function() {
    find();
});

function find(){
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
}

function edit(result){
    $.ajax({
            url:"/img/editImg",
            type:"POST",
            contentType: "application/x-www-form-urlencoded",
            data:{'imgid':result.id},
            success:function(results){
                if(results.status == 200){
                   new Vue({
                        el:'#app3',
                        data:{
                            id:result.id,
                            imgName:results.data[0].imgName,
                            imgPath:results.data[0].imgPath,
                            imgContent:results.data[0].imgContent,
                            imgDate:results.data[0].imgDate
                            }
                    })

                }else{
                    alert('数据异常，请稍后再试...')
                }

            },
            error:function (results) {
                   alert("error")
            }
        });
}

function del(result){
    $.ajax({
        url:"/img/delImg",
        type:"POST",
        contentType: "application/x-www-form-urlencoded",
        data:{'imgid':result.id},
        success:function(results){
            if(results.status == 200){
                find();
                location.reload();
            }else{
                alert('数据异常，请稍后再试...')
            }
        },
        error:function (results) {
                alert("error")
        }
    });
}

function info(result){
    new Vue({
        el:'#app4',
        data:{
              imgid:result.id
        }
    })
}

function editDel(){
    location.reload();
}

function editUpdate(){
     var imgid = $("#editImgid").text();
     var imgname = $("#recipient-name").val();
     var editimgPath = $("#editimgPath").text();
     var messagetext = $("#message-text").val();

     var user = {'imgId':imgid,'imgName':imgname,'imgPath':editimgPath,'imgContent':messagetext};
     $.ajax({
        url:"/img/updateEdit",
        type:"POST",
        contentType: "application/json",
        data:JSON.stringify(user),
        success:function(result){
            if(result.status == 200){
                location.reload();
            }else{
                alert("编辑失败，请稍后再试！")
            }
        },
        error:function(result){
            alert("数据异常，请稍后再试！ " + result)
        }

     })
}

function addImg(){
        var imgtext = $("#imgtext").val();
        var img_file = document.getElementById("uploads").files[0];
        var formData = new FormData();
        formData.append("files",img_file);
        formData.append("imgtext",imgtext);
        var data = formData;
    $.ajax({
            url:"/img/uploadImg",
            type:"POST",
            data:data,
            dataType:"json",
            cache: false,//上传文件无需缓存
            processData: false,//用于对data参数进行序列化处理 这里必须false
            contentType: false, //必须
            success:function(result){
            console.log(result)
                if(result.status == 200){
                    location.reload();
                }else{
                    alert("编辑失败，请稍后再试！")
                }
            },
            error:function(result){
                console.log(result)
                alert("数据异常，请稍后再试！ " + result.data)
            }
         })
}



