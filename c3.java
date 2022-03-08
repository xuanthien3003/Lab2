package cau3;

import java.util.Scanner;

public class c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int soDien;
		do {
		System.out.print("Số điện sử dụng của tháng:");
		soDien=scanner.nextInt();
		}while(soDien<0);
		int Tien;
		if(soDien<=50)
		{
			Tien=soDien*1000;
		}
		else
			{
				Tien=50*1000+(soDien-50)*1200;
			}
		System.out.print("Tiền điện tháng này:");
		System.out.print(Tien);

	}

}