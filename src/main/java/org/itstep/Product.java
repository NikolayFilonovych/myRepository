package org.itstep;

public class Product  // класс, инициализирующий продукт
{
    private String brand; // маркка продукта
    private String name; // название продукта
    private double price; // цена продукта

    private String category; // категория продукта

    public Product() // создаем конструктор по умолчанию
    {
        brand = "Марка";
        name = "Продукт";
        price = 0;
        category = "нет";
    }

    public Product(String brand, String name, double price, String category) // создаем конструктор с параметрами
    {
        this.brand = brand;
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public void setBrand(String b) // установить марку продукта
    { this.brand = b; }

    public String getBrand() // получить марку продукта
    { return this.brand; }

    public void setName(String n) // установить название продукта
    { this.name = n; }

    public String getName() // получить название продукта
    { return this.name; }

    public void setCategory(String sc) // установить категорию продукта
    { this.category = sc; }

    public String getCategory() // получить категорию продукта
    { return this.category; }

    public void setPrice(double p) // установить цену продукта
    { this.price = p; }

    public double getPrice() // получить цену продукта
    { return this.price; }

    @Override
    public String toString() // переопределённый метод для получения строки, содержащей информацию о продукте
    {
        return " Продукт " + getName() + " марки " + getBrand() + " стоит " + getPrice() + ", принадлежит к " + getCategory() + ".";
    }
}