
public class ParamDemo {

	public static void printAvg(double...score) {
		double sum =0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			
		}
		System.out.println(sum/score.length);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printAvg(1,5,5,9);
	}

}
