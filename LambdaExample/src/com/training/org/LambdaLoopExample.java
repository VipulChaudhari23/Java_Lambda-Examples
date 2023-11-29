package com.training.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaLoopExample {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();  
		list.add("Eshan");
		list.add("Anand");
		list.add("Prashant");

		
		//first loop normal loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//second loop for each loop
		for (String str : list) {
			System.out.println(str);
		}
		
		//Third loop Iterator loop
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String str = (String) iterator.next();
			System.out.println(str);
		}
		
		//Fourth loop For each loop using lambda function
        list.forEach(  
                (n)->System.out.println(n)  
        );  
	}
}
