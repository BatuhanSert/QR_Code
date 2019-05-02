import com.google.zxing.NotFoundException;
import java.io.IOException;


public class Test_Bill {
    public static void main(String[] args) throws IOException, NotFoundException {
        Qr qrprize = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\prize.png");
        Qr qrsubsno = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\subsno.png");
        Qr qrcomp = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\sirket.png");

        Bill  bill = new Bill(Integer.valueOf(qrprize.getQr()), Integer.valueOf(qrsubsno.getQr()), qrcomp.getQr());

        System.out.println("prize: " + bill.getPrize());
        System.out.println("subsno: " + bill.getSubscribeNo());
        System.out.println("prize: " + bill.getCompanie());


    }
}
