function run() {
    $.ajax({
        url:"bloguser/select",
        type:"GET",
        success:function(result){
            $.each(result,function (index) {
                var str = JSON.parse(index);
                alert("index:"+str);
            })
        },
        error:function (result) {
          alert("数据出错！");
        }
    });
}
function Loding() {
    //如果点击加载更多，则执行这个函数，加载完后文本重置。
    // var a_imgloding = $('#a_imgLonding');
    // a_imgloding.innerHTML = '加载中...';
    $('#a_imgLonding').text("加载中...");
    setInterval(function () {
        $('#a_imgLonding').text("加载更多");
    },2000)
}