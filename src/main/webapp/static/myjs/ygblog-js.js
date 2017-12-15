function run() {
    $.ajax({
        url:"bloguser/select",
        type:"GET",
        success:function(result){
            alert(result);
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