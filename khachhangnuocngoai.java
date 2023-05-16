package BAI2;

import java.util.Scanner;

public class khachhangnuocngoai extends khachhang {
	String quoctich;
	public khachhangnuocngoai(){
	}
	public khachhangnuocngoai(int makh, int soluong, double dongia, double thanhtien, String ngayhhd, String hotenkh,
			String quoctich) {
		super(makh, soluong, dongia, thanhtien, ngayhhd, hotenkh);
		this.quoctich = quoctich;
	}
	public String getQuoctich() {
		return quoctich;
	}
	public void setQuoctich(String quoctich) {
		this.quoctich = quoctich;
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap quoc tich: ");
		quoctich = scanner.nextLine();
	}
	public double ttien() {
		return this.soluong*this.dongia;
	}
	@Override
	public String toString() {
		return "khachhangnuocngoai [quoctich=" + quoctich + "]";
	}
}
	
