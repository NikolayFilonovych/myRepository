package org.itstep;

public class Product  //
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

    public void setName(String n)
    {
        this.name = n;
    }

    public String getName()
    {
        return this.name;
    }

    public void setSuperCategory(String spc)
    {
        this.superCategory = spc;
    }

    public String getSuperCategory()
    {
        return this.superCategory;
    }

    public void setSubCategory(String sbc)
    {
        this.name = sbc;
    }

    public String getSubCategory()
    {
        return this.name;
    }

    public void setPrice(double p)
    {
        this.price = p;
    }

    public double getPrice()
    {
        return this.price;
    }

    public String toString()
    {
        return " Product " + this.name + " costs " + this.price + ", belongs to " + this.superCategory + " and is " + this.subCategory;
    }
}