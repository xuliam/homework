import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// N is number of students. 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of Students");
		int N = input.nextInt();
		// clarify the variable of 6 arraies and defined them. 
		String [] names = new String[N];
		int [] marks1 = new int[N];
		int [] marks2 = new int[N];
		int [] marks3 = new int[N];
		int[] avgs = new int[N];
		char[] grades= new char[N];
		
		
		//input the NO. of 6 variable 
		for (int i = 0; i < N; i++) {
			System.out.print("Pls Enter"+(i+1)+"Student Name:");
            names[i] = input.next();//next char and string
			System.out.print("Pls Enter"+names[i]+"'s "+"Frist Score");
			marks1[i] = input.nextInt();
			System.out.print("Pls Enter"+names[i]+"'s "+"Second Score");
			marks2[i] = input.nextInt();
			System.out.print("Pls Enter"+names[i]+"'s "+"Third Score");
			marks3[i] = input.nextInt();
			// calculated the average
			avgs[i] = (marks1[i] + marks2[i] + marks3[i])/3;
			// give grades to students
			if(avgs[i]>=90 && avgs[i]<=100) {
				grades[i]='A';
			}else if(avgs[i]>=80 && avgs[i]<=89) {
				grades[i] ='B';
			}else if(avgs[i]>=70 && avgs[i]<=79) {
				grades[i] ='C';
			}else if(avgs[i]>=60 && avgs[i]<=69) {
				grades[i] ='D';
			}else if(avgs[i]>=0 && avgs[i]<=59) {
				grades[i] ='F';
			}
		}
		//print out the array and the list
		System.out.println("Student      Average           Grade");
		for (int i = 0; i < N; i++) {
			System.out.println(names[i]+ "\t\t"+avgs[i]+ "\t\t"+grades[i]);
		}
		
		choose(input, N, names, marks1, marks2, marks3, avgs, grades);
		
		}

	private static void choose(Scanner input, int N, String[] names, int[] marks1, int[] marks2, int[] marks3,
			int[] avgs, char[] grades) {
		while (true) {
			
		
			System.out.println("========================================================================================");
			System.out.println(" 1. Print the entire list\n 2. Sort and print the list alphabetically\n 3. Sort and print the list in descending order based on the average.\n 4. Find the student who has the maximum average \n 5. Find the student who has the minium average \n 6. Print the grade distribution \n 0. Exit");
			System.out.println("========================================================================================");
			// show choice for users
			System.out.print("Enter your choice?");
			int M = -1;
			int countA = 0, countB =0, countC = 0, countD = 0, countF = 0;
			M = input.nextInt();
			// show the total list of users.
			if(M==1) {
				System.out.println("Student"+"\t\t"+"Mark1"+"\t\t"+"Mark2"+"\t\t"+"Mark3"+"\t\t"+"Average"+"\t\t"+"Grade");
			for (int i = 0; i < N; i++) {
				System.out.println(names[i]+ "\t\t"+marks1[i]+"\t\t"+marks2[i]+ "\t\t"+marks3[i]+ "\t\t"+avgs[i]+ "\t\t"+grades[i]);
				}
			}else if(M==2) {
				Arrays.sort(names);
				for(String name : names) {
					System.out.println(name);
				}
				System.out.println("加油");
				
			}else if (M==3) {
				for (int i = 0; i < N-1; i++) {
					for (int j = 0; j < N-i-1; j++) {
						if(avgs[j]<avgs[j+1]) {
							int temp = avgs[j];
							avgs[j]= avgs[j+1];
							avgs[j+1]= temp;
							
							String temp1 = names[j];
							names[j]= names[j+1];
							names[j+1] =temp1;
							
							int temp2 = marks1[j];
							marks1[j]= marks1[j+1];
							marks1[j+1] =temp2;
							
							int temp3 = marks2[j];
							marks2[j]= marks2[j+1];
							marks2[j+1] =temp3;
							
							int temp4 = marks3[j];
							marks3[j]= marks3[j+1];
							marks3[j+1] =temp4;
							
							char temp5 = grades[j];
							grades[j] = grades[j+1];
							grades[j+1] = temp5;
							
						}
					}
				}
				System.out.println("Student"+"\t\t"+"Mark1"+"\t\t"+"Mark2"+"\t\t"+"Mark3"+"\t\t"+"Averge"+"\t\t"+"Grade");
				for (int i = 0; i < N; i++) {
					System.out.println(names[i] +"\t\t"+marks1[i]+"\t\t"+marks2[i]+"\t\t"+marks3[i]+"\t\t"+ avgs[i]+"\t\t"+grades[i]);
				}
				

			}else if (M==4) {
				int max = avgs[0];
				for ( int i = 0; i < N; i++) {
					if(avgs[i]>max) {
						max = avgs[i];
					}
				}
				String goodName = null;
				int searchIndex = -1;
				for (int i = 0; i < N; i++) {
					if(max == avgs[i]) {
						searchIndex= i;
						break;
					}
				}
				goodName = names[searchIndex];
				System.out.println("Student with max average is: "+goodName+"\t\t"+"Average="+ max);
			}else if (M==5) {
				int min = avgs[0];
				for ( int i = 0; i < N; i++) {
					if(avgs[i]<min) {
						min = avgs[i];
					}
				}
				String badName = null;
				int searchIndex = -1;
				for (int i = 0; i < N; i++) {
					if(min == avgs[i]) {
						searchIndex= i;
						break;
					}
				}
				badName = names[searchIndex];
					System.out.println("Student with min average is: "+badName+"\t\t"+ "Average="+min);
			
				//show the grade distribution
			}else if(M==6) {
				for (int i = 0; i < grades.length; i++) {
					if('A' == grades[i]) {
						countA += 1;
					}
					if('B' == grades[i]) {
						countB += 1;
					}
					if('C' == grades[i]) {
						countC += 1;
					}
					if('D' == grades[i]) {
						countD += 1;
					}
					if('F' == grades[i]) {
						countF += 1;
					}
				}
				System.out.println("Grade Distribution: A = "+ countA + "     "+"B = "+ countB  + "     "+"C = "+ countC  + "     "+"D = "+ countD+ "     "+"F = "+ countF);
				
			}else if(M==0){
				break;
			}
			//System.out.println("go on? Y/N");
			//String answer = new Scanner(System.in).next();
			//if("N".equalsIgnoreCase(answer)) {
			//	break;
			//}
		}
		
		}
		
		
	}
	


