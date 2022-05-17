
import java.util.*;

/**
 * 
 */
public class Controller {

    /**
     * Default constructor
     */
    public Controller() {
    }

    /**
     * 
     */
    private Int code;

    /**
     * 
     */
    private Int count;

    /**
     * 
     */
    private DVM myDVM;

    /**
     * @return
     */
    public void showMenu() {
        // TODO implement here
        return null;
    }

    /**
     * @param int code 
     * @return
     */
    public int isVaildCode(void int code) {
        // TODO implement here
        return 0;
    }

    /**
     * @param int count 
     * @return
     */
    public int isVaildCount(void int count) {
        // TODO implement here
        return 0;
    }

    /**
     * @param int count
     * @param int dCode
     * @return
     */
    public Location getClosestDVM() {
        // TODO implement here
        location returnLoc;
        int min = 9999;
        //location[] respondLoc = new Location[10];
        location myLoc = myDVM.getLocation();
        int x = myloc.getX();
        int y = myloc.getY();
        /*
            msg broadcast, dCode(음료)가 count 이상인 DVM들의 위치를 받아서 바로바로 비교
        */
        //받은 메시지의 location이 res이라고 가정
        //while(메세지 큐가 비지않았다면 반복)
        int tempx = x - res.x;
        if(tempx<0) tempx = tempx * -1;
        int tempy = y - res.y;
        if(tempy<0) tempy = tempy * -1;
        if(tempx+tempy < min) {
            min = tempx + tempy;
            returnLoc.setX(tempx);
            returnLoc.setY(tempy);
        }
        /// 반복

        return returnLoc;
    }

    /**
     * @return
     */
    public void showOtherDVM() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void showSelectItemPage() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void showPaymentPage() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String vCode createVerificationCode() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void showVerificationCodeMenu() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void showAdminPasswordPage() {
        // TODO implement here
        return null;
    }

    /**
     * @param String password 
     * @return
     */
    public boolean checkAdminPassword(void String password) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public void showAdminMenu() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void setDVMInfo() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void setDrinkInfo() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void setDrinkKinds() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void receiveMsg() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public boolean checkMsgType() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public void getOutDrink() {
        // TODO implement here
        return null;
    }

}