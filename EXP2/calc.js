function add() {
    let num1 = parseInt(document.getElementById("firstop").value);
    let num2 = parseInt(document.getElementById("secondop").value);
    var ans = num1 + num2;
    console.log(ans);
    document.getElementById("answer").value = ans;
}

function sub() {
    let num1 = parseInt(document.getElementById("firstop").value);
    let num2 = parseInt(document.getElementById("secondop").value);
    var ans = num1 - num2;
    document.getElementById("answer").value = ans;
}

function mul() {
    let num1 = parseInt(document.getElementById("firstop").value);
    let num2 = parseInt(document.getElementById("secondop").value);
    var ans = num1 * num2;
    document.getElementById("answer").value = ans;
}

function div() {
    let num1 = parseInt(document.getElementById("firstop").value);
    let num2 = parseInt(document.getElementById("secondop").value);
    var ans = num1 / num2;
    document.getElementById("answer").value = ans;
}
