package org.itstep;

public class Customer
{
    private String firstName;
    private String lastName;
    private String patronym;

    private String email;
    private String phone;

    private int age;
    private String gender;


    public void setFirstName(String fn)
    {
        this.firstName = fn;
    }

    public String getFirstName()
    {
        return this.firstName;
    }


    public void setLastName(String ln)
    {
        this.lastName = ln;
    }

    public String getLastName()
    {
        return this.lastName;
    }


    public void setPatronym(String p)
    {
        this.patronym = p;
    }

    public String getPatronym()
    {
        return this.patronym;
    }


    public void setEmail(String em)
    {
        this.email = em;
    }

    public String getEmail()
    {
        return this.email;
    }


    public void setPhone(String ph)
    {
        this.phone = ph;
    }

    public String getPhone()
    {
        return this.phone;
    }


    public void setAge(int a)
    {
        this.age = a;
    }

    public int getAge()
    {
        return this.age;
    }


    public void setGender(String gn)
    {
        this.gender = gn;
    }

    public String getGender()
    {
        return this.gender;
    }

    public Customer()
    {
        this.firstName = "fn";
        this.lastName = "ln";
        this.patronym = "p";
        this.email = "adress@email.dom";
        this.phone = "+0123456789";
        this.age = 18;
        this.gender = "man";
    }

    public Customer(String f, String n, String p, String e, String t, int a, String g)
    {
        this.firstName = f;
        this.lastName = n;
        this.patronym = p;
        this.email = e;
        this.phone = t;
        this.age = a;
        this.gender = g;
    }
}