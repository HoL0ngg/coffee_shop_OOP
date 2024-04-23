package do_an_dau_tien;

public abstract class Nhanvien {
    private String id;
    private String ten; 
    private diachi diachi;
    private String sodienthoai;
    private String email;
    private Date ngaysinh;

    public Nhanvien() {
    }
   
    public Nhanvien(String id, String ten, diachi diachi, String sodienthoai, String email, Date ngaysinh) {
        this.id = id;
        this.ten = ten;
        this.diachi = diachi;
        this.sodienthoai = sodienthoai;
        this.email = email;
        this.ngaysinh = ngaysinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public diachi getDiachi() {
        return diachi;
    }

    public void setDiachi(diachi diachi) {
        this.diachi = diachi;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
    public void setInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap id: ");
        this.setId(scan.nextLine());
        System.out.print("Nhap ho va ten: ");
        this.setTen(scan.nextLine());

        diachi dc = new diachi();
        dc.setInfo();
        this.setDiachi(dc);
        
        System.out.print("Nhap so dien thoai: ");
        this.setSodienthoai(scan.nextLine());
        System.out.print("Nhap email: ");
        this.setEmail(scan.nextLine());
        
        Date date = new Date();
        date.setInfo();
        this.setNgaysinh(date);
    }
    
}

