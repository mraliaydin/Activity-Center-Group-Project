package iremalimelis;

import java.util.ArrayList;

public class ActivityCenterSys {

    public static ArrayList<ActivityCenter> list = new ArrayList();

    public static boolean checkCustId(int id) {
        for (int i = 0; i < list.size(); i++) {
            ActivityCenter obj = list.get(i);
            if (obj.findCustId(id)) {
                return true;
            }
        }
        return false;
    }

    public static boolean addCustomer(String branchName, String instructorName, String courseName, String date, double price, Customer cust) {

        Basketball basket;
        Gymnastics gym;
        Painting paint;
        Music music;
        
        String place, equipmentType, ballSize, instrumentType, dyeType;
        double equipmentPrice;
        
        if (checkCustId(cust.getCustId())) {
            return false;
        } else {
            if (branchName.equalsIgnoreCase("sport")) {
                if (courseName.equalsIgnoreCase("basketball")) {
                    equipmentPrice = 20.5;
                    ballSize = "18icnh";
                    place = "Outdoor";
                    basket = new Basketball(branchName, instructorName, courseName, date, price, cust, place, equipmentPrice, ballSize);
                    basket.calcPrice();
                    list.add(basket);
                } 
                else if (courseName.equalsIgnoreCase("gymnastics")) {
                    equipmentPrice = 39.9;
                    equipmentType = "Dumbell";
                    place = "Indoor";
                    gym = new Gymnastics(branchName, instructorName, courseName, date, price, cust, place, equipmentPrice, equipmentType);
                    gym.calcPrice();
                    list.add(gym);
                }
            } 
            else if (branchName.equalsIgnoreCase("art")) {
                if (courseName.equalsIgnoreCase("music")) {
                    instrumentType = "Violin";
                    place = "Studio";
                    music = new Music(branchName, instructorName, courseName, date, price, cust, place, instrumentType);
                    music.calcPrice();
                    list.add(music);
                } 
                else if (courseName.equalsIgnoreCase("painting")) {
                    dyeType = "Oil Paint";
                    place = "Workshop";
                    paint = new Painting(branchName, instructorName, courseName, date, price, cust, place, dyeType);
                    paint.calcPrice();
                    list.add(paint);
                }
            }
        }
        return true;
    }
    
    public static String[] getCourseName(){
        String cName[] = new String [list.size()];
        
        int i=0;
        for(ActivityCenter ac : list){
            cName[i] = ac.getCourseName();
            i++;
        }
        return cName;
    }

    public static String[] getCustomerId() {
        String cId[] = new String[list.size()];
        int i = 0;
        for (ActivityCenter ac : list) {
            cId[i] = ac.cust.getCustId() + "";
            i++;
        }
        return cId;
    }

    public static ActivityCenter remove(int remove) {
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i).cust.getCustId();
            if (remove == temp) {
                ActivityCenter ac = list.remove(i);
                ActivityCenter.numOfCustomer--;
                return ac;
            }
        }
        return null;
    }

    public static ActivityCenter search(int search) {
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i).cust.getCustId();
            if (search == temp) {
                return list.get(i);
            }
        }
        return null;
    }
    
    public static void calcPrice(){
        
        for(ActivityCenter ac : list){
            ac.calcPrice();
            if(ac instanceof Sport)
                ((Sport) ac).calcEquipmentPrice();
        }
    }

    public static String display() {
        ActivityCenter temp;
        String out = "";
        for (int i = 0; i < list.size(); i++) {

            temp = (ActivityCenter) list.get(i);
            out += temp.toString() + "\n\n";
        }
        return out;
    }
    
}
