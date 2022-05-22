package src;

import java.util.*;

public class Controller {

    public Controller() {
    }

    private int code;

    private int count;

    private DVM myDVM;


    Scanner scan=new Scanner(System.in);

    public void showMenu() {
        // TODO implement here
    }

    public int isVaildCode(int code) {
        // TODO implement here
        return 0;
    }

    public int isVaildCount(int count) {
        // TODO implement here
        return 0;
    }

//    public Location getClosestDVM() {
//        // TODO implement here
//        Location returnLoc;
//        int min = 9999;
//        //location[] respondLoc = new Location[10];
//        Location myLoc = myDVM.getLocation();
//        int x = myLoc.getX();
//        int y = myLoc.getY();
//        /*
//            msg broadcast, dCode(음료)가 count 이상인 DVM들의 위치를 받아서 바로바로 비교
//        */
//        //받은 메시지의 location이 res이라고 가정
//        //while(메세지 큐가 비지않았다면 반복)
//        int tempx = x - res.x;
//        if(tempx<0) tempx = tempx * -1;
//        int tempy = y - res.y;
//        if(tempy<0) tempy = tempy * -1;
//        if(tempx+tempy < min) {
//            min = tempx + tempy;
//            returnLoc.setX(tempx);
//            returnLoc.setY(tempy);
//        }
//        /// 반복
//
//        return returnLoc;
//    }

    public void showOtherDVM(Location otherDVM) {
        System.out.println("재고가 있는 가장 가까운 DVM의 위치는 "+otherDVM.getX()+", "+otherDVM.getY());
    }

    public void showSelectItemPage() {
        // TODO implement here
    }

    public void showPaymentPage(int totalPrice) {
        String cardInfo;
        boolean check;

        System.out.println("<결제>");
        System.out.println("(메뉴 선택으로 돌아가려면 \"0\"을 입력해주세요.)");
        System.out.print(">");

        cardInfo=scan.nextLine();
        if(cardInfo.equals("0"))
            return; //showMenu로 돌아감
        else {
            //check = CardCompany.isValidCard(cardInfo,totalPrice);
            check=false; //위에 함수 없어서 우선 그냥 해 놓은 것.
            if (check) {
            //    CardCompany.deductMoney(cardInfo,totalPrice);
                myDVM.updateStock();    //뭔가 넘겨야 할 것 같다.
                getOutDrink();  //updateStock이 잘 되면 진행해야 할 것 같다.
                return;
            }
            else {
                System.out.println("카드 정보가 올바르지 않거나 잔액이 부족하여 메뉴 선택으로 돌아갑니다.");
                return; //showMenu로 돌아감
            }
        }
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
        // TODO implement here
    }

    public void showAdminPasswordPage() {

        int menu;

        System.out.println("<관리자 모드>");
        System.out.println("원하는 작업의 번호를 선택해주세요.");
        System.out.println("(메뉴 선택으로 돌아가려면 \"0\"을 입력해주세요.");

        System.out.println("1. DVM 정보 관리");
        System.out.println("2. 음료 정보 관리");
        System.out.println("3. 음료 세팅");

        System.out.print(">");

        while(true)
        {
            while(!scan.hasNextInt())
            {
                scan.next();
                System.out.println("정확한 번호만 입력하세요");
            }
            menu=scan.nextInt();
            if(menu==1)
                setDVMInfo();
            else if(menu==2)
                setDrinkInfo();
            else if(menu==3)
                setDrinkKinds();
            else if(menu==0)
                return; //showMenu로 돌아감
            else
            {
                System.out.println("번호는 0~3만 입력하세요");
            }
        }
    }

    public boolean checkAdminPassword(String password) {
        boolean check=myDVM.isValidPassword();
        if(!check)
            return false;
        else
            return true;
    }

    public void showAdminMenu() {

        String adminPassword;
        boolean check;

        System.out.println("Admin password를 입력해 주세요");
        System.out.println("(메뉴 선택으로 돌아가려면 \"0\"을 입력해주세요.");
        System.out.print(">");

        while(true) {
            adminPassword=scan.nextLine();
            if(adminPassword.equals("0"))
                return; //showMenu로 돌아감
            else {
                check = checkAdminPassword(adminPassword);
                if (check) {
                    showAdminPasswordPage();
                }
                else {
                    System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요");
                }
            }
        }
    }

    public void setDVMInfo() {

        String name="Team4";
        String inputId;
        int x=0;
        int y=0;
        Location loc;

        System.out.println("<DVM 정보 관리>");
        System.out.println("id 입력 후 tab을 눌러 좌표를 입력하세요\n");
        System.out.println("id  좌표");
        System.out.println("Team4   10 20");
        System.out.print(">");

        while(true)
        {
            inputId=scan.next();
            if(inputId.equals(name))
            {
                break;
            }
            else
            {
                System.out.println("DVM의 id를 확인 후 입력하세요");
            }
        }
        while(true)
        {
            while(!scan.hasNextInt())
            {
                scan.next();
                System.out.println("정확한 번호만 입력하세요");
            }
            x=scan.nextInt();
            if(x>=0&&x<=99)
                break;
            else
                System.out.println("x 좌표의 범위는 0~99입니다. 다시 입력하세요");
        }

        while(true)
        {
            while(!scan.hasNextInt())
            {
                scan.next();
                System.out.println("정확한 번호만 입력하세요");
            }
            y=scan.nextInt();
            if(y>=0&&y<=99)
                break;
            else
                System.out.println("y 좌표의 범위는 0~99입니다. 다시 입력하세요");
        }

        loc=new Location(x,y);
        myDVM.saveDVMInfo(inputId,loc);
    }

    public void setDrinkInfo() {

        Item[] myItem= myDVM.getItemList();

        System.out.println("<음료 정보 관리>");
        System.out.println("음료 정보 관리 시 tab을 눌러 다음 정보를 입력 후");
        System.out.println("enter를 눌러 다음 음료를 입력하세요.\n");
        System.out.println("음료 코드   음료 이름   가격  재고");

        for(int i=0;i<myItem.length;i++)
        {

        }

    }

    public void setDrinkKinds() {

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
                scan.next();
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
                System.out.println("번호는 01~20만 입력하세요");
            }
        }
        myDVM.saveDrinkKinds(dCodeArr);
    }

    public void receiveMsg() {
        // TODO implement here
    }

    public boolean checkMsgType() {
        // TODO implement here
        return false;
    }

    public void getOutDrink() {
        // TODO implement here
    }

}