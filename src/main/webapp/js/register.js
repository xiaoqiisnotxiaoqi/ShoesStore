//头部
function mouseon(navli) {
    navli.className="onmousenav" ;
}
function mouseout(navli) {
    navli.className=""
}


//判断是不是手机号
function isPoneAvailable(poneInput) {
    var myreg = /^[1][3,4,5,7,8][0-9]{9}$/;
    if (!myreg.test(poneInput.value)) {
       document.getElementById("telno-tip").innerText = "请输入有效手机号";
    } else {
        document.getElementById("telno-tip").innerText = " ";
    }
}//判断是不是四位数字验证码
function isYzmAvailable(yzmInput) {
    var reg=/^\d{4}$/;
    if (!reg.test(yzmInput.value)) {
       document.getElementById("yzm-tip").innerText = "请输入有效验证码";
    } else {
        document.getElementById("yzm-tip").innerText = " ";
    }
}
//判断是不是邮箱
function isEmailAvailable(emailInput) {
    var myreg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
    if (!myreg.test(emailInput.value)) {
        document.getElementById("email-tip").innerText = "请输入有效邮箱";
    } else {
        document.getElementById("email-tip").innerText = " ";
    }
}

//判断是不是有效密码
function isPasswdAvailable(passwdInput) {
    var myreg = /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$/;
    if (!myreg.test(passwdInput.value)) {
        document.getElementById("passwd-tip").innerText = "请输入6-16位字母和数字组合";
    } else {
        document.getElementById("passwd-tip").innerText = " ";
    }
}