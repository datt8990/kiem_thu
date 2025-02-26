package lab;

import java.util.ArrayList;
import java.util.List;

public class KhachHangService {

    List<KhachHang> khachHangs = new ArrayList<>();

    public KhachHangService() {
        khachHangs.add(new KhachHang("KH001", "KHA", 21, "KHA@gmail.com", "0123456789"));
        khachHangs.add(new KhachHang("KH002", "KHA1", 25, "KHA1@gmail.com", "0123456789"));
    }

    public String getKhachHangsByName(String name) {
        if (name.isEmpty()){
            return "Tên khách hàng không được trống";
        }
        for (KhachHang khachHang : khachHangs) {
            if (khachHang.getTenKH().equals(name)) {
                return "OK";
            }
        }
        return "Không tìm thấy";
    }
}
