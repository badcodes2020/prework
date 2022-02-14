package tasks;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		/**
		 * has only two divisors
		 * can be divided by 1 and itself ONLY
		 *
		 **/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		boolean isPrime = checkPrime(num);
		
		if(isPrime) {
			System.out.println("It is a Prime Number");
		}
		else {
			System.out.println("It is NOT a Prime Number");
		}
	} 
	
	public static boolean checkPrime(int n){
		int cnt = 0;
		
		for (int i=2; i<n; i++){
			if (n % i ==0) {
				cnt++;
			}
		}
		
		if(cnt > 0){
			return false;
			
		}else {
			return true;
		}
	}
	

}
