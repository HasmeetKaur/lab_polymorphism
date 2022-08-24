package Sangat.Location;

import Sangat.Interface.ICountSeva;

public class AmritsarSangat implements ICountSeva {
    private int amritsarKulche;
    private int falooda;
    private String name;


    public AmritsarSangat(String name, int amritsarKulche, int falooda){
        this.name = name;
        this.amritsarKulche = amritsarKulche;
        this.falooda = falooda;
    }
    @Override
    public int countSeva(int sevaQuantity) {
        return amritsarKulche + falooda;
    }

    public String countSeva(String name, int sevaQuantity){

        return String.format("Seva donated from %s is £%s", name, sevaQuantity);
    }


}
