
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class GamePanel extends JPanel {

    final int originalTileSize = 16; // 16X16 tile
    final int scale = 3;

    final int titleSize = originalTileSize + scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = titleSize + maxScreenCol;
    final int screenHight = titleSize + maxScreenRow;

    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);

    }
}
