package exceptionPackage;

import java.util.Scanner;

import adapterPackage.BuildAuto;
import adapterPackage.CreatableAuto;

public class ExceptionFixes extends Exception {
	private int num;
	
	protected ExceptionFixes() {
		num = -1;
		fixError(num);
	}
	
	protected ExceptionFixes(int num) {
		this.num = num;
		fixError(num);
	}
	
	protected String fixError(int num) {
		switch (num) { 
        case 101: 
//        	errorMsg = "Missing file name"; 
        	System.out.printf("Please enter new file location: ");
        	
        	Scanner ss = new Scanner(System.in);
        	String s = ss.next(); // Reads in first word
        	
        	CreatableAuto a1 = new BuildAuto();
        	a1.BuildAuto(s);
        	break; 
        case 201: 
//        	errorMsg = "Missing base price"; 
        	System.out.printf("Please enter new base price: ");
        	Scanner aa = new Scanner(System.in);
        	int a = Integer.parseInt(aa.next());
        	BuildAuto q = new BuildAuto();
            break; 
        case 301: 
//        	errorMsg = "Missing array size"; 
            break; 
        case 401: 
//        	errorMsg = "Missing option set data"; 
            break; 
        case 501: 
//        	errorMsg = "Missing option data"; 
            break; 
        default: 
//        	errorMsg = "Some unknown error occured!"; 
            break; 
        }
		return "";
	}
}
