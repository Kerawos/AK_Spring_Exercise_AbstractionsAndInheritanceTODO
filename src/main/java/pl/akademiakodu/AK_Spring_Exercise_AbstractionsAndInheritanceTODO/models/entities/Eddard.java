package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.models.entities;

public class Eddard extends Human { //todo exdends / implements

    private boolean isNaive = true;


    public boolean isNaive() {
        return isNaive;
    }

    public String getMotto(){
        return "Winter is comming";
    }
}
