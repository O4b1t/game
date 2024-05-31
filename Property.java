public class Property extends Tiles {
    // the property class has a name, a cost, a rent fee, and a morgage fee
    // the property class has a owner

    private int cost;
    private int rentFee;
    private int mortgageFee;
    // Remove the duplicate declaration of the owner field
    public Property(String name, int cost, int rentFee, int mortgageFee) {
        super(name); // Explicitly invoke the constructor of the superclass Tiles
        this.cost = cost;
        this.rentFee = rentFee;
        this.mortgageFee = mortgageFee;
    }
    //the property class has methods to get the name, cost, rent fee, and mortgage fee, and to set the rent fee
    public int getCost() {
        return cost;
    }
    public int getRentFee() {
        return rentFee;
    }
    private Player owner; // Declare the owner variable

    public int getMortgageFee() {
        return mortgageFee;
    }
    public void setRentFee(int rentFee) {
        this.rentFee = rentFee;
    }
    //the property class has a method to get the owner
    public Player getOwner() {
        return owner;
    }
    //the property class has a method to set the owner
    public void setOwner(Player owner) {
        this.owner = owner;
    }
    
    
    
}
