package com.bcopstein.FuncoesST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Trig {
	private List<Double> lista;
	public Iterator<Double> getTermos(){
		for (double x:lst) {
			
		}
		throw new UnsupportedOperationException();
	}

	public double cos(double x) {
		double cos =0 ;
		try {
			double lim = 10E-6;
			double termo = (Math.pow(-1, 0)/Util.fatorial(2*0))*Math.pow(x, 2*0);
			lista.add(termo);
			int n = 1;
			while (termo > lim) {
				termo = (Math.pow(-1, n)/Util.fatorial(2*n))*Math.pow(x, 2*n);
				lista.add(termo);
				n++;
			}
			cos = Util.somatorio(0, n, lista);
			
		}catch (UnsupportedOperationException ex) {
			System.out.println(ex);
		}
		return cos;
	}

	public double sin(double x) {
		// TODO:
		throw new UnsupportedOperationException();
	}
}
