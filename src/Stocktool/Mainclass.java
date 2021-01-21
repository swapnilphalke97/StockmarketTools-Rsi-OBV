package Stocktool;

import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) throws Exception {
		 ArrayList<Double> data = new ArrayList<Double>();
		 ArrayList<Double> volume = new ArrayList<Double>();
       Readingdata a=new Readingdata();
	  data=a.getopenprice();
	  volume=a.getvolume();
	 //Rsicalculator.calculateRsi(data); if use static
	 Rsicalculator result = new Rsicalculator();
	  double rsi = result.calculateRsi(data);
	   System.out.println(rsi);
	   Obvcalculator result1 = new Obvcalculator();
	
	   double obv = result1.calculateobv(volume,data);
	   System.out.println(obv);
	}

}
