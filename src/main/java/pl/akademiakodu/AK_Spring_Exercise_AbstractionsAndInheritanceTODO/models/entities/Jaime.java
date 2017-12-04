package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.models.entities;

/**
 * Defined great hero
 */
public class Jaime extends Human { //todo exdends / implements
    private boolean isGood = true;

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    public String getMotto(){
        return "Hear me roar!";
    }
}
