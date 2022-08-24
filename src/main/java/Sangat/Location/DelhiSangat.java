package Sangat.Location;

import Sangat.Interface.ICountSeva;

public class DelhiSangat implements ICountSeva {
    private int chuski;
    private String name;

    public DelhiSangat(String name, int chuski){

        this.name = name;
        this.chuski = chuski;

    }
    @Override
    public int countSeva(int sevaQuantity) {
        return chuski;
    }
    public String countSeva(String name, int sevaQuantity){

        return String.format("Seva donated from %s is £%s", name, sevaQuantity);
    }


}
