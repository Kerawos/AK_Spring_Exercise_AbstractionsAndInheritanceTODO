package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.models.entities;

/**
 * Defined great hero
 */
public class Tywin extends Human { //todo exdends / implements
    private boolean isRich = true;
    public boolean isRich() {
        return isRich;
    }
    public String getMotto(){
        return "Hear me roar!";
    }
}
