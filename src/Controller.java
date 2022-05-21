
import java.util.*;


public class Controller {

    public Controller() {
        myDVM = new DVM();
    }

    private String code;
    private int count;
    private DVM myDVM;
    private String userInfo;   //없어도 되지 않나 싶음
    private int totalPrice;    //없어도 되지 않나 싶음

    public void showMenu() {
        while(true) {
            int mode = 0;
            Scanner sc = new Scanner(System.in);

            while (true) {
                try {
                    System.out.println("원하시는 메뉴의 번호를 입력해주세요.\n" +
                            "1. 음료 선택\n" +
                            "2. 인증코드 입력\n" +
                            "3. 관리자 모드" +
                            "> ");
                    mode = sc.nextInt();
                    break;
                } catch (InputMismatchException ime) {
                    System.out.println("잘못된 입력입니다. 정수만 입력해주세요.");
                }
            }



            while (!(mode > 0 && mode < 4)) {
                System.out.println("잘못된 입력입니다. 1, 2, 3 중에서만 입력해주세요.");
                System.out.println("원하시는 메뉴의 번호를 입력해주세요.\n" +
                        "1. 음료 선택\n" +
                        "2. 인증코드 입력\n" +
                        "3. 관리자 모드" +
                        "> ");
                while (true) {
                    try {
                        mode = sc.nextInt();
                        break;
                    } catch (InputMismatchException ime) {
                        System.out.println("잘못된 입력입니다. 정수만 입력해주세요.");
                        System.out.println("원하시는 메뉴의 번호를 입력해주세요.\n" +
                                "1. 음료 선택\n" +
                                "2. 인증코드 입력\n" +
                                "3. 관리자 모드" +
                                "> ");
                    }
                }
            }
            sc.close();

            switch (mode) {
                case 1:
                    showSelectItemPage();
                    break;
                case 2:
                    showVerificationCodeMenu();
                    break;
                case 3:
                    showAdminPasswordPage();
                    break;
            }
        }


        return ;
    }
    //일단 무한 loop를 돌림

    public int isVaildCode() {
        switch(code){
            case "0":
                return 0;
            case "01":
            case "02":
            case "03":
            case "04":
            case "05":
            case "06":
            case "07":
            case "08":
            case "09":
            case "10":
            case "11":
            case "12":
            case "13":
            case "14":
            case "15":
            case "16":
            case "17":
            case "18":
            case "19":
            case "20":
                return 1;
            default:
                return -1;
        }
    }

    public int isVaildCount() {
        if(count == 0){
            return 0;
        }else if((count > 0) && ( count < 1000)){
            return 1;
        } else {
            return -1;
        }
    }

    public Location getClosestDVM() {
        // TODO implement here
        Location returnLoc = new Location();
        int min = 9999;
        //location[] respondLoc = new Location[10];
        Location myLoc = myDVM.getLocation();
        int x = myLoc.getX();
        int y = myLoc.getY();
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

    public void showOtherDVM(Location otherDVM) {
        System.out.println("재고가 있는 가장 가까운 DVM의 위치는 "+otherDVM.getX()+", "+otherDVM.getY());
        return ;
    }

    public void showSelectItemPage() {
        int errno = 0;
        Scanner sc = new Scanner(System.in);

        while(!(errno == 1)) {
            System.out.println("콜라(01)     사이다(02)     녹차(03)      홍차(04)\n" +
                    "밀크티(05)   탄산수(06)     보리차(07)     캔커피(08)\n" +
                    "물(09)      에너지드링크(10) 바닷물(11)    식혜(12)\n" +
                    "아이스티(12) 딸기주스(14)    오렌지주스(15) 포도주스(16)\n" +
                    "이온음료(17) 아메리카노(18)   핫초코(19)    카페라뗴(20)");
            System.out.println("메뉴 선택으로 돌아가려면 \"0\"을 입력해 주세요.\n");
            System.out.println("원하시는 음료의 번호를 입력해주세요.\n" +
                    "> ");
            try{
                code = sc.next();
            }
            catch(InputMismatchException ime){
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            errno = isVaildCode();
            if(errno == 0){
                System.out.println("음료 선택을 취소합니다.");
                return ;
            } else if (errno == -1) {
                System.out.println("0~20 사이의 음료코드를 입력해주세요.");
            }
        }

        errno = 0;
        while(!(errno == 1)) {
            System.out.println("수량을 입력해주세요.\n" +
                                 "> ");
            try{
                count = sc.nextInt();
            }
            catch(InputMismatchException ime){
                System.out.println("잘못된 입력입니다. 정수만 입력해주세요.");
                continue;
            }

            errno = isVaildCount();
            if(errno == 0){
                System.out.println("음료 선택을 취소합니다.");
                return ;
            } else if (errno == -1) {
                System.out.println("1~999 사이애서 개수를 입력해주세요.");
            }
        }

        if(myDVM.checkStock()){
            showPaymentPage();
        }else{
            showOtherDVM(getClosestDVM());
            showPaymentPage();
        }

        return ;
    }

    public void showPaymentPage() {
        // TODO implement here
        return ;
    }

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

    public void showVerificationCodeMenu() {
        String vCode = "입력오류";
        boolean vCodeTR = false;

        Scanner sc = new Scanner(System.in);
        while(!vCodeTR) {
            System.out.println("선결제 후 받은 인증코드를 입력해주세요\n" +
                    "(메뉴 선택으로 돌아가려면 “0”를 입력해주세요)\n" +
                    "> ");

            try {
                vCode = sc.next();
            }

            catch(InputMismatchException ime){
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            vCodeTR = isRightVerificationCode(vCode);          //인증코드 입력형식 test
        }

        vCodeTR = myDVM.isValidVerificationCode();             //유효한 인증코드 test
        if (vCode.equals("0")) {

        } else if (!vCodeTR) {

            System.out.println("유효하지 않은 인증코드입니다.");
        } else {
            getOutDrink(myDVM.reqVerificationCodeItem(vCode));
        }

        sc.close();
        return ;
    }

    public boolean isRightVerificationCode(String vCode){
        boolean vCodeTR = false;
        boolean numberFlag = false, letterFlag = false;
        char chrInput;

        if(vCode.length() == 10){
            for(int i = 0; i < vCode.length(); i++){
                chrInput = vCode.charAt(i);
                if (chrInput >= 0x61 && chrInput <= 0x7A) {
                    letterFlag = true;
                } else if (chrInput >= 0x30 && chrInput <= 0x39) {
                    numberFlag = true;
                } else{
                    break;
                }

                if((i == vCode.length()) && (numberFlag && letterFlag)) {
                    vCodeTR = true;
                }
            }
        }

        return vCodeTR;
    }

    public void showAdminPasswordPage() {
        // TODO implement here
        return ;
    }

    public boolean checkAdminPassword(String password) {
        // TODO implement here
        return false;
    }

    public void showAdminMenu() {
        // TODO implement here
        return ;
    }

    public void setDVMInfo() {
        // TODO implement here
        return ;
    }

    public void setDrinkInfo() {
        // TODO implement here
        return ;
    }

    public void setDrinkKinds() {
        // TODO implement here
        return ;
    }

    public void receiveMsg(Message msg) {  //myDVM.checkStock() 구현 봐야 함
        String msgType = msg.getMsgType();

        switch(msgType){
            case "StockCheckRequest":
               if(myDVM.checkStock()) {
                   //재고 확인 응답 message 보냄
               }
                break;
            case "SalesCheckRequest":
                if(myDVM.checkStock()){
                    if(myDVM.updateStock()){
                        //음표 판매 응답 message 보냄
                    }
                }
                else{

                }
                break;

            case "PrepaymentCheck":
                myDVM.saveVerificationCode(msg);
                break;
        }

        return ;
    }

    public boolean checkMsgType() {    //Message 객체에서 msgType 바로 사용하면 되서 필요 없을 것 같습니다.
        // TODO implement here
        return false;
    }

    public void getOutDrink(String vCode) {
        System.out.println(vCode);
        System.out.println("음료가 모두 배출되었습니다.\n 감사합니다.");

        return ;
    }

    public int calculateTotalPrice(){
        int totalPrice = count * myDVM.'코드에 해당하는 음료 가격 리턴해주는 함수'(code);

        return totalPrice;
    }
    // DMV 완성 후, 함수 하나 사용해야 함
}