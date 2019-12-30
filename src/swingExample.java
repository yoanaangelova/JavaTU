import sun.awt.WindowClosingListener;

import  java.awt.event.*;
import javax.swing.*;
public class swingExample {
    public static void main(String[] args) {
        JFrame wd = new JFrame();
        wd.setSize(250,100);
        wd.setTitle("graphic window");
        wd.setVisible(true);
        wd.addWindowListener(new WndCls());
    }
    static class WndCls extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}

