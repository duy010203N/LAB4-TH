package BAI2;

import java.util.Scanner;

public class khachhangvietnam extends khachhang {
	int loaikh;
	int dinhmuc;

	public khachhangvietnam() {
}

	public khachhangvietnam(int makh, int soluong, double dongia, double thanhtien, String ngayhhd, String hotenkh,
			int loaikh, int dinhmuc) {
		super(makh, soluong, dongia, thanhtien, ngayhhd, hotenkh);
		this.loaikh = loaikh;
		this.dinhmuc = dinhmuc;
	}

	public int getLoaikh() {
		return loaikh;
	}

	public void setLoaikh(int loaikh) {
		this.loaikh = loaikh;
	}

	public int getDinhmuc() {
		return dinhmuc;
	}

	public void setDinhmuc(int dinhmuc) {
		this.dinhmuc = dinhmuc;
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		System.out.println(" Loai khach hang (1. Sinh hoat. 2.Kinh doanh. 3.San xuat)");
		loaikh = scanner.nextInt();
		System.out.println("Dinh muc: ");
		dinhmuc = scanner.nextInt();
	}
	public double ttien() {
		if(soluong<=dinhmuc)
		{
			return this.dongia*this.soluong;
		}
		else {
			return this.dinhmuc*this.dongia+(this.soluong-this.dinhmuc)*this.dongia+2.5;
			
		}
	}

	@Override
	public String toString() {
		String temp;
		if(loaikh==)
		{
			temp = "dinhmuc";
		}
		else if(loaikh==2)
		{
			temp="kinhdoanh";
		}
		else {
			temp ="sanxuat";
		}
		return "khachhangvietnam [loaikh=" + loaikh + ", dinhmuc=" + dinhmuc + "]";
	}
	
}

