package cau2;

import java.util.Scanner;
public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Hệ số a:");
		float a=scanner.nextFloat();
		System.out.print("Hệ số b:");
		float b=scanner.nextFloat();
		System.out.print("Hệ số c:");
		float c=scanner.nextFloat();
		if(a==0)
		{
			if(b == 0){
				if(c == 0){
				System.out.print("phương trình vô số nghiệm");
				}
				else{
					System.out.print("phương trình vô nghiệm");
				}
			}
				else{			
				float x=-c/b;
				System.out.print("nghiệm của phương trình:");
				System.out.print(x);
				}
			}
		else
			{
			double delta=Math.pow(b,2)-4*a*c;
			
		
		if ( delta <0)
		{
			System.out.print("phương trình vô nghiệm");
		}
		if (delta ==0)
		{
			float x=-b/(2*a);
			System.out.print("phương trình có nghiệm kép:");
			System.out.print(x);
			
		}
		else 
		{
			double x1=(-b+ Math.sqrt(delta))/(2*a);
			double x2=(-b- Math.sqrt(delta))/(2*a);
			System.out.println("phương trình có 2 nghiệm phân biệt:");
			System.out.print("x1=");
			System.out.println(x1);
			System.out.print("x2=");
			System.out.print(x2);
		}
	}

	}

}