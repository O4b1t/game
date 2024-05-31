public class RailRoads extends Property{
    
    //the railroads class has a rent fee multiplier
    private int rentFeeMultiplier;
    private String name;
    private int cost;
    private int rentFee;
    private int mortgageFee;


    //the railroads class has a constructor that takes a name, a cost, a rent fee, and a mortgage fee
    public RailRoads(String name, int cost, int rentFee, int mortgageFee) {
        super(name, cost, rentFee, mortgageFee);
        rentFeeMultiplier = 25;
    }
    //the railroads class has a method to get the rent fee
    //the railroads class has a method to get the rent fee multiplier
    public int getRentFeeMultiplier() {
        return rentFeeMultiplier;
    }
    //the railroads class has a method to set the rent fee multiplier
    public void setRentFeeMultiplier(int rentFeeMultiplier) {
        this.rentFeeMultiplier = rentFeeMultiplier;
    }
    //the railroads class has a method to get the name
    public String getName() {
        return name;
    }
    //the railroads class has a method to get the cost
    public int getCost() {
        return cost;
    }
    //the railroads class has a method to get the rent fee
    public int getRentFee() {
        return rentFee;
    }
    //the railroads class has a method to get the mortgage fee
    public int getMortgageFee() {
        return mortgageFee;
    }
    


    
}
