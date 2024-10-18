package week1day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		boolean isPrimeNum = true;
		for (int i = 2; i < num ; i++) {
			if (num % i == 0) {
				isPrimeNum = false;
				break;
			}
			
		}
		if (isPrimeNum) {
		System.out.println("Is a Prime Number " + isPrimeNum);
		}
		else {
			
		System.out.println("Is not a Prime Number ");
		}
	}
	

}
