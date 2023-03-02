
package iremalimelis;

public abstract class Art extends ActivityCenter {

    private String studio;

    public Art() {
        this.studio = "";
    }

    public Art(String studio) {
        this.studio = studio;
    }

    public Art(String branchName, String instructorName, String courseName, String date, double price, Customer cust, String studio) {
        super(branchName, instructorName, courseName, date, price, cust);
        this.studio = studio;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public String toString() {
        return super.toString() 
                + "\nStudio: " + studio;
    }

    @Override
    public abstract void calcPrice();

}
