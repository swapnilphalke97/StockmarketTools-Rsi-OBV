package Stocktool;

import java.util.ArrayList;

public class Obvcalculator {

	double calculateobv(ArrayList<Double> volume,ArrayList<Double> data)
	{
		double intdata=data.get(0);
		double obv=0;
		for(int i=1;i<=13;i++)
		{
			if(data.get(i)>intdata)
			{
				obv=obv+volume.get(i);
			}
			else
			{
				obv=obv-volume.get(i);
				
			}
			intdata=data.get(i);
		}
		
		
		return obv;
		
	}
}
