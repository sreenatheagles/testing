package com.example;

public class Caculator {

    public static void main(String[]args){}
    
    Service s;

    public Caculator(Service s)
	{
		this.s = s;
	}
    
    public Caculator()
    {

    }

    public boolean isGreater(int x , int y)
    {
        if(x>y)
            return true;
        else
            return false;
    }

    public boolean isLess(int x, int y)
    {
        if(x<y)
            return true;
        else
            return false;
    }

    public boolean isGreaterFromService(int x , int y)
    {

        return s.greater(x, y);
    }

    public boolean isLessFromService(int x, int y)
    {
        return s.less(x, y);
    }

}
