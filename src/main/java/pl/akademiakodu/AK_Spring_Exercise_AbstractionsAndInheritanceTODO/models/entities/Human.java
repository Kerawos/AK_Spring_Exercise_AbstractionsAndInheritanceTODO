package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.models.entities;

/**
 * Parent class of all heroes
 */
public abstract class Human {

    /**
     * every heroes must have house
     */
    private House house;

//    public Human(House house) {
//        this.house = house;
//    }

    /**
     * getters and setters section
     */
    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
