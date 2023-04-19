package mavenPrograms;

import java.util.Scanner;

public class AmstrongNumber {

	

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sc.nextInt();
			int temp=num,digit=0,remainder;
			double sum=0;
			while(temp>0) {
				temp=temp/10;
				digit++;
			}
			temp=num;
			while(temp>0) {
				remainder=temp%10;
				sum=sum+(Math.pow(remainder,digit));
				temp=temp/10;
			}
			
			if(num==sum) {
				System.out.println("Amstrong");
			}
			else {
				System.out.println("not amstrong");
			}
		}

	
	
	
}
