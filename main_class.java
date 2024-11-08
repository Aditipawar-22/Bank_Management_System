package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;

    main_class(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,28));
        l3.add(label);

        b1 = new JButton("DEPOSITE");
        b1.setForeground(Color.WHITE);
        b1.setBounds(410,270,150,35);
        b1.setBackground(new Color(65,125,120));
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAWL");
        b2.setForeground(Color.WHITE);
        b2.setBounds(700,270,150,35);
        b2.setBackground(new Color(65,125,120));
        b2.addActionListener(this);
        l3.add(b2);

        b4 = new JButton("BALANCE ENQUIRY");
        b4.setForeground(Color.WHITE);
        b4.setBounds(700,318,150,35);
        b4.setBackground(new Color(65,125,120));
        b4.addActionListener(this);
        l3.add(b4);

        b3 = new JButton("FAST CASH");
        b3.setForeground(Color.WHITE);
        b3.setBounds(410,318,150,35);
        b3.setBackground(new Color(65,125,120));
        b3.addActionListener(this);
        l3.add(b3);

        b5 = new JButton("PIN");
        b5.setForeground(Color.WHITE);
        b5.setBounds(410,365,150,35);
        b5.setBackground(new Color(65,125,120));
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("EXIT");
        b6.setForeground(Color.WHITE);
        b6.setBounds(700,365,150,35);
        b6.setBackground(new Color(65,125,120));
        b6.addActionListener(this);
        l3.add(b6);




        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public  void actionPerformed(ActionEvent e){

        if(e.getSource()==b1){
            new Deposite(pin);
            setVisible(false);
        }

        else if(e.getSource()==b2){
            new CashWithdrawl(pin);
            setVisible(false);
        }
        else if (e.getSource()==b3) {
            new FastCash(pin);
            setVisible(false);
        }
        else if (e.getSource()==b4) {
            new BalanceEnquiry(pin);
            setVisible(false);
        }
        else if (e.getSource()==b5) {
            new Pin(pin);
            setVisible(false);
        }
        else if (e.getSource()==b6) {
            System.exit(0);
            setVisible(false);
        }


    }


    public static void main(String[] args){
        new main_class("");
    }
}
