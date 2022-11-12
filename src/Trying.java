import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Trying implements ActionListener {
    JFrame myframe;
    JButton B;
    JTextArea area;
    Trying(){
        myframe = new JFrame("First Session");
        area = new JTextArea("Let'Live the life");
        area.setBounds(50,50,300,300);
        //Creating the button
        B = new JButton("Submit");
        B.setBounds(100,100,100,50);
        B.addActionListener(this);
        myframe.add(B);
        myframe.add(area);
        myframe.getContentPane().setBackground(Color.BLACK);
        myframe.setSize(500,300);
        area.setBackground(Color.cyan);
        myframe.setLayout(null);
        myframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myframe.setVisible(true);
    }

    public static void main(String[] args) {
        Trying Y = new Trying();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        area.setText("Function working");
    }
}
