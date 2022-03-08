package cau4;

import java.util.Scanner;

public class c4 {

	public void GIAIptb1()
	{
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
	
	
public void GIAIptb2()
	{
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

public void TinhTienDien()
	{
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
public void Menu()
	{	
		Scanner scanner =new Scanner(System.in);
		System.out.println("+-------------------------+");
		System.out.println("1. Giải phương trình bậc nhất");
		System.out.println("2. Giải phương trình bậc hai");
		System.out.println("3. Tính tiền điện");
		System.out.println("4. Kết thúc");
		System.out.println("+-------------------------+");
		int chucnang;
		do
		{
			System.out.print("Chọn chức năng:");
			chucnang=scanner.nextInt();
		}while(chucnang<0 || chucnang >4);
		switch(chucnang)
		{
		case 1:
			{
				GIAIptb1();
				break;
			}
		case 2:
			{
				GIAIptb2();
				break;
			}
		case 3:
			{
				TinhTienDien();
				break;
			}
		case 4:
			{
				this.Close();
			}
		}
		
	}
	private void Close() {
	// TODO Auto-generated method stub
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c4 s=new c4();
		s.Menu();
		
	}

}