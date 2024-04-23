package do_an_dau_tien;

public abstract class sanPham {
	private String id;
	private String ten;
	private int giaTien[];

	public static int maxLength = 0;
	
	// cac size co the co trong do uong
	public static int validSize = 3;
	public static String size[] = { "S", "M", "L", "XL", "XXXXXL" };

	public sanPham() {
	}

	public sanPham(String id, String ten) {
		this.id = id;
		this.ten = ten;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getValidSize() {
		return validSize;
	}

	public int[] getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(int[] giaTien) {
		this.giaTien = giaTien;
	}

}
