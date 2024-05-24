public class Dice {
    // the dice class has two dice and rolls them whenever this class is created, if it rolled doubles, it will roll again
    // the dice class has a method to get the total of the two dice
    // the dice class has a method to get the value of the first die
    // the dice class has a method to get the value of the second die
    // the dice class has a method to check if the dice rolled doubles

    private int die1;
    private int die2;
    private int total;
    private boolean doubles;

    public Dice() {
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
        total = die1 + die2;
        if (die1 == die2) {
            doubles = true;
        } else {
            doubles = false;
        }
        //reroll if doubles
        if (doubles) {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            total = die1 + die2;
        }
        //reroll a max of two times
        if (doubles) {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            total = die1 + die2;
        }

        //go to jail if doubles rolled three times
        if (doubles) {
            //go to jail

        }


    }

    public int getTotal() {
        return total;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public boolean isDoubles() {
        return doubles;
    }


}
