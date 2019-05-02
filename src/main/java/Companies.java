import java.util.ArrayList;
import java.util.List;

public class Companies {
    List<String> gascomp= new ArrayList<String>();
    List<String> eleccomp = new ArrayList<String>();
    List<String> telcomp = new ArrayList<String>();
    List<String> watercomp = new ArrayList<String>();
    public void addGas(){

        gascomp.add("Agdas");
        gascomp.add("Esgaz");
        gascomp.add("Kayserigaz");
        gascomp.add("Enerya");
        gascomp.add("Çinigaz");
        gascomp.add("Palgaz");
        gascomp.add("İgdaş");
        gascomp.add("Aksa");
        gascomp.add("Udaş");
        gascomp.add("Arsan");
        gascomp.add("Kargaz");
        gascomp.add("Gazdaş");
        gascomp.add("Torosgaz");
        gascomp.add("Doğugaz");

    }




    public void addElectric(){
        eleccomp.add("Toroslar_Edaş");
        eleccomp.add("Başkent_Edaş");
        eleccomp.add("Ayedaş");
        eleccomp.add("Uludağ_Edaş");
        eleccomp.add("Yedaş");
        eleccomp.add("Oedaş");
        eleccomp.add("Aras_Edaş");
        eleccomp.add("Vedaş");
        eleccomp.add("Fırat_Edaş");
        eleccomp.add("Akedaş");
        eleccomp.add("Çedaş");
        eleccomp.add("Tredaş");
        eleccomp.add("Kcetaş");

    }

    public void addTelecommunications(){


        telcomp.add("Digitürk");
        telcomp.add("Dsmart");
        telcomp.add("hipernet_Telekom");
        telcomp.add("Millenicom");
        telcomp.add("Netspeed");
        telcomp.add("Superonline");
        telcomp.add("Turktelekom");
        telcomp.add("Turknet");
        telcomp.add("Turksat");
        telcomp.add("Vodafone");

    }

    public void addWater(){


        watercomp.add("ADANASU");
        watercomp.add("AFYONSU");
        watercomp.add("ANTALYASU");
        watercomp.add("ASKI");
        watercomp.add("BALIKESIRSU");
        watercomp.add("BILECIKSU");
        watercomp.add("BUSKI");
        watercomp.add("CANAKKALESU");
        watercomp.add("DENIZLISU");
        watercomp.add("EDIRNESU");
        watercomp.add("IZMITSU");
        watercomp.add("IZSU");
        watercomp.add("KONYASU");
        watercomp.add("KUTAHYASU");
        watercomp.add("MUSKI");
        watercomp.add("SASKI");
        watercomp.add("TRABZONSU");
        watercomp.add("YALOVASU");
    }

    public static void main(String[] args) {
        Companies c = new Companies();
        System.out.println(c.gascomp);
    }
}
