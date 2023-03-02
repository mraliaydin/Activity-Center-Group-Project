
package iremalimelis;

public class Basketball extends Sport{
    private String ballSize;

    public Basketball() {
        this.ballSize = "";
    }
    
    public Basketball(String branchName, String instructorName, String courseName, String date, double price, Customer cust, String place, double equipmentPrice, String ballSize) {
        super(branchName, instructorName, courseName, date, price, cust, place, equipmentPrice);
        this.ballSize = ballSize;
    }

    public String getBallSize() {
        return ballSize;
    }

    public void setBallSize(String ballSize) {
        this.ballSize = ballSize;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nBallSize: " + ballSize;
    }
    
    public void calcPrice(){
        price = SPORTP + 10;
    }
}
