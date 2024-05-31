public class Cards extends Tiles {

    //the cards class has a name
    private String name;
    //the cards class has a constructor that takes a name
    public Cards(String name) {
        super(name); // Explicitly invoke the constructor of the superclass Tiles
       
    }
    //the cards class has a method to get the name
    public String getName() {
        return name;
    }

}
