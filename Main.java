import java.util.ArrayList;
import java.util.Iterator;

class Main {

    public static void main(String[] args) {

        // create a board object with the arraylist of tiles, initialize 4 players, and
        // start the game
        Board board = new Board();

        ArrayList<Player> players = new ArrayList<>();
        boolean gameOn = true;
        players.add(new Player("Player 1", "aggressive", 1500));
        players.add(new Player("Player 2", "defensive", 1500));
        players.add(new Player("Player 3", "random", 1500));
        players.add(new Player("Player 4", "random", 1500));

        while (gameOn) {
            Iterator<Player> iterator = players.iterator();
            while (iterator.hasNext()) {
                Player player = iterator.next();

                if (player.getPosition() + 1 > 40) {
                    player.setMoney(player.getMoney() + 200);
                    System.out.println(player.getName() + " passed Go and collected $200.");
                }
                Dice dice = new Dice();

                player.move(dice.roll());

                if (board.getTile(player.getPosition()) instanceof Property) {
                    Property property = (Property) board.getTile(player.getPosition());
                    if (player.getMoney() >= property.getCost() && property.getOwner() == null) {
                        player.addProperty(property);
                        player.setMoney(player.getMoney() - property.getCost());
                        property.setOwner(player);
                        System.out.println(
                                player.getName() + " bought " + property.getName() + " for $" + property.getCost());
                    }
                }

                if (board.getTile(player.getPosition()) instanceof Property) {
                    Property property = (Property) board.getTile(player.getPosition());
                    if (property.getOwner() != null && property.getOwner() != player) {
                        player.setMoney(player.getMoney() - property.getRentFee());
                        property.getOwner().setMoney(property.getOwner().getMoney() + property.getRentFee());
                        System.out.println(player.getName() + " paid " + property.getOwner().getName() + " $"
                                + property.getRentFee() + " in rent.");
                    }
                }

                // print out each move
                System.out.println(player.getName() + " rolled a " + dice.getDie1() + " and a " + dice.getDie2()
                        + " for a total of " + dice.getTotal());
                System.out.println(player.getName() + " landed on " + board.getTile(player.getPosition()).getName());
                System.out.println(player.getName() + " has $" + player.getMoney());
                System.out.println();

                // if player has no money, print out that they are bankrupt and remove them from
                // the game but continue the game

                if (player.getMoney() <= 0) {
                    System.out.println(player.getName() + " is bankrupt and has been removed from the game.");
                    iterator.remove(); // Safely remove the player

                    // print all the money of the players
                    for (Player p : players) {
                        System.out.println(p.getName() + " has $" + p.getMoney());
                    }

                    if (players.size() == 1) {
                        System.out.println(players.get(0).getName() + " is the winner!");
                        gameOn = false;
                        break;
                    }
                }

            }
        }

    }
}