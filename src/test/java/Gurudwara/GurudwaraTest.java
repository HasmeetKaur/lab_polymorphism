package Gurudwara;

import Sangat.Location.AmritsarSangat;
import Sangat.Location.DelhiSangat;
import Sangat.Location.KapurtalaSangat;
import org.junit.jupiter.api.Test;

public class GurudwaraTest {
    public void setUp(){
        AmritsarSangat amritsarSangat = new AmritsarSangat(5);
        DelhiSangat delhiSangat = new DelhiSangat(3);
        KapurtalaSangat kapurtalaSangat = new KapurtalaSangat(5);
    }


    @Test
    public void canAddSevaToGurudwara(){
        gurudwara.addSangat(amritsarSangat);
        gurudwara.addSangat(delhiSangat);
        System.out.println(gurudwara.getSeva());
    }

}
