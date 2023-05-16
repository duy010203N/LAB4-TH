package BAI1;
import java.util.Scanner;

public class giaodich {
	String magd;
	String ngaygd;
	float dongia;
	String loaidat;
	float dientich;
public giaodich() {
        super();
    }
public giaodich(String magd, String ngaygd, long dongia, float dientich) {
    super();
    this.magd = magd;
    this.ngaygd = ngaygd;
    this.dongia = dongia;
    this.dientich = dientich;
}
public String getMagd() {
	return magd;
}
public void setMagd(String magd) {
	this.magd = magd;
}
public String getNgaygd() {
	return ngaygd;
}
public void setNgaygd(String ngaygd) {
	this.ngaygd = ngaygd;
}
public float getDongia() {
	return dongia;
}
public void setDongia(float dongia) {
	this.dongia = dongia;
}
public String getLoaidat() {
	return loaidat;
}
public void setLoaidat(String loaidat) {
	this.loaidat = loaidat;
}
public float getDientich() {
	return dientich;
}
public void setDientich(float dientich) {
	this.dientich = dientich;
}
public void nhap() {
	Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập mã giao dịch: ");
    magd = scanner.nextLine();
    System.out.print("Nhập ngày giao dịch (ngày/tháng/năm): ");
    ngaygd = scanner.nextLine();
    System.out.print("Nhập đơn giá: ");
    dongia = Long.parseLong(scanner.nextLine());
    System.out.print("Nhập diện tích: ");
    dientich = Float.parseFloat(scanner.nextLine());
}
 
@Override
public String toString() {
    return "Mã giao dịch: " + this.magd+ ", ngày giao dịch: " + this.ngaygd + 
        ", đơn giá: " + this.dongia + ", diện tích: " + this.dientich;
}
}
