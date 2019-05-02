import com.google.zxing.NotFoundException;

import java.io.IOException;

public class Test_Atm {
    public static void main(String[] args) throws IOException, NotFoundException {
        Atm a = new Atm("16481162246", "Batuhan", "1234567891234567");
        System.out.println("CredirCardNo: "+ a.getCreditCardNo());
        System.out.println("Id: " + a.getId());
        System.out.println("Name: " + a.getName());

        Qr qrprize = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\prize.png");
        Qr qrsubsno = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\subsno.png");
        Qr qrcomp = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\sirket.png");
        Bill bill = new Bill(Integer.valueOf(qrprize.getQr()), Integer.valueOf(qrsubsno.getQr()), qrcomp.getQr());
        a.payBill(bill);
    }
}
