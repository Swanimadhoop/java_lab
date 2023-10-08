/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author swani
 */
public class Calculator extends JFrame {
    
    JPanel myPanel;
    JButton addBtn, subBtn, equalBtn, clearBtn, multBtn, divBtn;
    JTextField textField1;

    double num1, num2, result;
    char operator;
    
    public Calculator(){
        this.setSize(300, 300);
        this.setLocation(900, 500);

        textField1 = new JTextField();
        
        addBtn = new JButton("+");
        subBtn = new JButton("-");
        equalBtn = new JButton("=");
        multBtn= new JButton("*");
        divBtn= new JButton("/");
        clearBtn = new JButton("Clear");
        
        myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(2, 2, 10, 10));
        myPanel.add(addBtn);
        myPanel.add(subBtn);
        myPanel.add(multBtn);
        myPanel.add(divBtn);
        myPanel.add(equalBtn);
        myPanel.add(clearBtn);
        
        this.add(textField1, BorderLayout.NORTH);
        this.add(myPanel, BorderLayout.CENTER);
        
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
                operator = '+';
                textField1.setText("");
            }
        });

        subBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
                operator = '-';
                textField1.setText("");
            }
        });
        multBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
                operator = '*';
                textField1.setText("");
            }
        });
        divBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
                operator = '/';
                textField1.setText("");
            }
            
            
        });

        equalBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(textField1.getText());
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result=num1-num2;
                        break;
                    case '*':
                        result=num1*num2;
                        break;
                    case '/':
                        result=num1/num2;
                        break;
                    
                }

                textField1.setText(String.valueOf(result));
            }
        });

        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
