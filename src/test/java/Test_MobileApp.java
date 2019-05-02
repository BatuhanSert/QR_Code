import com.google.zxing.NotFoundException;

import java.io.IOException;

public class Test_MobileApp {
    public static void main(String[] args) throws IOException, NotFoundException {
        MobileApp m = new MobileApp("16481162246", "Batuhan", "1234567891234567");
        System.out.println("CredirCardNo: "+ m.getCreditCardNo());
        System.out.println("Id: " + m.getId());
        System.out.println("Name: " + m.getName());
        m.setCreditCardNo("1010202030304040");
        m.setId("16495165007");
        m.setName("Ramazan");
        System.out.println("CredirCardNo: "+ m.getCreditCardNo());
        System.out.println("Id: " + m.getId());
        System.out.println("Name: " + m.getName());
        Qr qrprize = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\prize.png");
        Qr qrsubsno = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\subsno.png");
        Qr qrcomp = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\sirket.png");
        Bill bill = new Bill(Integer.valueOf(qrprize.getQr()), Integer.valueOf(qrsubsno.getQr()), qrcomp.getQr());
        m.payBill(bill);

    }
}
