package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class CashWithdrawl extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1,b2;

    public CashWithdrawl(String pin){

        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("MAXIMUM WITHDRWAL IS 10,000 :");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,180,400,30);
        l3.add(label1);

        JLabel label2 = new JLabel("Please Enter Your Amount :");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(460,220,400,30);
        l3.add(label2);

        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,260,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);

        b1 = new JButton("WITHDRAW");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);



        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {


            try {
                String amnt = textField.getText();
                Date date = new Date();

                if (e.getSource() == b1) {
                    if (textField.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Please enter valid amount");
                    } else {
                        Conn c1 = new Conn();
                        ResultSet resultSet = c1.statement.executeQuery("select * from bank where pin_no = '" + pin + "'");
                        int balance = 0;
                        while (resultSet.next()) {
                            if (resultSet.getString("type").equals("Deposite")) {
                                balance += Integer.parseInt(resultSet.getString("amount"));
                            } else {
                                balance = balance - Integer.parseInt(resultSet.getString("amount"));

                            }
                        }
                        if (balance < Integer.parseInt(amnt)) {
                            JOptionPane.showMessageDialog(null, "Insufficient Balance");
                            return;
                        }
                        c1.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Withdrawl','" + amnt + "')");
                        JOptionPane.showMessageDialog(null, "Debited Successfully");
                        setVisible(false);
                        new main_class(pin);

                    }
                } else if (e.getSource() == b2) {
                    setVisible(false);
                    new main_class(pin);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if (e.getSource()==b2) {
            setVisible(false);
            new main_class(pin);
        }
    }



    public static void main(String args[]){

        new CashWithdrawl("");


    }
}
