import java.util.ArrayList;

public class Player {
    // Player class has a name, a strat made of String, and a money amount and an arraylist of property he owns

    private String name;
    private String strat;
    private int money;
    private ArrayList<Property> properties;
    private int position;
    // Constructor for Player class
    public Player(String name, String strat, int money) {
        this.name = name;
        this.strat = strat;
        this.money = money;
        this.properties = new ArrayList<Property>();
        this.position = 0;
    }
    // Getter for name
    public String getName() {
        return name;
    }
    // Getter for strat
    public String getStrat() {
        return strat;
    }
    // Getter for money
    public int getMoney() {
        return money;
    }
    // Getter for properties
    public ArrayList<Property> getProperties() {
        return properties;
    }
    // Setter for money
    public void setMoney(int money) {
        this.money = money;
    }
    // adder and remover for properties
    public void addProperty(Property property) {
        properties.add(property);
    }
    public void removeProperty(Property property) {
        properties.remove(property);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void move(int spaces) {
        position += spaces;
        if (position >= 40) {
            position -= 40;
        }
    }
    


    
}
