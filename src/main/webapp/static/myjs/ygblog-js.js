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
          alert("数据出错！");
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