public class Property {
    // the property class has a name, a cost, a rent fee, and a morgage fee
    // the property class has a owner

    private String name;
    private int cost;
    private int rentFee;
    private int mortgageFee;
    private Player owner;
    //the property class has a 
    public Property(String name, int cost, int rentFee, int mortgageFee) {
        this.name = name;
        this.cost = cost;
        this.rentFee = rentFee;
        this.mortgageFee = mortgageFee;
    }
    //the property class has methods to get the name, cost, rent fee, and mortgage fee, and to set the rent fee
    public String getName() {
        return name;
    }
    public int getCost() {
        return cost;
    }
    public int getRentFee() {
        return rentFee;
    }
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
