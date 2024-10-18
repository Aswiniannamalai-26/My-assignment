package week1day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int firstNumber=0;
     int secondNumber=1;
     int thirdNumber;
     int range=8;
     
     for (int i = 0; i < 8; i++) {
    	 
    	 thirdNumber=firstNumber+secondNumber;
    	 firstNumber=secondNumber;
    	 secondNumber=thirdNumber;
    	 System.out.println(thirdNumber);
	}
     
	}

}
