package src;
import java.util.*;
public class Controller {

    /**
     * Default constructor
     */
    public Controller() {
    }

    /**
     * 
     */
    private int code;

    /**
     * 
     */
    private int count;

    /**
     * 
     */
    private DVM myDVM;

    /**
     * @return
     */
    public void showMenu() {
        // TODO implement here
    }

    public int isValidCode(int code) {
        // TODO implement here
        return 0;
    }

    public int isVaildCount(int count) {
        // TODO implement here
        return 0;
    }

    public Location getClosestDVM() {
        // TODO implement here
        Location returnLoc = new Location();
        Location myLoc = myDVM.getLocation();
        int x = myLoc.getX();
        int y = myLoc.getY();
        int min = 9999;
        //Server 내에 msgList에 접근하여 수신(응답)받은 Message Object를 하나씩 가져온다.

        return returnLoc;
    }

    /**
     * @return
     */
    public void showOtherDVM() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void showSelectItemPage() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void showPaymentPage() {
        // TODO implement here
    }

    /**
     * @return
     */
    public String createVerificationCode() {
        // TODO implement here
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String vCode = random.ints(leftLimit,rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return vCode;
    }

    /**
     * @return
     */
    public void showVerificationCodeMenu() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void showAdminPasswordPage() {
        // TODO implement here
    }

    public boolean checkAdminPassword(String password) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public void showAdminMenu() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void setDVMInfo() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void setDrinkInfo() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void setDrinkKinds() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void receiveMsg() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void getOutDrink() {
        // TODO implement here
    }

}