package cau1;

import java.util.Scanner;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Hệ số a:");
		float a=scanner.nextFloat();
		System.out.print("Hệ số b:");
		float b=scanner.nextFloat();
		if(a == 0){
			if(b == 0){
			System.out.print("phương trình vô số nghiệm");
			}
			else{
				System.out.print("phương trình vô nghiệm");
			}
		}
			else{			
			float x=-b/a;
			System.out.print("nghiệm của phương trình:");
			System.out.print(x);
			}
		}
}