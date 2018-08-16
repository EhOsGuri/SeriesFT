package com.bcopstein.FuncoesST;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ExpLog el = new ExpLog();
       
       //System.out.println("valor: "+el.log(0.7));
       System.out.println("Valor: "+el.exp(5));
       Iterator it = el.getTermos();
       
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
    }
}
