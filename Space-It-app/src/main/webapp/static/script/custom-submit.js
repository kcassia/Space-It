$("#Space-submit").click(function() {
    var d = new Date();
    var real_time = d.toLocaleTimeString() + ":" + d.getMilliseconds()
    $("#Space-time").val(real_time);
    console.log($("#Space-time").val());
    $("#Space-It").submit();
});
