let q = 0;  // переменная для определения номера изображения

function nextIm() // получение следующего изображения
{
  if(q<6) // если текущее изображение - не последнее
  {
    q++; // увеличиваем на единицу номер изображения
  }
  else // иначе переходим на самое первое изображение
  {
    document.body.innerHTML="";
    q=0;
  }
  im(q); // выводим очередное изображение
  document.getElementById('Num1').value = q1; // указываем время перехода в слайдшоу
}

let timer = null; //создаем таймер для переходов в слайдшоу
timer = setInterval(nextIm,(3000));

function im(q) // выведение изображения по номеру
{
  switch (q) { // внутри каждого кейса имеем вывод изображения и элементов интерфейса, потому что при изменении изображений контент страницы полностью очищается
    case 0:
      document.write("<img src='Images/BC.jpg' height='500'/>");
      //buttons();
      break;
    case 1:
      document.body.innerHTML="";
      document.write("<img src='Images/EJBC.png' height='500'/>");
      //buttons();
      break;
    case 2:
      document.body.innerHTML="";
      document.write("<img src='Images/forest.jpg' height='500'/>");
      //buttons();
      break;
    case 3:
      document.body.innerHTML="";
      document.write("<img src='Images/Honda.jpg' height='500'/>");
      //buttons();
      break;
    case 4:
      document.body.innerHTML="";
      document.write("<img src='Images/JavaScript.gif' height='500'/>");
      //buttons();
      break;
    case 5:
      document.body.innerHTML="";
      document.write("<img src='Images/PHP.png' height='500'/>");
      //buttons();
      break;
    case 6:
      document.body.innerHTML="";
      document.write("<img src='Images/plain.jpg' height='500'/>");
      //buttons();
      break;
  }
}
