
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 */
public class DVM {

    /**
     * Default constructor
     */
    public DVM() {
        this.location = Location(0,0);
        itemList = new Item[20];
        for(int i = 0; i < 20 ; ++i){
            itemList[i] = new Item(i);
        }
        id = "9999";
    }
    private String id;
    private Location location;
    private Item[] itemList;
    private Queue<String> vCodeList = new LinkedList<String>();


    /**
     * @return
     */
    public Location getLocation() {
        // TODO implement here
        return location;
    }

    /**
     * @return
     */
    public boolean checkStock(int dCode, int Count) {
        // TODO implement here
        return itemlist[dCode-1].checkStock(Count);
    }

    /**
     * @return
     */
    public boolean updateStock(int dCode, int Count) {
        // TODO implement here
        return itemlist[dCode-1].updateStock(Count);
    }

    /**
     * @return
     */

    public boolean saveVerificationCode(String vCode) {
        // TODO implement here
        vCodeList.add(vCode);
        return false;
    }

    /**
     * @return
     */
    public boolean isValidVerificationCode(String vCode) {
        // TODO implement here
        return vCodeList.contain(vCode);
    }

    /**
     * @return
     */
    public boolean reqVerificationCodeItem(String vCode) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean isValidPassword() {
        // TODO implement here
        //Password 비교 대상을 어디에 둘지
        return false;
    }

    /**
     * @param String id 
     * @param Location location 
     * @return
     */
    public void saveDVMInfo(void String id, void Location location) {
        // TODO implement here
        this.id = id;
        this.location.setX(location.getX());
        this.location.setY(location.getY());
        return null;
    }

    /**
     * @param int dCode 
     * @param int price 
     * @param int stock 
     * @param String name 
     * @return
     */
    public void saveDrinkInfo(void int dCode, void int price, void int stock, void String name) {
        // TODO implement here
        //item setter 필요
        //itemList[dCode-1];
        return null;
    }

    /**
     * @param int[] dCode 
     * @return
     */
    public void saveDrinkKinds(void int[] dCode) {
        // TODO implement here
        // 받아오는 형식과 저장하는 방식의 문제
        return null;
    }

}