var shoesSize = true;
var shoesNum = true;
var shoSize = null;
var shoNum = null;
var colorName = null;
var shoesName = null;




function chooseSize(){
    if(shoesSize) {
        document.getElementById("shoes-size").style.visibility = "visible";
        shoesSize = false;
    }else{
        document.getElementById("shoes-size").style.visibility = "hidden";
        shoesSize = true;
    }

}


function chooseNum(){
    if(shoesSize) {
        document.getElementById("shoes-num").style.visibility = "visible";
        shoesSize = false;
    }else{
        document.getElementById("shoes-num").style.visibility = "hidden";
        shoesSize = true;
    }
}

function chooesSizeli(sizeLi){
    var size = sizeLi.innerText;
    document.getElementById("hidden_size").value = size;

    document.getElementById("goods-property-size").children[0].innerText = "尺码：" + size;
    document.getElementById("shoes-size").style.visibility = "hidden";
    shoesSize = true;
}

function byNum(numli){
    var num = numli.innerText;
    document.getElementById("hidden_num").value = num;
    document.getElementById("goods-property-size").children[1].innerText = "数量："+num;
    document.getElementById("shoes-num").style.visibility = "hidden";
    shoesNum = true;
}

function color(col){
    var colorDiv = document.getElementById("goods-property-color").children;
    for(var i = 0; i<colorDiv.length;i++){
        colorDiv[i].style.cssText = "border :none;"
    }
    col.style.cssText = "border :1px solid cornflowerblue;"
    document.getElementById("hidden_color").value = col.children[0].innerText;
}

function shoesImg(imgSrc){
    document.getElementById("goods-img").children[0].src = imgSrc.src;
}


function buyNow(){
    document.getElementById("hidden_name").value = document.getElementById("goods-property-price").children[0].innerText
    var url = "/shoesStore/buyNow";
    document.getElementById("frombiaodan").setAttribute("action",url);

}

function addCart(){
    var url = "/addCart";
    shoesName = document.getElementById("goods-property-price").children[0].innerText;
    if(shoNum!=null && shoSize != null && colorName != null && shoesName!=null){
        window.location.href=url+"?colorName="+colorName+"&shoesNum="+shoNum+"&shoesSize="+shoSize+"&shoesName="+shoesName;
    }
}
