import com.google.zxing.NotFoundException;
import java.io.IOException;


public class Bill {
    protected int prize;
    protected int subscribeNo;
    protected String Companie;

    Qr qrprize = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\prize.png");
    Qr qrsubsno = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\subsno.png");
    Qr qrcomp = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\sirket.png");



    public Bill(int prize, int subscribeNo, String Companie) throws IOException, NotFoundException {

        this.prize = Integer.valueOf(qrprize.getQr());
        this.subscribeNo = Integer.valueOf(qrsubsno.getQr());
        this.Companie = qrcomp.getQr();
        /*for (int i = 0; i < comp.gascomp.size(); i++) {
            if (qrcomp.getQr().equals(comp.gascomp.get(i))){
                this.Companie = comp.gascomp.get(i).toLowerCase();
            }else break;
        }
        for (int i = 0; i < comp.eleccomp.size(); i++) {
            if (qrcomp.getQr().equals(comp.eleccomp.get(i))) {
                this.Companie = comp.eleccomp.get(i).toLowerCase();
            }else break;
        }

        for (int i = 0; i < comp.telcomp.size(); i++) {
            if (qrcomp.getQr().equals(comp.telcomp.get(i))) {
                this.Companie = comp.telcomp.get(i).toLowerCase();
            }else break;
        }

        for (int i = 0; i < comp.watercomp.size(); i++) {
            if (qrcomp.getQr().equals(comp.watercomp.get(i))) {
                this.Companie = comp.watercomp.get(i).toLowerCase();
            }else break;
        }*/
    }



    public int getSubscribeNo() {return subscribeNo;}
    public int getPrize(){return prize;}
    public String getCompanie() {
        return Companie;
    }
}



