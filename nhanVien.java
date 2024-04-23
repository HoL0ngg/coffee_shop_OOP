package do_an_dau_tien;

public abstract class nhanVien {
	private String id;
	private String ten;
	private diachi dc;
	private String std;
	private String email;
	private date birthDay;
	

	public nhanVien() {
	}

	public nhanVien(String id, String ten) {
		this.id = id;
		this.ten = ten;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void getTen(){
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}

}
