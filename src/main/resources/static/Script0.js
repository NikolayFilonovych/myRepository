
function opt()
{
    let v = document.createElement("p");
    v.style.background = 'violet';
    v.style.color = 'white';
    v.style.margin = '1em';
    v.style.padding = '1em';
    v.innerText = 'You are strange here...';
    document.getElementById("rest").appendChild(v);
}

function mainview() // функция для возвращения к главному виду сайта
{
    document.getElementById('show_and_actions').style.display='block';
    document.getElementById('hyp').style.display='block';
}

function help() // функция для перехода к помощи
{
    document.getElementById("show_and_actions").style.display = "none";
    document.getElementById("hyp").style.display = "none";
    document.getElementById("rest").style.background = "white";
}

function about() // функция для перехода к справке о гипермаркете
{
    document.getElementById("show_and_actions").style.display = "none";
    document.getElementById("hyp").style.display = "none";
    document.getElementById("rest").style.background="white";
}

function conditions() // функция для перехода к справке об условиях использования
{
    document.getElementById("show_and_actions").style.display = "none";
    document.getElementById("hyp").style.display = "none";
    document.getElementById("rest").style.background="white";
}

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
