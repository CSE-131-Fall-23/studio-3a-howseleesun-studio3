package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		int n, notPrime;
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		boolean[] sieve;
		
		sieve = new boolean[n];
		for(int i=0; i<n; i++)
		{
			sieve[i]=true;
		}
		
		System.out.println(Arrays.toString(sieve));
		
		for(int i=2; i<20; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(j==i*j)
				{
					sieve[j]=false;
				}
			}
		
		}
		System.out.println(Arrays.toString(sieve));
	}

}
