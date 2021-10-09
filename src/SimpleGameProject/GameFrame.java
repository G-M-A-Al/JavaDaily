package SimpleGameProject;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class GameFrame extends JFrame {


    HeroPlane heroPlane;
    Vector<Bullet> bullets = new Vector<>();
    Vector<EnemyPlane> enemys = new Vector<>();

    GameFrame frame;

    public GameFrame() {

        frame = this;
        // 创建英雄机
       heroPlane = new HeroPlane();
       heroPlane.start();


        this.setSize(500,760); // page size;
        this.setTitle("My First Game"); // page title;
        this.setResizable(false); // page resizable is can or not change size ;
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // page close / open type
        this.setLocationRelativeTo(null); // page design
        this.setVisible(true); // can or not see this page ;

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                {
                    repaint();
                    try{
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }) .start();

        new Thread(new Runnable() {
            // 创建随时及的对象
            Random r = new Random();

            @Override
            public void run() {
            while (true) {
                //添加敌机的时候。让x轴是随机的
                enemys.add(new EnemyPlane(frame,r.nextInt(500),0 ));

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            }
        }).start();
    }



    public void paint(Graphics g) {
       // System.out.println("Good");
        BufferedImage image = (BufferedImage) this.createImage(this.getSize().width,this.getSize().height);
        Graphics bi = image.getGraphics();

        bi.drawImage(new ImageIcon("img/G1.png").getImage(),0,0,null);
        bi.drawImage(heroPlane.img, heroPlane.x,heroPlane.y,heroPlane.width, heroPlane.height,null);

        for (int i = 0; i < bullets.size(); i++) {
            Bullet bullet = bullets.get(i);
            if (bullet.y > 0 )
                bi.drawImage(bullet.image, bullet.x,bullet.y -= bullet.speed,bullet.width, bullet.height,null);
            else
                bullets.remove(bullet);
        }


        for (int i = 0; i < enemys.size(); i++) {
            EnemyPlane enemy  = enemys.get(i);
            if (enemy.y < 760)
                bi.drawImage(enemy.img, enemy.x,enemy.y += enemy.speed,enemy.width, enemy.height,null);
            else
                bullets.remove(enemy);
        }


        g.drawImage(image, 0, 0,null);

    }

    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
        Player player = new Player(frame);
        frame.addKeyListener(player);


    }
}


