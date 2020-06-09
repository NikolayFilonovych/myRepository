package org.itstep;

import java.util.regex.Pattern;

public class Customer // класс, инициализирующий покупателя
{
    private String firstName;  // Фамилия покупателя
    private String lastName; //Имя покупателя
    private String patronym; //Отчество покупателя

    private String email; // Электронная почта покупателя
    private String phone; // телефон покупателя

    private int age; // возраст покупателя
    private String gender; // пол покупателя
    private String password;

    public void setFirstName(String fn)
    {
        this.firstName = fn;
    } // установить фамилию покупателя

    public String getFirstName()
    {
        return this.firstName;
    } // получить фамилию покупателя


    public void setLastName(String ln)
    {
        this.lastName = ln;
    } // установить имя покупателя

    public String getLastName()
    {
        return this.lastName;
    } // получить имя покупателя


    public void setPatronym(String p)
    {
        this.patronym = p;
    } // установить отчество покупателя

    public String getPatronym()
    {
        return this.patronym;
    } // получить отчество покупателя


    public void setEmail(String em)
    {
        this.email = em;
    } // установить электронную почту покупателя

    public String getEmail()
    {
        return this.email;
    } // получить электронную почту покупателя


    public void setPhone(String ph)
    {
        this.phone = ph;
    } // установить телефон покупателя

    public String getPhone()
    {
        return this.phone;
    } // получить телефон покупателя


    public void setAge(int a)
    {
        this.age = a;
    } // установить возраст покупателя

    public int getAge()
    {
        return this.age;
    } // получить возраст покупателя


    public void setGender(String gn)
    {
        this.gender = gn;
    } // установить пол покупателя

    public String getGender()
    {
        return this.gender;
    } // получить пол покупателя

    public void setPassword(String pw)
    {
        this.password = pw;
    } // установить пароль покупателя

    public String getPassword()
    {
        return this.password;
    } // получить пароль покупателя

    public Customer() //создаем конструктор по умолчанию
    {
        this.firstName = "";
        this.lastName = "";
        this.patronym = "";
        this.email = "";
        this.phone = "";
        this.age = 0;
        this.gender = "";
        this.password = "";
    }

    // создаем конструктор со всеми параметрами
    // (Фамилия, Имя, Отчество, Электронная почта, Телефон, Возраст, Пол)
    public Customer(String firstName, String lastName, String patronym, String email, String phone, int age, String gender, String password)
    {
        firstName = firstName.trim(); // удаляем лишние пробелы из фамилии
        if(Pattern.matches("[А-Я][а-я]+",firstName)) {setFirstName(firstName);} // проверяем на валидность фамилию
        else{setFirstName("");}

        lastName = lastName.trim(); // удаляем лишние пробелы из имени
        if(Pattern.matches("[А-Я][а-я]+",lastName)) {setLastName(lastName);} // проверяем на валидность имя
        else{setLastName("");}

        patronym = patronym.trim(); // удаляем лишние пробелы из отчества
        if(Pattern.matches("[А-Я][а-я]+",patronym)) {setPatronym(patronym);} // проверяем на валидность отчество
        else{setPatronym("");}

        email = email.trim(); // удаляем лишние пробелы из электронной почты
        if(Pattern.matches("[A-Za-z_0-9]{6,12}@[A-Za-z]{1,10}.[A-Za-z]{1,10}",email)) {setEmail(email);} // проверяем на валидность электронную почту
        else{setEmail("");}

        phone = phone.trim(); // удаляем лишние пробелы из номера телефона
        if(Pattern.matches("[0-9]{10}",phone)) {setPhone(phone);} // проверяем на валидность номер телефона
        else{setPhone("");}

        if(age>=6){this.age=age;} // проверяем на валидность возраст
        else{this.age = 0;}

        gender = gender.trim(); // удаляем лишние пробелы из пола
        if(gender.equals("мужчина")||gender.equals("женщина")){setGender(gender);} // проверяем на валидность пол
        else{setGender("");}

        password = password.trim(); // удаляем лишние пробелы из номера телефона
        if(Pattern.matches("[A-Za-z0-9_]{8,12}",password)) {setPassword(password);} // проверяем на валидность номер телефона
        else{setPassword("");}
    }

    public Customer(String firstName, String lastName, String patronym) // Это конструктор с ФИО покупателя
    {
        // Здесь так же само создаем ФИО покупателя, как и в конструкторе со всеми параметрами

        firstName = firstName.trim();
        if(Pattern.matches("[А-Я][а-я]+",firstName)) {this.firstName = firstName;}
        else{this.firstName = "";}

        lastName = lastName.trim();
        if(Pattern.matches("[А-Я][а-я]+",lastName)) {this.lastName = lastName;}
        else{this.lastName = "";}

        patronym = patronym.trim();
        if(Pattern.matches("[А-Я][а-я]+",patronym)) {this.patronym = patronym;}
        else{this.patronym = "";}
    }

    public boolean checkOnValid()
    {
        boolean q = this.getFirstName().equals("") && this.getLastName().equals("") && this.getPatronym().equals("") &&
                    this.getEmail().equals("") && this.getPhone().equals("") && (this.getAge()==0) &&
                    this.getGender().equals("") && this.getPassword().equals("");

        q = !q;

        return q;
    }
}