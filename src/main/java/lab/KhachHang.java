package lab;

public class KhachHang {

    private String maKH;

    private String tenKH;

    private int tuoi;

    private String email;

    private String sdt;

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public KhachHang(String maKH, String tenKH, int tuoi, String email, String sdt) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.tuoi = tuoi;
        this.email = email;
        this.sdt = sdt;
    }

    public KhachHang() {
    }
}
