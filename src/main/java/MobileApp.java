import com.google.zxing.NotFoundException;
import java.io.IOException;


public class MobileApp implements UserInformation {
    protected String Id;
    protected String Name;
    protected String CreditCardNo;

    public MobileApp(String id, String name, String creditCardNo) {
        Id = id;
        Name = name;
        CreditCardNo = creditCardNo;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCreditCardNo() {
        return CreditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        CreditCardNo = creditCardNo;
    }

    public void payBill(Bill bill) throws IOException, NotFoundException {
        Qr prize = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\prize.png");
        Qr subsno = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\subsno.png");
        Qr comp = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\sirket.png");
        System.out.println("The bills paid...");


    }
}
