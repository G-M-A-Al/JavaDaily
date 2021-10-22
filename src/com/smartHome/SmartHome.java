package com.smartHome;

import javax.swing.*;

      /*
      * smart home project(for more open ..... )
      * */

public class SmartHome extends JFrame {

    SmartHome smartHome;
    public SmartHome(){
        final SmartHome smartHome = this.smartHome;

        this.setSize(800,450);
        this.setTitle("SmartHomeProject");
        this.setResizable(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // page close / open type
        this.setLocationRelativeTo(null); // page design
        this.setVisible(true);



    }

    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome();
        JFtext jf = new JFtext();
    }
}
