import lab.KhachHangService;
import org.junit.Assert;
import org.junit.Test;

public class Bai2 {

    KhachHangService service = new KhachHangService();

    @Test
    public void testKHDung() {
        Assert.assertEquals("OK", service.getKhachHangsByName("KHA"));
    }

    @Test
    public void testKHDeTrong() {
        Assert.assertEquals("Tên khách hàng không được trống", service.getKhachHangsByName(""));
    }

    @Test
    public void testKHSai() {
        Assert.assertEquals("Không tìm thấy", service.getKhachHangsByName("gfhshfss"));
    }

    @Test
    public void testKHDung2() {
        Assert.assertEquals("OK", service.getKhachHangsByName("KHA1"));
    }

    @Test
    public void testKHNhapSo() {
        Assert.assertEquals("Không tìm thấy", service.getKhachHangsByName("2313"));
    }

    @Test
    public void testKHNhapSoAm() {
        Assert.assertEquals("Không tìm thấy", service.getKhachHangsByName("-45"));
    }

}
