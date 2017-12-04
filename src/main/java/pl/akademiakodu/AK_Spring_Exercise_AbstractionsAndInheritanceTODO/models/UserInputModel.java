package pl.akademiakodu.AK_Spring_Exercise_AbstractionsAndInheritanceTODO.models;
/**
 * Holder for user inputs getting in this example from formular
 */
public class UserInputModel {

    private String ancestor;
    private String descendant;

    public String getAncestor() {
        return ancestor;
    }

    public void setAncestor(String ancestor) {
        this.ancestor = ancestor;
    }

    public String getDescendant() {
        return descendant;
    }

    public void setDescendant(String descendant) {
        this.descendant = descendant;
    }
}
