package SimpleGameProject;

import javax.swing.*;
import java.awt.*;

public class HeroPlane extends Thread {
    // 换位置
    int x = 230 , y = 600 ;
    int width = 50 , height = 50 ;
    // 飞机移动的速度
    int speed = 10 ;

    // import image to this class
    Image img = new ImageIcon("img/b2.jpg/").getImage();

    // 定义方向的标志
    boolean up , down , left , right;
    public HeroPlane() {
    }
    //
    public HeroPlane(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void run() {
        while (true){
            if (up) {
                y -= speed;
            }
            if (down) {
                y += speed;
            }
            if (right) {
                x -= speed;
            }
            if (left) {
                x += speed;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
