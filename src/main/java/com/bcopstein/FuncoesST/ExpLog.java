package com.bcopstein.FuncoesST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExpLog {
	
	private List<Double> ex = new ArrayList<Double>();
	
	
	public Iterator<Double> getTermos(){
		try{
			return ex.iterator();
		}catch(UnsupportedOperationException o) {
			throw new UnsupportedOperationException();
		}
	}
	
	public double exp(double x) {
		try {
			ex.clear();
			double valor = 1;
			int cont = 0;
			while(valor > Math.pow(10, -6)) {
				
				double numElevado = Math.pow(x, cont);
				valor = numElevado / Util.fatorial(cont);
				ex.add(valor);
				cont++;
			}		
		
			return Util.somatorio(0,cont,ex); 
			
		}catch(UnsupportedOperationException o) {
			throw new UnsupportedOperationException();
		}
	}

	public double log(double x) {
		try {
			ex.clear();
			if(Math.abs(x) > 1) {
				return 0;
			}else {	
				double valor = 1;
				int n =0;
				while(Math.abs(valor) > Math.pow(10, -6)) {
					valor = (Math.pow(-1, n) / (n+1)) * Math.pow(x, n+1);
					ex.add(valor);
					n++;
				}		
				return Util.somatorio(0, n, ex);
			}
		}catch(UnsupportedOperationException o) {
			throw new UnsupportedOperationException();
		}
		
	}
}
