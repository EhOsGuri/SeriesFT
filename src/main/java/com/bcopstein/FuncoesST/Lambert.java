package com.bcopstein.FuncoesST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bcopstein.FuncoesST.Util;

public class Lambert {
	
	public List<Double> list = new ArrayList<Double>();
	
	public Iterator<Double> getTermos(){
		return list.iterator();
	}
	
	public double W0(double x) {
		int n = 1;
		Double r = 0.0;
		
		try{
			do {
				Double w = (Math.pow(-n, n-1)/Util.fatorial(n))*Math.pow(x, n);
				list.add(w);
				n++;
			}while(Math.abs(x)<(1/Math.E));
			
			for(int i=0; i<list.size();i++) {
				r += list.get(i);
			}
	
		}catch(IllegalArgumentException e){
			System.out.println("Tipo de entrada invalida");
		}
		
		
		return r/list.size();
	}
}
