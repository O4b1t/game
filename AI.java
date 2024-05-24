import java.util.ArrayList;

public class AI extends Player {
    // AI class is a subclass of Player class
    // AI class has a name, a strat made of String, and a money amount and an arraylist of property he owns
    // AI class has a constructor that takes in a name, a strat, and a money amount
    // AI class has a method to get the name
    // AI class has a method to get the strat
    // AI class has a method to get the money
    // AI class has a method to get the properties
    // AI class has a method to set the money
    // AI class has a method to add a property
    // AI class has a method to remove a property
    
    public AI(String name, String strat, int money) {
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
