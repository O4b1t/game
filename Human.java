import java.util.ArrayList;

public class Human extends Player {
    // Human class is a subclass of Player class
    // Human class has a name, a strat made of String, and a money amount and an
    // arraylist of property he owns
    // Human class has a constructor that takes in a name, a strat, and a money
    // amount
    // Human class has a method to get the name
    // Human class has a method to get the strat
    // Human class has a method to get the money
    // Human class has a method to get the properties
    // Human class has a method to set the money
    // Human class has a method to add a property
    // Human class has a method to remove a property

    public Human(String name, String strat, int money) {
        super(name, strat, money);
    }

    public String getName() {
        return super.getName();
    }

    public String getStrat() {
        return super.getStrat();
    }

    public int getMoney() {
        return super.getMoney();
    }

    public ArrayList<Property> getProperties() {
        return super.getProperties();
    }

    public void setMoney(int money) {
        super.setMoney(money);
    }

    public void addProperty(Property property) {
        super.addProperty(property);
    }

    public void removeProperty(Property property) {
        super.removeProperty(property);
    }

}
