package do_an_dau_tien;

public class caPhe extends sanPham {
	private boolean isIced;

	public caPhe() {
		super();
	}

	public caPhe(String id, String ten) {
		super(id, ten);
	}

	public caPhe(boolean isIced) {
		super();
		this.isIced = isIced;
	}

	public boolean isIced() {
		return isIced;
	}

	public void setIced(boolean isIced) {
		this.isIced = isIced;
	}

}
