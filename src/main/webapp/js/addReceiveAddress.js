function address_detail(arg) {
if(arg.value==null||arg.value==""){
    document.getElementById("address-detail-info").innerText="请输入详细信息";
}else {
    document.getElementById("address-detail-info").innerText=null;
}
}

function port_number(arg) {
    if(arg.value==null||arg.value==""){
        document.getElementById("port-number-info").innerText="请输入邮编信息";
    }else if(!/^\d{6}$/.test(arg)){
        document.getElementById("port-number-info").innerText="邮编为6位纯数字";
    } else {
        document.getElementById("port-number-info").innerText=null;
    }
}

function contact_name(arg) {
    if(arg.value==null||arg.value==""){
        document.getElementById("contact-name-info").innerText="请输入收件人姓名";
    }else if(!/^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$/.test(arg)){
        document.getElementById("contact-name-info").innerText="请输入正确姓名";
    }else {
        document.getElementById("contact-name-info").innerText=null;
    }
}

function contact_phone(arg) {
    if(arg.value==null||arg.value==""){
        document.getElementById("contact-phone-info").innerText="请输入收件手机号";
    }else if(!/^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$/.test(arg)){
        document.getElementById("port-number-info").innerText="请输入正确手机号";
    }
    else {
        document.getElementById("contact-phone-info").innerText=null;
    }
}

function submitcheck() {

}