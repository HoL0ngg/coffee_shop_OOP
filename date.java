package do_an_dau_tien;

import java.util.Scanner;

public class date {
	private int ngay;
	private int thang;
	private int nam;

	public date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public date() {
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}
	
	public void setInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap vao ngay: ");
		this.setNgay(Integer.parseInt(scan.nextLine()));
	}

}
