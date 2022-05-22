package src;

import java.util.*;

public class DVM {

    public DVM() {
        this.location = new Location();
    }

    private String id;

    private Location location;

    private Item[] itemList;

    private String[] vCode;

    public Location getLocation() {
        // TODO implement here
        return location;
    }

    public boolean checkStock() {
        // TODO implement here
        return false;
    }

    public Item[] getItemList() {
        return itemList;
    }

    public boolean updateStock() {
        // TODO implement here
        return false;
    }


    public boolean saveVerificationCode(String vCode) {
        // TODO implement here
        return false;
    }

    public boolean isValidVerificationCode() {
        // TODO implement here
        return false;
    }

    public boolean reqVerificationCodeItem() {
        // TODO implement here
        return false;
    }

    public boolean isValidPassword() {
        // TODO implement here
        return false;
    }

    public void saveDVMInfo(String id, Location location) {
        // TODO implement here
    }

    public void saveDrinkInfo(int dCode,int price,int stock, String name) {
        // TODO implement here
    }

    public void saveDrinkKinds(int[] dCode) {
        // TODO implement here
    }

}