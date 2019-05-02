import com.google.zxing.NotFoundException;
import java.io.IOException;


public interface UserInformation {
    String Id = null;
    String Name = null;
    String CreditCardNo = null;

    public void payBill(Bill bill) throws IOException, NotFoundException;

}
