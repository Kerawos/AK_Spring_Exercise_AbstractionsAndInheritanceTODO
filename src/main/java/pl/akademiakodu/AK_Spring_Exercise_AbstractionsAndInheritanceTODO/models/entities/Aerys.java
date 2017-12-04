package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.models.entities;

/**
 * Defined great hero
 */
public class Aerys extends Human { //todo exdends / implements
    private boolean isMad = true;

    public boolean isMad() {
        return isMad;
    }

    public String getMotto() {
        return "Fire and Blood";
    }
}
