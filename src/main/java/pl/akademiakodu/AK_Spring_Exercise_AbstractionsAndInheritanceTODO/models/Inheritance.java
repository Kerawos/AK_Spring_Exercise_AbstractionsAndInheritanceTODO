package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.models;

/**
 * Import section
 */
import org.springframework.stereotype.Service;
import pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.models.entities.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Service check if entities classes are relevant by hierarchy of inheritance in proper way
 */
@Service
public class Inheritance {

    /**
     * heroes variables will store in this case list of available heroes
     */
    private List<Human> heroes;

    /**
     * Constructor also will fill list of heroes
     */
    public Inheritance() {
        heroes = new ArrayList<>();
        heroes.add(new Eddard());
        heroes.add(new Rob());
        heroes.add(new Tywin());
        heroes.add(new Tyrion());
        heroes.add(new Jaime());
        heroes.add(new Joffrey());
        heroes.add(new Tommen());
        heroes.add(new Aerys());
        heroes.add(new Rhaegar());
        heroes.add(new Jon());
    }

    /**
     * Method will check if one class derived from other listed class
     * @param ancestorName parent class
     * @param descendantName child class
     * @return inheritance result as string
     */
    public String isDescendant(String ancestorName, String descendantName){
        if (!isCorrectName(ancestorName, descendantName)){
            return "We do not have typed heroes in our database..";
        }
        if (ancestorName.equals(descendantName)){
            return "You entered same heroes";
        }
        Class Ancestor;
        Class Descendant;
        for (Human hero : heroes) {
            if (hero.getClass().getName().substring(hero.getClass().getName().lastIndexOf(".") + 1).equals(ancestorName)){
                Ancestor = hero.getClass();
                for (Human human : heroes) {
                    if (human.getClass().getName().substring(human.getClass().getName().lastIndexOf(".") + 1).equals(descendantName)){
                        Descendant = human.getClass();
                        if(Ancestor.isAssignableFrom(Descendant)){
                            return descendantName + " inheritance from " + ancestorName;
                        }
                    }
                }
            }
        }
        return "Unfortunately " + descendantName + " do not inheritance from " + ancestorName;
    }

    /**
     * This method check if potential user input entered proper hero name.
     * @param ancestorName parent hero name
     * @param descendantName child hero name
     * @return result of corrected name
     */
    public boolean isCorrectName(String ancestorName, String descendantName){
        boolean aName = false;
        boolean dName = false;
        for (Human hero : heroes) {
            if (hero.getClass().getName().substring(hero.getClass().getName().lastIndexOf(".") + 1).equals(ancestorName)){
                aName = true;
            }
            if (hero.getClass().getName().substring(hero.getClass().getName().lastIndexOf(".") + 1).equals(descendantName)){
                dName = true;
            }
        }
        if (!aName || !dName){
            return false;
        }
        return true;
    }

    /**
     * Method will provide all available heroes separated by comas. It will show to user all available heroes names.
     * @return string with all heroes names
     */
    public String getHeroesNames(){
        StringBuilder sb = new StringBuilder();
        for (Human hero : getHeroes()) {
            sb.append(hero.getClass().getName().substring(hero.getClass().getName().lastIndexOf(".") + 1) + ", ");
        }
        return sb.toString();
    }

    /**
     * Method inform us about proper inheritance of listed heroes
     * @param ancestorName parent hero name
     * @param descendantName child hero name
     * @return result of corrected name
     */
    public boolean bTest(String ancestorName, String descendantName){
        if (isDescendant(ancestorName, descendantName).equals(descendantName + " inheritance from " + ancestorName)){
            return true;
        }
        return false;
    }

    /**
     * Method test listed inheritance
     * @return result of inheritance
     */
    public boolean bonusTest(){
        boolean b = false;
        b = bTest("Aerys", "Rhaegar");
        b = bTest("Aerys", "Jon");
        b = bTest("Rhaegar", "Jon");
        b = bTest("Eddard", "Rob");
        b = bTest("Tywin", "Tyrion");
        b = bTest("Tywin", "Jaime");
        b = bTest("Tywin", "Tommen");
        b = bTest("Tywin", "Joffrey");
        b = bTest("Jaime", "Joffrey");
        b = bTest("Jaime", "Tommen");
        return b;
    }

    /**
     * Getter section
     * @return already defined and filled list of heroes
     */
    public List<Human> getHeroes() {
        return heroes;
    }
}
