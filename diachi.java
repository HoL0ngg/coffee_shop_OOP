package do_an_dau_tien;

public class diachi {
  private String tinh_thanh;
    private String quan_huyen;
    private String phuong_xa;
    private String sonha;
    private String tenduong;

    public diachi() {
    }
    
    public diachi(String tinh_thanh, String quan_huyen, String phuong_xa, String sonha, String tenduong) {
        this.tinh_thanh = tinh_thanh;
        this.quan_huyen = quan_huyen;
        this.phuong_xa = phuong_xa;
        this.sonha = sonha;
        this.tenduong = tenduong;
    }

    public String getTinh_thanh() {
        return tinh_thanh;
    }

    public void setTinh_thanh(String tinh_thanh) {
        this.tinh_thanh = tinh_thanh;
    }

    public String getQuan_huyen() {
        return quan_huyen;
    }

    public void setQuan_huyen(String quan_huyen) {
        this.quan_huyen = quan_huyen;
    }

    public String getPhuong_xa() {
        return phuong_xa;
    }

    public void setPhuong_xa(String phuong_xa) {
        this.phuong_xa = phuong_xa;
    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getTenduong() {
        return tenduong;
    }

    public void setTenduong(String tenduong) {
        this.tenduong = tenduong;
    }
    
    public void setInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap tinh/thanh pho: ");
        this.setTinh_thanh(scan.nextLine());
        System.out.print("Nhap quan/huyen: ");
        this.setQuan_huyen(scan.nextLine());
        System.out.print("Nhap phuong/xa: ");
        this.setPhuong_xa(scan.nextLine());
        System.out.print("Nhap so nha: ");
        this.setSonha(scan.nextLine());
        System.out.print("Nhap ten duong: ");
        this.setTenduong(scan.nextLine());
    }
}
