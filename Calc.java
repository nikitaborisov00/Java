package calc;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Calc 
{
    public JFrame window = new JFrame("Calculator");    
    public JTextField imput = new JTextField();
 
    public Calc()//Settings main-window
    {
        window.setSize(280, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(new Color(240, 240, 240));
        window.setLayout(null);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        enter_area();
        month_button();
        window.setVisible(true);
    }
    private void enter_area()//Settings up-window
    {
        imput.setFont(new Font("Times New Roman", Font.BOLD, 20));
        imput.setBounds(10, 10, 248, 36);
        imput.setBackground(new Color(255, 255, 255));
        imput.setHorizontalAlignment(JTextField.LEFT);
        window.add(imput);
    }
    private void month_button()//Settings button
    {
        int num = 0;
        String arr[] = {"1","2","3","С","4","5","6","+","7","8","9","-","0",".","/","*","="};
        JButton[] jbutton_n = new JButton[arr.length];
       for (int e=0; e<5; e++)
        {
            for (int r=0; r<4; r++)
            {
                jbutton_n[num] = new JButton();
                jbutton_n[num].setFont(new Font("Impact", Font.PLAIN, 24));
                jbutton_n[num].setForeground(new Color(0, 0, 0));
                jbutton_n[num].setBackground(new Color(211, 211, 211));
                jbutton_n[num].setText(arr[num]);
                jbutton_n[num].setMargin(new Insets(0,0,0,0));
                if (num < arr.length - 1)
                {
                    jbutton_n[num].setBounds(10+r*62, 55+e*62, 60, 60);
                }
                else
                {
                    jbutton_n[num].setBounds(10+r*62, 55+e*62, 246, 60);
                }
                jbutton_n[num].setFocusable(true);
                window.add(jbutton_n[num]);
                ActionListener num_button = new GoNumListener();
                jbutton_n[num].addActionListener(num_button);
                if (num < arr.length - 1)
                {
                    num++;
                }
                else
                {
                    break;
                }
            }
        }
    }
    public class GoNumListener implements ActionListener//Listener
    {
        public void actionPerformed(ActionEvent e)
        {
            String name = ((JButton)e.getSource()).getText();
            if (name == "=" || name == "С")
            {
                //...
            }
            else
            {
                imput.setText(imput.getText()+name);
            }
            if (name == "=")
            {
                result();
            }
            if (name == "С")
            {
                imput.setText("");
            }
            
            window.repaint();
        }
    }
    private void result()
    {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        try
        {
            imput.setText("" + engine.eval(imput.getText()));
        } 
        catch (ScriptException e1)
        {
            
        }
    }
   public static void main(String[] args)
    {
        new Calc();
    }
}
