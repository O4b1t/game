public class Utilities extends Property{
    //the utilities class has a rent fee multiplier
    private int rentFeeMultiplier;
    //the utilities class checks if the player owns both utilities
    private boolean ownsBoth;
    //the utilities class has a constructor that takes a name, a cost, a rent fee, a mortgage fee, and a rent fee multiplier
    public Utilities(String name, int cost, int rentFee, int mortgageFee, int rentFeeMultiplier) {
        super(name, cost, rentFee, mortgageFee);
        this.rentFeeMultiplier = rentFeeMultiplier;
        ownsBoth = false;
    }
    //the utilities class has a method to set ownsBoth
    public void setOwnsBoth(boolean ownsBoth) {
        this.ownsBoth = ownsBoth;
    }
    //the utilities class has a method to get the rent fee
    public int getRentFee() {
        if (ownsBoth) {
            return rentFeeMultiplier * 10;
        } else {
            return rentFeeMultiplier * 4;
        }
    }
    

}
