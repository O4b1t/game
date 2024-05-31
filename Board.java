//create a board class that contains Tiles in arraylist
//the board class has a constructor that takes an arraylist of Tiles
//the board class has a method to get the tiles
//the board class has a method to set the tiles
//the board class has a method to get the tile at a specific index
//the board class has a method to get the size of the board
//the board class has a method to get the tile at a specific index
//the board class has a method to get the tile at a specific index

//I want to import a csv file that contains the position in the arraylist of each buyable property on the board with their respective names, costs, cost per house, rent fees for different numbers of houses, and mortgage fees

//I want to create a board object with the arraylist of tiles
//I want to print the board

//I want to create a main method that reads the csv file and creates a board object with the arraylist of tiles

import java.util.ArrayList;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class Board {
    private ArrayList<Tiles> tiles = new ArrayList<Tiles>();     
        
    public Board() {
        try {
            File file = new File("board.csv");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String name = parts[1];
                int cost = Integer.parseInt(parts[2]);
                int rentFee = Integer.parseInt(parts[4]);
                int mortgageFee = Integer.parseInt(parts[10]);
                
                tiles.add(new Property(name, cost, rentFee, mortgageFee));
            
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Tiles> getTiles() {
        return tiles;
    }
    public void setTiles(ArrayList<Tiles> tiles) {
        this.tiles = tiles;
    }
    public int getSize() {
        return tiles.size();
    }
    public Tiles getTile(int index) {
        return tiles.get(index);
    }
    public Tiles getTile(String name) {
        for (Tiles tile : tiles) {
            if (tile.getName().equals(name)) {
                return tile;
            }
        }
        return null;
    }
    
    //print the board with this current csv file
    public void printBoard() {
        for (Tiles tile : tiles) {
            System.out.println(tile.getName());
        }
    }
}


