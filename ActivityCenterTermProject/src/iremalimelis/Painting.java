
/**
 *
 * @author Ezgi Melis Coşar, İrem Civek, Ali Aydın
 */

package iremalimelis;

public class Painting extends Art {

    private String dyeType;

    public Painting() {
        this.dyeType = "";
    }

    public Painting(String branchName, String instructorName, String courseName, String date, double price, Customer cust, String studio, String dyeType) {
        super(branchName, instructorName, courseName, date, price, cust, studio);
        this.dyeType = dyeType;
    }

    public String getDyeType() {
        return dyeType;
    }

    public void setDyeType(String dyeType) {
        this.dyeType = dyeType;
    }

    @Override
    public String toString() {
        return  super.toString() + "\n" 
                + "Dye Type: " + dyeType;
    }
    
    public void calcPrice(){
        price = ARTP + 50;
    }

}
