package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.models.entities;

/**
 * First Lannister will be parent for all other Lannisters
 */
public abstract class Lannister extends Human { //todo exdends / implements

    public String getMotto(){
        return "Hear me roar!";
    }
}
