
package iremalimelis;

import static iremalimelis.ActivityCenterSys.list;

public abstract class Sport extends ActivityCenter implements SportInterface {

    private String place;
    private double equipmentPrice;

    public Sport() {
        place = "";
        equipmentPrice = 0.0;
    }

    public Sport(String branchName, String instructorName, String courseName, String date, double price, Customer cust, String place, double equipmentPrice) {
        super(branchName, instructorName, courseName, date, price, cust);
        this.place = place;
        this.equipmentPrice = equipmentPrice;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getEquipmentPrice() {
        return equipmentPrice;
    }

    public void setEquipmentPrice(double equipmentPrice) {
        this.equipmentPrice = equipmentPrice;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nPlace: " + place
                + "\nEquipment Price: " + equipmentPrice;
    }

    public abstract void calcPrice() ;

    public void calcEquipmentPrice(){
        ActivityCenterSys acS = new ActivityCenterSys();
        
        String[] type=new String [list.size()];
        type=acS.getCourseName();
        
        for(int i=0; i<list.size(); i++){
            if(type[i].equalsIgnoreCase("basketball")){
                equipmentPrice = 15;
            }
            else if(type[i].equalsIgnoreCase("gymnastics")){
                equipmentPrice = 60;
            }
        }
    }
}
