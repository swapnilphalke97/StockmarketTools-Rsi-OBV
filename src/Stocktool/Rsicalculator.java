package Stocktool;

import java.util.ArrayList;

public class Rsicalculator {
   
	 double calculateRsi(ArrayList<Double> data)
	{
		double ref=data.get(0);
		double gain=0;
		double loss=0;
		for(int i=1;i<=13;i++)
		{
			if(data.get(i)>ref)
			{//System.out.println("1");
				gain=data.get(i)-ref+gain;
				//System.out.println(gain);
			}
			else
			{
				loss=ref-data.get(i)+loss;
				
			}
			ref=data.get(i);
		}
		double rs=((gain/14)/(loss/14));
		double rsi=(100-(100/(1+rs)));
		
		return rsi;
		
	}
}
