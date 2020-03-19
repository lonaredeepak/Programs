package com.company;

import java.util.*;


 class method_overriding
{
    puw 3blic void test(int a)
    {
        System.out.println(a);
    }
}
 class showDP extends method_overriding
 {
     public void test(int a)
     {
         System.out.println(a);
     }

     public static void main(String[] args)
    {
        showDP sp = new showDP();
        method_overriding sp2 = new showDP();
        sp.test(1);
        sp2.test(41);

    }
}
