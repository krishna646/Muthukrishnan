package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		
			int range=8;
			int firstNum=0;
			int secondNum=1;
			int thirdNum;
			System.out.println("fibonacci series :{");
			

		for (int i=0;i<range;i++)
		{
	System.out.println(firstNum+",");
		    thirdNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=thirdNum;
		}
		System.out.println("}");
		}
	}


