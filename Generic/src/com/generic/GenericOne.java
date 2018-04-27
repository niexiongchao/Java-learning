 package com.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericOne {
	public static void printIntValue(List<? extends Number> list){
		for(Number number:list){
			System.out.print(number.intValue()+" ");

		}
		System.out.println();
	}
	
//Ã·Ωª
	    public static void main(String[] args)
	    {
	    	
	 
	        int x = 0;
	        int y = 0;
	        int k = 0;
	        for (int z = 0; z < 5; z++) {
	            if ((++x > 2) && (++y > 2) && (k++ > 2))
	            {
	                x++;
	                ++y;
	                k++;
	            }
	        }
	        System.out.println(x +"" +y + "" +k);
	    }
	}



