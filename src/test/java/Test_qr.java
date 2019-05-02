import com.google.zxing.EncodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;



import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Test_qr {

    public static void main(String[] args)throws WriterException, IOException,
            NotFoundException {
        Qr qrprize = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\prize.png");
        Qr qrsubsno = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\subsno.png");
        Qr qrcomp = new Qr("E:\\CENG2\\Programming\\Principles\\src\\main\\java\\sirket.png");
        /*try {
            String filePath =qrprize.getFilePath() ;
            String charset = "UTF-8";
            Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap< EncodeHintType, ErrorCorrectionLevel >();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            System.out.println("Data read from QR Code// Prize: " + qrprize.readQRCode(filePath, charset, hintMap));
        } catch (Exception e) {
            // TODO: handle exception
        }
        try {
            String filePath =qrsubsno.getFilePath() ;
            String charset = "UTF-8";
            Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap< EncodeHintType, ErrorCorrectionLevel >();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            System.out.println("Data read from QR Code// Subsno: " + qrsubsno.readQRCode(filePath, charset, hintMap));
        } catch (Exception e) {
            // TODO: handle exception
        }

        try {
            String filePath =qrcomp.getFilePath() ;
            String charset = "UTF-8";
            Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap< EncodeHintType, ErrorCorrectionLevel >();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            System.out.println("Data read from QR Code// Companie: " + qrcomp.readQRCode(filePath, charset, hintMap));
        } catch (Exception e) {
            // TODO: handle exception
        }*/

        System.out.println(qrprize.getQr());
        System.out.println(qrcomp.getQr());
        System.out.println(qrsubsno.getQr());


    }







    }





