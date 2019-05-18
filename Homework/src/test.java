
import java.util.Scanner;

import com.sun.tools.javac.Main;

public class test {

	public static void printAvg(int... marks) {
		//final int N = 3;
	
		int sum = 0, avg = 0;
		for (int i = 0; i < marks.length; i++) {
			//System.out.println("pls enter"+name+"student score:");
		
			 sum += marks[i];
			 System.out.println(avg);
		}
		avg = sum/marks.length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printAvg(15,20,30);
		
	/*	Scanner input = new Scanner(System.in);
		String name = null;
		
		
		System.out.println("pls enter the name:");
		name = input.nextLine(); */
		
		
		
	/*	
		if(avg >=90 && avg <=100) {
			System.out.println("name"+name+"grade A");
		} else if(avg >=80 && avg <=89) {
			System.out.println("name"+name+"grade B");
		}else if(avg >=70 && avg <=79) {
			System.out.println("name"+name+"grade C");
		}else if(avg >=60 && avg <=69) {
			System.out.println("name"+name+"grade D");
		}else if(avg >=0 && avg <=59) {
			System.out.println("name"+name+"grade F");
		} */
	}
	}


