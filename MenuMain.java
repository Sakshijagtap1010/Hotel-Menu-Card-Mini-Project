package comp.test.tester;

import java.util.Scanner;

import comp.test.code.Menu;

public class MenuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		Scanner sc=new Scanner(System.in);
		System.out.println("**********MENU**********");
		System.out.println("1)SWEET_LASSI"+"\n2)SPECIAL_LASSI"+"\n3)MANGO_LASSI"+"\n4)ICECREAM_LASSI"+"\n5)CHOCOLATE_LASSI");
		System.out.println("Enter your Choice:");
		s=sc.nextInt();
		switch(s) 
		{
			case 1:
				Menu itm1=Menu.SWEET_LASSI;
				System.out.println("price of SWEET_LASSI="+itm1.getPrice());
				break;
			case 2:
				Menu itm2=Menu.SPECIAL_LASSI;
				System.out.println("price of SPECIAL_LASSI="+itm2.getPrice());
				break;
			case 3:
				Menu itm3=Menu.MANGO_LASSI;
				System.out.println("price of MANGO_LASSI="+itm3.getPrice());
				break;
			case 4:
				Menu itm4=Menu.ICECREAM_LASSI;
				System.out.println("price of ICECREAM_LASSI="+itm4.getPrice());
				break;
			case 5:
				Menu itm5=Menu.CHOCOLATE_LASSI;
				System.out.println("price of CHOCOLATE_LASSI="+itm5.getPrice());
				break;
			default:
				System.err.println("wrong choice...");
				break;

	     }
	}
}
