let q = 0;  // переменная для определения номера изображения

let timer = null;

if (timer == null)
{
    timer = setInterval("nextIm()", 3000);
}

function setIm(iu) // получение выбранного изображения
{
    let ima = document.createElement("img");
    let p = "../Images/picture" + (Number.parseInt(iu)) + ".jpg";
    ima.src=p;
    ima.style.height='30em';
    ima.style.width='50em';
    let i0 = document.getElementById("slideShow").lastChild;
    document.getElementById("slideShow").removeChild(i0);
    document.getElementById("slideShow").appendChild(ima);
    document.getElementById(iu).style.background='rgb(50,50,50)';
    q=Number.parseInt(iu);
    doCircle(q);
}

function doCircle(t)
{
    for(let r=0;r<=4;r++)
    {
        if(r!=t)
            document.getElementById(r).style.background='rgb(180,180,180)';
        else
            {
                document.getElementById(r).style.background='rgb(50,50,50)';
            }
    }
}

function nextIm() // получение следующего изображения
{
    im(q); // выводим очередное изображение
    if (q < 4) // если текущее изображение - не последнее
    {
        q++; // увеличиваем на единицу номер изображения
    }
    else // иначе переходим на самое первое изображение
    {q = 0;}
}

function im(q) // выведение изображения по номеру
{
    switch (q) { // внутри каждого кейса имеем вывод изображения и элементов интерфейса, потому что при изменении изображений контент страницы полностью очищается
        case 0:
            let im1 = document.createElement("img");
            im1.src = "../Images/picture0.jpg";
            im1.style.height = '30em';
            im1.style.width = '50em';
            let i1 = document.getElementById("slideShow").lastChild;
            document.getElementById("slideShow").removeChild(i1);
            document.getElementById("slideShow").appendChild(im1);
            doCircle(0);
            break;
        case 1:
            let im2 = document.createElement("img");
            im2.src = "../Images/picture1.jpg";
            im2.style.height = '30em';
            im2.style.width = '50em';
            let i2 = document.getElementById("slideShow").lastChild;
            document.getElementById("slideShow").removeChild(i2);
            document.getElementById("slideShow").appendChild(im2);
            doCircle(1);
            break;
        case 2:
            let im3 = document.createElement("img");
            im3.src = "../Images/picture2.jpg";
            im3.style.height = '30em';
            im3.style.width = '50em';
            let i3 = document.getElementById("slideShow").lastChild;
            document.getElementById("slideShow").removeChild(i3);
            document.getElementById("slideShow").appendChild(im3);
            doCircle(2);
            break;
        case 3:
            let im4 = document.createElement("img");
            im4.src = "../Images/picture3.jpg";
            im4.style.height = '30em';
            im4.style.width = '50em';
            let i4 = document.getElementById("slideShow").lastChild;
            document.getElementById("slideShow").removeChild(i4);
            document.getElementById("slideShow").appendChild(im4);
            doCircle(3);
            break;
        case 4:
            let im5 = document.createElement("img");
            im5.src = "../Images/picture4.jpg";
            im5.style.height = '30em';
            im5.style.width = '50em';
            let i5 = document.getElementById("slideShow").lastChild;
            document.getElementById("slideShow").removeChild(i5);
            document.getElementById("slideShow").appendChild(im5);
            doCircle(4);
            break;
    }
}