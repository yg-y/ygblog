function run() {
    $.ajax({
        url:"bloguser/select",
        type:"GET",
        success:function(result){
            alert(result);
        }
    });
}