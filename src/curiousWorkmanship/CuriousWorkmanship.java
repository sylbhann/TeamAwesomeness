package curiousWorkmanship;

import byui.cit260.curiousworkmanship.model.Player;

public class CuriousWorkmanship {
    
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Awesome Hero");
        playerOne.setHighScore(100.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
}
