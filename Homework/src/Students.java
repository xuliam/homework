import java.util.Scanner;

public class Students {

	public String name;
	public int course1;
	public int course2;
	public int course3;
	public int avg;
	public char grade;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void inputNumsNameAndMark() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of Students  ");
		int N = input.nextInt();
		int[] data = new int[10];

	}

	public Students(String name, int course1, int course2, int course3, int avg, char grade) {
		super();
		this.name = name;
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
		this.avg = avg;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse1() {
		return course1;
	}

	public void setCourse1(int course1) {
		this.course1 = course1;
	}

	public int getCourse2() {
		return course2;
	}

	public void setCourse2(int course2) {
		this.course2 = course2;
	}

	public int getCourse3() {
		return course3;
	}

	public void setCourse3(int course3) {
		this.course3 = course3;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public void calAvgAndGrade() {

	}

	public void printAndList() {

	}
}
