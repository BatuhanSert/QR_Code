import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Qr {

    private String filePath;
    private final String charset = "UTF-8";

    public String getCharset() {
        return charset;
    }

    public Qr(String filePath) {
        this.filePath = filePath;
    }


    public String getFilePath() {
        return filePath;
    }

    public String getQr() throws IOException, NotFoundException {
            String filePath =getFilePath() ;
            String charset = getCharset();
            Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap< EncodeHintType, ErrorCorrectionLevel >();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            if (filePath == "E:\\CENG2\\Programming\\Principles\\src\\main\\java\\prize.png"){
                System.out.println("Data read from QR Code// " + "Prize: " + readQRCode(filePath, charset, hintMap));
            }
            else if (filePath == "E:\\CENG2\\Programming\\Principles\\src\\main\\java\\subsno.png"){
                System.out.println("Data read from QR Code// " + "subscribeNo: " + readQRCode(filePath, charset, hintMap));
            }
            else if (filePath == "E:\\CENG2\\Programming\\Principles\\src\\main\\java\\sirket.png"){
                System.out.println("Data read from QR Code// " + "Companie: " + readQRCode(filePath, charset, hintMap));
            }else{
                System.out.println("Data read from QR Code// " + readQRCode(filePath, charset, hintMap));
            }

            return readQRCode(filePath, charset, hintMap);

    }


    public String readQRCode(String filePath, String charset, Map hintMap)
            throws FileNotFoundException, IOException, NotFoundException {
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(
                new BufferedImageLuminanceSource(
                        ImageIO.read(new FileInputStream(filePath)))));
        Result qrCodeResult = new MultiFormatReader().decode(binaryBitmap, hintMap);
        return qrCodeResult.getText();
    }









}
