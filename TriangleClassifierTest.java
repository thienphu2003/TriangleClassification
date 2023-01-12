import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TriangleClassifierTest {
    @Test
    @DisplayName("Đây là tam giác đều")
    void TestTamGiacDeu()
    {
        int number1 =2;
        int number2= 2;
        int number3=2;
        String result =TriangleClassifier.classifier(number1,number2,number3);
        String expected ="Tam giác đều";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Đây là tam giác cân")
    void TestTamGiacCan()
    {
        int number1 =2;
        int number2= 2;
        int number3= 3;
        String result =TriangleClassifier.classifier(number1,number2,number3);
        String expected ="Tam giác cân";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Đây là tam giác thường")
    void TestTamGiacThuong()
    {
        int number1 =3;
        int number2= 4;
        int number3= 5;
        String result =TriangleClassifier.classifier(number1,number2,number3);
        String expected ="Tam giác thường";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Đây không phải là tam giác")
    void TestKhongPhaiTamGiac()
    {
        int number1 =8;
        int number2= 2;
        int number3= 3;
        String result =TriangleClassifier.classifier(number1,number2,number3);
        String expected ="Không phải là tam giác";
        assertEquals(expected,result);
    }

}
