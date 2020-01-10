
package multiplicationtable;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MultiplicationTable extends JFrame {

        private Container c;
        private JLabel banner, label;
        private JTextArea area;
        private JButton button;
        private ImageIcon banner1,icon;
        private Font f;
        private JTextField field;
        private JScrollPane scroll;
        private Cursor cursor;
       
        
         MultiplicationTable()
         {
             //Create Container
             c = this.getContentPane();
             c.setLayout(null);
             c.setBackground(Color.DARK_GRAY);
             
             //Add JFrame Icon
             icon = new ImageIcon(getClass().getResource("Icon.png"));
             this.setIconImage(icon.getImage());
             
             
             //Crea font Style
             f = new Font("Arial", Font.BOLD , 21);
             cursor = new  Cursor(Cursor.HAND_CURSOR);
             
             banner1 = new ImageIcon(getClass().getResource("Multiplication.jpg"));
             
             
             ///Banner Add coding
             banner = new JLabel(banner1);
             banner.setBounds(5,10,340,200);
             c.add(banner);
             
             //Enter Any number Label Coding
             
             label = new JLabel(" Enter Any Number ");
             label.setBounds(10,230,200,50);
             label.setFont(f);
             label.setOpaque(true);
             label.setForeground(Color.BLUE);
             label.setBackground(Color.LIGHT_GRAY);
             c.add(label);
             

             //JTextField Coding.
                         
             field = new JTextField();
             field.setBounds(220,230,120,50);
             field.setFont(f);
             field.setForeground(Color.BLUE);
             c.add(field);
             
             
             //Add JButton coding
             
             button = new JButton("Clear");
             button.setBounds(220,295,120,50);
             button.setFont(f);
             button.setCursor(cursor);
             button.setBackground(Color.LIGHT_GRAY);
             button.setForeground(Color.BLUE);
             c.add(button);
             
             //Add JText Area
             
             area = new JTextArea();
             area.setFont(f);
             area.setLineWrap(true);
             area.setWrapStyleWord(true);
             area.setFont(f);
             area.setForeground(Color.BLUE);
             
             //Add scroll Bar
             scroll = new JScrollPane(area);
             scroll.setBounds(10,355,330,300);
             c.add(scroll);
             
             
             field.addActionListener(new ActionListener(){
             
             public void actionPerformed(ActionEvent e)
             {
                                  
                 area.setText("");
                 String s = field.getText();
                 
                 if(s.isEmpty())
                 {
                     JOptionPane.showMessageDialog(null,"Please Enter Any Number!", "ERROR", JOptionPane.ERROR_MESSAGE);
                 }
                 else
                 {
                    int number = Integer.parseInt(field.getText());
                    int i;
                 
                    for(i=1; i<=10; i++)
                    {
                        int result = number * i;
                    
                        String r = String.valueOf(result);
                        String increment = String.valueOf(i);
                        String num = String.valueOf(number);
                     
                        area.append(num+"  X  "+increment+"  =  "+r+"\n");
                    }
                  
                 }
                 
             }
                         
             });
             
             
            button.addActionListener(new ActionListener(){
             
             public void actionPerformed(ActionEvent e)
             {
                 area.setText("");
                 field.setText("");
             }
                         
             }); 
             
             
         }
    
    
    public static void main(String[] args) {
       
        MultiplicationTable table = new MultiplicationTable();
        
        table.setVisible(true);
        table.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        table.setBounds(300,20,355,695);
        table.setTitle("Multiplication Table");
        table.setResizable(false);
    }
    
}
