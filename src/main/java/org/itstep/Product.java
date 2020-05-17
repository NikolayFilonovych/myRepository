package org.itstep;

public class Product
{
    private String name;
    private double price;

    private String superCategory;
    private String subCategory;

    public Product()
    {
        name = "Product";
        price = 0;

        superCategory = "none";
        subCategory = "none";
    }

    public Product(String superCategory, String subCategory, String name, double price)
    {
        this.superCategory = superCategory;
        this.subCategory = subCategory;

        this.name = name;
        this.price = price;
    }
}