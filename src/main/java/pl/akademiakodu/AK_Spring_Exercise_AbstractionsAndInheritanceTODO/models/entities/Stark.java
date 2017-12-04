package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.models.entities;

/**
 * First Stark will be parent for all other Starks
 */
public abstract class Stark extends Human { //todo exdends / implements

    public String getMotto(){
        return "Winter is comming";
    }
}
