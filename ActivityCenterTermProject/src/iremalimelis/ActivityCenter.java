
package iremalimelis;

public abstract class ActivityCenter {

    protected String branchName;
    protected String instructorName;
    protected String courseName;
    protected String date;
    protected double price;
    public final double SPORTP=100;
    public final double ARTP=200;

    public static int numOfCustomer = 0;

    Customer cust;

    public ActivityCenter() {
        branchName = "";
        instructorName = "";
        courseName = "";
        date = "";
        price = 0.0;

    }

    public ActivityCenter(String branchName, String instructorName, String courseName, String date, double price, Customer cust) {
        this.branchName = branchName;
        this.instructorName = instructorName;
        this.courseName = courseName;
        this.date = date;
        this.price = price;
        this.cust = cust;
        numOfCustomer++;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getNumOfCustomer() {
        return numOfCustomer;
    }

    public boolean findCustId(int id){
        return id==cust.getCustId();
    }
    
    @Override
    public String toString() {
        return  cust.toString()
                + "\nBranchName: " + branchName + "\n"
                + "Course Name: " + courseName + "\n"
                + "Instructor Name: " + instructorName + "\n"
                + "Date: " + date + "\n"
                + "Price: " + price + "\n" ;
    }

    public abstract void calcPrice();

}
