
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
        boolean check=myDVM.isValidPassword();
        if(!check)
            return false;
        else
            return true;
    }

    /**
     * @return
     */
    public void showAdminMenu() {
        // TODO implement here
        return null;
    }

    public void setDVMInfo() {


        System.out.println("<DVM 정보 관리>");
        System.out.println("id 입력 후 tab을 눌러 좌표를 입력하세요\n");
        System.out.println("id  좌표");
        System.out.println(">");

        while(true)
        {

        }
    }

    public void setDrinkInfo() {

    }

    public void setDrinkKinds() {
        Scanner scan=new Scanner(System.in);
        int count=0;
        int drinkCode=0;
        int[] dCodeArr=new int[7];

        System.out.println("<음료 세팅>");
        System.out.println("현재 자판기에서 판매할 7가지 음료의 번호를 차례로 입력해주세요");
        System.out.println("콜라(01) 사이다(02) 녹차(03) 홍차(04) 밀크티(05) 탄산수(06) 보리차(07) 캔커피(08) 물(09) 에너지드링크(10) " +
                "바닷물(11) 식혜(12) 아이스티(13) 딸기주스(14) 오렌지주스(15) 포도주스(16) 이온음료(17) 아메리카노(18)" +
                "핫초로(19) 카페라떼(20)\n");
        System.out.println(">");

        while(true)
        {
            while(!scan.hasNextInt())
            {
                scan.next():
                System.out.println("정확한 번호만 입력하세요");
            }
            drinkCode=scan.nextInt();
            if(drinkCode>=1&&drinkCode<=20)
            {
                dCodeArr[count]=drinkCode;
                count++;
                if(count==7)
                    break;
            }
            else
            {
                System.out.println("정확한 번호만 입력하세요");
            }
        }
        myDVM.saveDrinkKinds(dCodeArr);
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