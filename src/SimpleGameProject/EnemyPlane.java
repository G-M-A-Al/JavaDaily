package SimpleGameProject;

import javax.swing.*;
import java.awt.*;

public class EnemyPlane {

    public GameFrame gf;

    public  int x,y;
    public  int width = 50;
    public  int height = 50 ;
    public  int speed = 2;

    public Image img = new ImageIcon("img/G4.jpg").getImage();

    public EnemyPlane(GameFrame gf, int x, int y) {
        super();
        this.gf = gf;
        this.x = x;
        this.y = y;
    }


    public EnemyPlane(GameFrame gf, int x, int y, int width, int height, int speed) {
        super();
        this.gf = gf;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }


}
