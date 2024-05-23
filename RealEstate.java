public class RealEstate extends Property{
    //the real estate class has a house count, a int arry of costs at different house counts, and a int array of rent fees at different house counts
    private int houseCount;
    private int[] houseCosts;
    private int[] houseRentFees;
    //the real estate class has a constructor that takes a name, a cost, a rent fee, a mortgage fee, a house count, an int array of costs at different house counts, and an int array of rent fees at different house counts
    public RealEstate(String name, int cost, int rentFee, int mortgageFee, int houseCount, int[] houseCosts, int[] houseRentFees) {
        super(name, cost, rentFee, mortgageFee);
        this.houseCount = houseCount;
        this.houseCosts = houseCosts;
        this.houseRentFees = houseRentFees;
    }
    //the real estate class has methods
    //to update the house count and change the rent fee based on the house count
    public void updateHouseCount(int houseCount) {
        this.houseCount = houseCount;
    }
    public void changeRentFee() {
        setRentFee(houseRentFees[houseCount]);
    }
    //to get the house count, the cost at the current house count, and the rent fee at the current house count
    public int getHouseCount() {
        return houseCount;
    }
    public int getCost() {
        return houseCosts[houseCount];
    }
    public int getRentFee() {
        return houseRentFees[houseCount];
    }
    //to get the cost at a specific house count and the rent fee at a specific house count
    public int getCost(int houseCount) {
        return houseCosts[houseCount];
    }
    public int getRentFee(int houseCount) {
        return houseRentFees[houseCount];
    }
    
}
