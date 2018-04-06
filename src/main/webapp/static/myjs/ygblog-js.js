$(document).ready(function() {
    find();
});

function find(){
    $.ajax({
        url:"/img/indexImg",
        type:"GET",
        // contentType: "from/date",
        success:function(result){
            if(result.status == 200){
                console.log(result.data[0].imgPath)
                console.log(result.data[1].imgPath)
                // // alert(result.data[0].imgPath);
                new Vue({
                   el:'#indexId',
                   data:{
                       images1:result.data[0].imgPath,
                       images2:result.data[1].imgPath,
                       images3:result.data[2].imgPath,
                       images4:result.data[3].imgPath,
                       images5:result.data[4].imgPath,
                       images6:result.data[5].imgPath,
                       images7:result.data[6].imgPath,
                       images8:result.data[7].imgPath
                   }
                })
            }else {
                alert("error")
            }
        },
        error:function (result) {
            if(result == "error"){
                alert("亲！请检查一下网络哦！")
            }
        }
    });
}

function run() {
    $.ajax({
        url:"bloguser/select",
        type:"GET",
        success:function(result){
            var user = result;
            //功能测试，遍历循环出用户邮箱
            $.each(user,function (index,items) {
                alert(items.userEmail);
            })

            //alert("success!")

        },
        error:function (result) {
            alert("亲！请检查一下网络哦！")
        }
    });
}
function Loding() {
    var path=location.hostname;
    var port = location.port;
    var pathport = path+":"+port;
    alert(pathport);
    //如果点击加载更多，则执行这个函数，加载完后文本重置。
    // var a_imgloding = $('#a_imgLonding');
    // a_imgloding.innerHTML = '加载中...';
    $('#a_imgLonding').text("加载中...");
    setInterval(function () {
        $('#a_imgLonding').text("加载更多");
    },2000)
}