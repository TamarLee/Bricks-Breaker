
import javax.swing.*;

public class BrickBreaker {
    public static void main(String[] args) {
        Game game = new Game();
        JFrame window = new JFrame("Brick Breaker by T.Mekhri");
        window.setBounds(10, 10, 700, 600);
        window.setResizable(false);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(game);
    }
}
