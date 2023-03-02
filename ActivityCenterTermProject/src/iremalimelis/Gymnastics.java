
package iremalimelis;

public class Gymnastics extends Sport {

    private String equipmentType;

    public Gymnastics() {
    }

    public Gymnastics(String branchName, String instructorName, String courseName, String date, double price, Customer cust, String place, double equipmentPrice, String equipmentType) {
        super(branchName, instructorName, courseName, date, price, cust, place, equipmentPrice);
        this.equipmentType = equipmentType;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nEquipment Type: " + equipmentType;
    }

    public void calcPrice(){
        price = SPORTP + 30;
    }
}
