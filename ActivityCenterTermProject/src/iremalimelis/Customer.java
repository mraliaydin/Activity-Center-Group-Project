
package iremalimelis;

public class Customer {

    private int custId;
    private String customerName;
    private int age;
    private String gender;

    public Customer() {
        custId = 0;
        customerName = "";
        age = 0;
        gender = "";
    }

    public Customer(int custId, String customerName, int age, String gender) {
        this.custId = custId;
        this.customerName = customerName;
        this.age = age;
        this.gender = gender;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "-----------------------------"
                + "\nCustomer Id: " + custId
                + "\nCustomer Name: " + customerName
                + "\nAge: " + age
                + "\nGender: " + gender + "\n";
    }

}
