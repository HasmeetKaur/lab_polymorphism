package Sangat.Location;

import Sangat.Interface.ICountSeva;

public class KapurtalaSangat implements ICountSeva {
    private int pinnia;
    private String name;

    public KapurtalaSangat(String name, int pinnia){

        this.name = name;
        this.pinnia = pinnia;

    }
    @Override
    public int countSeva(int sevaQuantity) {
        return pinnia;
    }

    public String countSeva(String name, int sevaQuantity){

        return String.format("Seva donated from %s is £%s", name, sevaQuantity);
    }


}
