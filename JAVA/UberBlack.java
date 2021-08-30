import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    
    public UberBlack(String license, String drive, Map<String, Map<String, Integer>> typeCarAccepted, 
    ArrayList<String> seatsMaterial) {
        super(license, drive);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}
