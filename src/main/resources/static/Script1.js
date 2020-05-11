let q = 0;  // переменная для определения номера изображения

function nextIm() // получение следующего изображения
{
    if (q < 4) // если текущее изображение - не последнее
    {
        q++; // увеличиваем на единицу номер изображения
    } else // иначе переходим на самое первое изображение
    {
        //document.body.innerHTML = "";
        q = 0;
    }
    im(q); // выводим очередное изображение
    //document.getElementById('Num1').value = q1; // указываем время перехода в слайдшоу
}

let timer = null; //создаем таймер для переходов в слайдшоу
timer = setInterval(nextIm, (1000));

function im(q) // выведение изображения по номеру
{
    switch (q) { // внутри каждого кейса имеем вывод изображения и элементов интерфейса, потому что при изменении изображений контент страницы полностью очищается
        case 0:
            let im1 = document.createElement("img");
            im1.src="D:\\Мої документи\\GitHub\\myRepository\\src\\main\\resources\\Images\\picture0.jpg";
            im1.style.height='30em';
            let i1 = document.getElementById("slideShow").lastChild;
            document.getElementById("slideShow").removeChild(i1);
            document.getElementById("slideShow").appendChild(im1);
            break;
        case 1:
            let im2 = document.createElement("img");
            im2.src="D:\\Мої документи\\GitHub\\myRepository\\src\\main\\resources\\Images\\picture1.jpg";
            im2.style.height='30em';
            let i2 = document.getElementById("slideShow").lastChild;
            document.getElementById("slideShow").removeChild(i2);
            document.getElementById("slideShow").appendChild(im2);
            break;
        case 2:
            let im3 = document.createElement("img");
            im3.src="D:\\Мої документи\\GitHub\\myRepository\\src\\main\\resources\\Images\\picture2.jpg";
            im3.style.height='30em';
            let i3 = document.getElementById("slideShow").lastChild;
            document.getElementById("slideShow").removeChild(i3);
            document.getElementById("slideShow").appendChild(im3);
            break;
        case 3:
            let im4 = document.createElement("img");
            im4.src="D:\\Мої документи\\GitHub\\myRepository\\src\\main\\resources\\Images\\picture3.jpg";
            im4.style.height='30em';
            let i4 = document.getElementById("slideShow").lastChild;
            document.getElementById("slideShow").removeChild(i4);
            document.getElementById("slideShow").appendChild(im4);
            break;
        case 4:
            let im5 = document.createElement("img");
            im5.src="D:\\Мої документи\\GitHub\\myRepository\\src\\main\\resources\\Images\\picture4.jpg";
            im5.style.height='30em';
            let i5 = document.getElementById("slideShow").lastChild;
            document.getElementById("slideShow").removeChild(i5);
            document.getElementById("slideShow").appendChild(im5);
            break;
    }
}
