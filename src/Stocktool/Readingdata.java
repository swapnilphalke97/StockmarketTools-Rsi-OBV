package Stocktool;
import java.io.*;  
import java.util.ArrayList;
import java.util.Scanner;  


public class Readingdata  
{  
	
	
  public ArrayList<Double> getopenprice()  throws Exception 
{  
	  ArrayList<String> lines = new ArrayList<String>();
	  ArrayList<Double> data = new ArrayList<Double>();
	   
//parsing a CSV file into Scanner class constructor  
Scanner sc = new Scanner(new File("C:\\Users\\SWAPNIL\\Documents\\relincestock.csv"));  
sc.useDelimiter(",");   //sets the delimiter pattern  
while (sc.hasNext())  //returns a boolean value  
{	
	lines.add(sc.next());
}

int j=1;
int i=7;
while(j<15)
{
 
	
   data.add(Double.parseDouble(lines.get(i)));
   i=i+6;
  
   j++;
}


sc.close();  
return data;
}

  public ArrayList<Double> getvolume()  throws Exception 
  {  
  	  ArrayList<String> line = new ArrayList<String>();
  	  ArrayList<Double> volume = new ArrayList<Double>();
  	   
  //parsing a CSV file into Scanner class constructor  
  Scanner sc = new Scanner(new File("C:\\Users\\SWAPNIL\\Documents\\relincestock.csv"));  
  sc.useDelimiter(",");   //sets the delimiter pattern  
  while (sc.hasNext())  //returns a boolean value  
  {	
  	line.add(sc.next());
  }

  int j=1;
  int i=12;
  while(j<15)
  {
   
  	 String a=line.get(i);
  	 String[] g=a.split("202");
     volume.add(Double.parseDouble(g[0]));
     
     i=i+6;
     g=null;
     j++;
  }


  sc.close();  
  return volume;
  }
  
  
  
}

