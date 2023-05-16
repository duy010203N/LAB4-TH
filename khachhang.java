package BAI2;

import java.util.Scanner;

public class khachhang {
	int makh;
	int soluong;
	double dongia;
	double thanhtien;
	String ngayhhd;
	String hotenkh;
	public khachhang() {
		
	}
	public khachhang(int makh, int soluong, double dongia, double thanhtien, String ngayhhd, String hotenkh) {
		super();
		this.makh = makh;
		this.soluong = soluong;
		this.dongia = dongia;
		this.thanhtien = thanhtien;
		this.ngayhhd = ngayhhd;
		this.hotenkh = hotenkh;
	}
	public int getMakh() {
		return makh;
	}
	public void setMakh(int makh) {
		this.makh = makh;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public double getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(double thanhtien) {
		this.thanhtien = thanhtien;
	}
	public String getNgayhhd() {
		return ngayhhd;
	}
	public void setNgayhhd(String ngayhhd) {
		this.ngayhhd = ngayhhd;
	}
	public String getHotenkh() {
		return hotenkh;
	}
	public void setHotenkh(String hotenkh) {
		this.hotenkh = hotenkh;
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Nhap ma khach hang: ");
		makh = scanner.nextInt();
		System.out.println(" Nhap ho va ten khach hang: ");
		hotenkh = scanner.nextLine();
		System.out.println(" Nhap so luong : ");
		soluong = scanner.nextInt();
		System.out.println(" Nhap don gia: ");
		dongia = scanner.nextDouble();
	}
	@Override
	public String toString() {
		return "khachhang [makh=" + makh + ", soluong=" + soluong + ", dongia=" + dongia + ", thanhtien=" + thanhtien
				+ ", ngayhhd=" + ngayhhd + ", hotenkh=" + hotenkh + "]";
	}
	
}
