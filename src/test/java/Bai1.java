import org.junit.Assert;
import org.junit.Test;

public class Bai1 {

    public int tinhTongMang(int... a){
        int tong = 0;
        for (int i=0;i<a.length;i++){
            if (a[i]%2!=0){
                tong += a[i];
            }
        }
        return tong;
    }

    @Test
    public void testDayDuDuong(){
        Assert.assertEquals(13, tinhTongMang(13, 12));
    }

    @Test
    public void testRong(){
        Assert.assertEquals(0, tinhTongMang(0, 0, 0));
    }

    @Test
    public void testRong1Truong(){
        Assert.assertEquals(24, tinhTongMang(13, 11, 0));
    }

    @Test
    public void testSoAm(){
        Assert.assertEquals(-10, tinhTongMang(-5, -5));
    }

    @Test
    public void testSo1(){
        Assert.assertEquals(1, tinhTongMang(1, 0));
    }

    @Test
    public void testSoAmDuong(){
        Assert.assertEquals(2, tinhTongMang(11, -9));
    }
}
