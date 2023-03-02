
/**
 *
 * @author Ezgi Melis Coşar, İrem Civek, Ali Aydın
 */

package iremalimelis;

public class Music extends Art {

    private String instrumentType;

    public Music() {
        this.instrumentType = "";
    }

    public Music(String branchName, String instructorName, String courseName, String date, double price, Customer cust, String studio, String instrumentType) {
        super(branchName, instructorName, courseName, date, price, cust, studio);
        this.instrumentType = instrumentType;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" 
                + "Instrument Type: " + instrumentType;
    }

    public void calcPrice(){
        price = ARTP + 25;
    }
}
