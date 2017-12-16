function run() {
    $.ajax({
        url:"bloguser/select",
        type:"GET",
        success:function(result){

            var json = [{"userId":null,"imgId":null,"forumId":null,"likeId":null,"userName":null,"userPassword":null,"userEmail":"627756022@163.com","userGender":null,"userAge":null,"userDate":null},
                {"userId":null,"imgId":null,"forumId":null,"likeId":null,"userName":null,"userPassword":null,"userEmail":"y627756022@163.com","userGender":null,"userAge":null,"userDate":null}];

            $.each(json.userEmail,function (index) {
                alert(index);
            });

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