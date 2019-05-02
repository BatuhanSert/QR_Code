import com.google.zxing.NotFoundException;
import java.io.IOException;

public class Atm implements UserInformation {
    private String Id;
    private String Name;
    private final String CreditCardNo;

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getCreditCardNo() {
        return CreditCardNo;
    }

    public Atm(String id, String name, String creditCardNo) {
        Id = id;
        Name = name;
        CreditCardNo = creditCardNo;
    }

    public void payBill(Bill bill) throws IOException, NotFoundException {
        Qr qrprize = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\prize.png");
        Qr qrsubsno = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\subsno.png");
        Qr qrcomp = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\sirket.png");
        System.out.println("The bills paid...");


    }
}
