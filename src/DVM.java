
import java.util.*;

/**
 * 
 */
public class DVM {

    /**
     * Default constructor
     */
    public DVM() {
        this.location = location(0,0);
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private Location location;

    /**
     * 
     */
    private Item[] itemList;

    /**
     * 
     */
    private String[] vCode;

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
    public boolean checkStock() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean updateStock() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */

    public boolean saveVerificationCode(void String vCode) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public boolean isValidVerificationCode() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public String reqVerificationCodeItem(String vCode) {
        // TODO implement here
        return ;
    }

    /**
     * @return
     */
    public boolean isValidPassword() {
        // TODO implement here
        return false;
    }

    /**
     * @param String id 
     * @param Location location 
     * @return
     */
    public void saveDVMInfo(void String id, void Location location) {
        // TODO implement here
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
        return null;
    }

    /**
     * @param int[] dCode 
     * @return
     */
    public void saveDrinkKinds(void int[] dCode) {
        // TODO implement here
        return null;
    }

}