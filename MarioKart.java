public class MarioKart {
    public static void main(String[] args) {
        // Instantiate two MarioKartPlayer objects with different names, characters, and starting speeds
        MarioKartPlayer player1 = new MarioKartPlayer("Player 1", "Mario", 50);
        MarioKartPlayer player2 = new MarioKartPlayer("Player 2", "Luigi", 45);

        // Display the information of both players
        System.out.println("Player 1 Information:");
        player1.displayInfo();
        System.out.println("Player 2 Information:");
        player2.displayInfo();

        // Simulate a boost action for each player
        player1.boost();
        player2.boost();

        // Display the updated information of both players after the boost
        System.out.println("\nPlayer 1 Information after Boost:");
        player1.displayInfo();
        System.out.println("Player 2 Information after Boost:");
        player2.displayInfo();
    }
}

class MarioKartPlayer {
    // Attributes
    private String playerName;
    private String character;
    private int speed;

    // Constructor
    public MarioKartPlayer(String playerName, String character, int speed) {
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }

    // Method to simulate boosting, increasing the player's speed
    public void boost() {
        // Simulate boosting by increasing speed
        speed += 10;
        System.out.println(playerName + " boosted!");
    }

    // Method to display the player's information
    public void displayInfo() {
        System.out.println("Name: " + playerName);
        System.out.println("Character: " + character);
        System.out.println("Speed: " + speed);
    }
}
