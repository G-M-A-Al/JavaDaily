package SimpleGameProject;

import javax.swing.*;
import java.awt.*;

public class EnemyPlane extends Thread  {

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

    @Override
    public void run() {
        while (true) {
            // 向左走

            // 碰撞到了
            if (hit()) {
                this.speed = 0;
                this.img = new ImageIcon("img/G5.png").getImage();

                try {
                    this.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gf.enemys.remove(this);
                break;
            }
            if (this.y >= 760) {
                break;
            }

            try {
                this.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public  boolean hit () {
        Rectangle myRect = new Rectangle(this.x, this.y , this.width, this.height);
        Rectangle rect = null;

        for (int i = 0; i < gf.bullets.size(); i++) {
            Bullet bullet = gf.bullets.get(i);
            System.out.println("test hit ");
            rect = new  Rectangle(bullet.x, bullet.y -1 ,bullet.width, bullet.height );
            if (myRect.intersects(rect)) {
                return true;
            }

        }
        return false;
    }


}
