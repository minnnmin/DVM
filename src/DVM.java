package src;

import java.util.*;


public class DVM {


    public DVM() {
        this.location = new Location(0,0);
    }


    private String id;


    private Location location;


    private Item[] itemList;


    private String[] vCode;


    public Location getLocation() {
        // TODO implement here
        return location;
    }


    public boolean checkStock(int dCode, int Count) {
        // TODO implement here
        return false;
    }


    public boolean updateStock(int dCode, int Count) {
        // TODO implement here
        return false;
    }



    public boolean saveVerificationCode(String vCode, int dCode, int Count) {
        // TODO implement here
        return false;
    }


    public boolean isValidVerificationCode() {
        // TODO implement here
        return false;
    }


    public String reqVerificationCodeItem(String vCode) {
        // TODO implement here
        return vCode;
    }


    public boolean isValidPassword() {
        // TODO implement here
        return false;
    }


    public void saveDVMInfo(String id, Location location) {
        // TODO implement here
        return ;
    }


    public void saveDrinkInfo(int dCode, int price, int stock, String name) {
        // TODO implement here
        return ;
    }


    public void saveDrinkKinds(int[] dCode) {
        // TODO implement here
        return ;
    }

    public int getItemPrice(int dCode){


        return dCode;
    }

}