
package BAI1;

import java.util.Scanner;

public class main {
	public static void main(String[]arg) {
		List l = new List();
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("nhan 1:Nhap thong tin ");
			System.out.println("nhan 2:xuat thong tin ");
			
	n =sc.nextInt();
			switch (n)
			{
			case 1:l.nhapdl();break;
			case 2:l.xuat();break;
			
			}
		    }
		while(true);
	}
}
	
