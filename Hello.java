package com.aaray;

public class Hello {

	public static void main(String[] arg) {
		int a[]=new int[arg.length];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(arg[i]);
			sum=sum+a[i];
			System.out.println(a[i]);
		}
		System.out.println("sum of array numbers"+sum);
	}

}
