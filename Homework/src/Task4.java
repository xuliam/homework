import java.util.Scanner;

public class Task4 {

	public static int M = -1;
	public static int N = 0;
	private static String names[] ;
	private static int [] marks1 ;
	public static int [] marks2;
	public static int [] marks3;
	public static int[] avgs ;
	public static char[] grades; 
	public static int i;
	
	public static void printList(int N) {
		
		System.out.println("Student"+"  "+"Mark1"+"  "+"Mark2"+"  "+"Mark3"+"  "+"Average"+"  "+"Grade");
		for (int i = 0; i < N; i++) {			
			System.out.println(names[i]+ " "+marks1[i]+" "+marks2[i]+ " "+marks3[i]+ " "+avgs[i]+ " "+grades[i]);
			return;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String [] names = new String[N];
		int [] marks1 = new int[N];
		 int [] marks2 = new int[N];
		 int [] marks3 = new int[N];
		 int[] avgs = new int[N];
		 char[] grades= new char[N];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of Students");
		N = input.nextInt();
				
		
		
		for (int i = 0; i < N; i++) {
			System.out.print("Pls Enter"+(i+1)+"Student Name:");
            names[i] = input.next();//next char and string
			System.out.print("Pls Enter"+names[i]+"'s "+"Frist Score");
			marks1[i] = input.nextInt();
			System.out.print("Pls Enter"+names[i]+"'s "+"Second Score");
			marks2[i] = input.nextInt();
			System.out.print("Pls Enter"+names[i]+"'s "+"Third Score");
			marks3[i] = input.nextInt();
			avgs[i] = (marks1[i] + marks2[i] + marks3[i])/3;
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
		System.out.println("Student      Average           Grade");
		for (int i = 0; i < N; i++) {
			System.out.println(names[i]+ "\t\t"+avgs[i]+ "\t\t"+grades[i]);
		}
		
		System.out.println("============================================================");
		System.out.println(" 1. Print the entire list\n 2. Sort and print the list alphabetically\n 3. Sort and print the list in descending order based on the average.\n 4. Find the student who has the maximum average \n 5. Find the student who has the minium average \n 6. Print the grade distribution \n 0. Exit");
		System.out.println("============================================================");
		
		System.out.print("Enter your choice?");
		
		M = input.nextInt();
		
		if(M==1) {
			printList();
		}else if(M==2) {
			System.out.println("I don't know");
		}
		
		}
		
		
	}
	


