import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.io.*;
import java.awt.event.*;
public class StartFrame extends JFrame{
    private Container cp;
    // private JPanel jpnc=new JPanel();
    private JLabel jpnc=new JLabel();
    private JLabel jlbn=new JLabel();
    private JPanel jlbs=new JPanel(new GridLayout(1,2,100,500));
    private JButton start=new JButton("START");
    private JButton exit=new JButton("EXIT");
    private ImageIcon logo = new ImageIcon("LG-BG.png");
    private ImageIcon bg = new ImageIcon("BG.png");


    public StartFrame(){
        init();
    }


    public void init(){
        cp=this.getContentPane();
        cp.setBackground(new Color(0,0,0));
        jlbs.setBackground(new Color(0,0,0));
        
        // LOGO
        Image img=logo.getImage();
        Image newimg=img.getScaledInstance(1600,850,java.awt.Image.SCALE_SMOOTH);
        logo=new ImageIcon(newimg);
        jlbn.setIcon(logo);
        // BUTTON



        // ADD
        cp.setLayout(new BorderLayout());
        cp.add(jlbn,BorderLayout.NORTH);
        cp.add(jlbs,BorderLayout.SOUTH);
        jlbs.add(start);
        jlbs.add(exit);

        
        // Window
        this.setTitle("Run Out the Dungeon");
        this.setBounds(160,90,1600,900);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // funtions
        exit.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
         });
         start.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                DungeonFrame dg=new DungeonFrame();
                dg.setVisible(true);
                StartFrame.this.setVisible(false);
                StartFrame.this.dispose();
            }
         });

        
    }
    
}