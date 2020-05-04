function setColor() {
    let r = document.getElementById("red").value;
    if (r == "") r = 0;

    let g = document.getElementById("green").value;
    if (g == "") g = 0;

    let b = document.getElementById("blue").value;
    if (b == "") b = 0;

    let colo = "rgb(" + r + "," + g + "," + b + ")";
    document.getElementById("bg").style.background = colo;
    return colo;
}

function addCategory() {
    let t = document.getElementById("title").value;
    if (t == "") {
        alert("Категории с пустым именем быть не может!")
    } else {
        let shop = document.createElement("div");
        shop.classList.add("shop");
        shop.innerText = t;
        shop.style.background = setColor();
        document.getElementById("hiperm").appendChild(shop);
    }
}
