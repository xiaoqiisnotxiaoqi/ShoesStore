/**
 * Created by Administrator on 2018\9\6 0006.
 */
function check_user_name(checkName){
    var reg = /^[A-Za-z0-9]+$/;
    var hints = document.getElementsByClassName("hint");
    if(checkName.value==null|| !reg.test(checkName.value)){
        hints[0].innerText="用户名必须由字母和数字组成";
    }else{
        hints[0].innerText=null;
    }
}

function check_age(checkAge){
    var reg = /^\+?[1-9][0-9]*$/;
    var hints = document.getElementsByClassName("hint");
    if(checkAge.value==null|| !reg.test(checkAge.value)){
        hints[1].innerText="年龄格式不正确";
    }else{
        hints[1].innerText=null;
    }
}