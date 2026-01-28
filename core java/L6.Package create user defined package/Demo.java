package vijay;     //package( vijay name ka folder create karo)
public class Demo  // public export karne ka leya likha hai  (kisi or package me access karne ka leya class ka public hona jarure hai) 
{                               
    int x;
    int y;
    public void fun1()   // public function export karne ka leya likha hai (kisi or package me access karne ka leya function ka public hona jarure hai) 
    {
       x=5;
       y=6;
    }
    public void fun2()// public function export karne ka leya likha hai (kisi or package me access karne ka leya function ka public hona jarure hai) 
    {
       System.out.println(x);
       System.out.println(y);
    }
}