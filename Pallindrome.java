package week1.day1;

public class Pallindrome {

	public static void main(String[] args) {
		
	int num=34343;
	int reverse = 0;
    for (int i =num; i>0; i= i/10) {
        reverse = (reverse*10) + (i%10);
}
    if(num == reverse) {
        System.out.println("The given number "+num+" is a palindrome");
    }else {
        System.out.println("The given number "+num+" is not a palindrome");
    }
    
}
}

