package org.itstep;

import java.util.LinkedList;

public class CustomerBase
{
    private LinkedList<Customer> customersBase = new LinkedList<>();

    private int size;

    public CustomerBase()
    {
        this.size = 0;
    }

    public void addCustomer(Customer c)
    {
        if(c.checkOnValid())
        {
            customersBase.add(c);
            size++;
        }
    }

    public void addCustomer(String f, String n, String p, String e, String t, int a, String g, String pass)
    {
        Customer c = new Customer(f,n,p,e,t,a,g,pass);

        if(c.checkOnValid())
        {
            customersBase.add(c);
            size++;
        }
    }

    public int getSize()
    {
        return this.size;
    }


}
