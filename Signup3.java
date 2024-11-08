package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JButton submit,cancel;
    String formno;
    JCheckBox m1,m2,m3,m4,m5,m6,m7;
    public Signup3(String formno){

        this.formno = formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(90,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(130,0,100,100);
        add(image);

        JLabel label1 = new JLabel("Page 3:");
        label1.setFont(new Font("Raleway",Font.BOLD,25));
        label1.setBounds(290,5,600,30);
        add(label1);

        JLabel label2 = new JLabel("Account Details ");
        label2.setFont(new Font("Raleway",Font.BOLD,30));
        label2.setBounds(290,50,600,30);
        add(label2);

        JLabel labelacc = new JLabel("Account Type :");
        labelacc.setBounds(100,120,600,30);
        labelacc.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelacc);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100,150,250,30);
        r1.setForeground(Color.BLACK);
        r1.setBackground(new Color(108, 180, 200));
        add(r1);

        r2 = new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(100,190,250,30);
        r2.setForeground(Color.BLACK);
        r2.setBackground(new Color(108, 180, 200));
        add(r2);

        r3 = new JRadioButton("Fixed Deposite Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(350,150,250,30);
        r3.setForeground(Color.BLACK);
        r3.setBackground(new Color(108, 180, 200));
        add(r3);

        r4 = new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(350,190,250,30);
        r4.setForeground(Color.BLACK);
        r4.setBackground(new Color(108, 180, 200));
        add(r4);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(r1);
        group1.add(r2);
        group1.add(r3);
        group1.add(r4);

        JLabel label = new JLabel("Card Number :");
        label.setFont(new Font("Raleway",Font.BOLD,20));
        label.setBounds(100,270,250,30);
        add(label);

        JLabel lc = new JLabel("XXXX-XXXX-XXXX-4184");
        lc.setFont(new Font("Raleway",Font.BOLD,20));
        lc.setBounds(350,270,250,30);
        add(lc);

        JLabel l1 = new JLabel("(Your 16-digit Card Number)");
        l1.setFont(new Font("Raleway",Font.BOLD,12));
        l1.setBounds(100,290,600,30);
        add(l1);

        JLabel ln = new JLabel("It would appear on a ATM Card Cheque Book and Statements");
        ln.setFont(new Font("Raleway",Font.BOLD,12));
        ln.setBounds(350,290,600,30);
        add(ln);

        JLabel l2 = new JLabel("PIN :");
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        l2.setBounds(100,350,250,30);
        add(l2);

        JLabel lp = new JLabel("XXXX");
        lp.setFont(new Font("Raleway",Font.BOLD,20));
        lp.setBounds(350,350,250,30);
        add(lp);

        JLabel l3 = new JLabel("( 4-digit password)");
        l3.setFont(new Font("Raleway",Font.BOLD,12));
        l3.setBounds(100,370,600,30);
        add(l3);

        JLabel l4 = new JLabel("Services Required :");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(100,420,600,30);
        add(l4);

        m1 = new JCheckBox("ATM CARD");
        m1.setFont(new Font("Raleway",Font.BOLD,16));
        m1.setBackground(new Color(108, 180, 200));
        m1.setBounds(100,460,150,30);
        add(m1);

        m2 = new JCheckBox("Mobile Banking");
        m2.setFont(new Font("Raleway",Font.BOLD,16));
        m2.setBackground(new Color(108, 180, 200));
        m2.setBounds(100,500,150,30);
        add(m2);

        m3 = new JCheckBox("Cheque Book");
        m3.setFont(new Font("Raleway",Font.BOLD,16));
        m3.setBackground(new Color(108, 180, 200));
        m3.setBounds(100,540,150,30);
        add(m3);

        m4 = new JCheckBox("Internet Banking");
        m4.setFont(new Font("Raleway",Font.BOLD,16));
        m4.setBackground(new Color(108, 180, 200));
        m4.setBounds(350,460,300,30);
        add(m4);

        m5 = new JCheckBox("EMAIL Alerts");
        m5.setFont(new Font("Raleway",Font.BOLD,16));
        m5.setBackground(new Color(108, 180, 200));
        m5.setBounds(350,500,300,30);
        add(m5);

        m6 = new JCheckBox(" E-Statement");
        m6.setFont(new Font("Raleway",Font.BOLD,16));
        m6.setBackground(new Color(108, 180, 200));
        m6.setBounds(350,540,300,30);
        add(m6);

        m7 = new JCheckBox("I hereby declares that the above entered details correct to the best of any knowledge.");
        m7.setFont(new Font("Raleway",Font.BOLD,11));
        m7.setBackground(new Color(108, 180, 200));
        m7.setBounds(100,580,600,30);
        add(m7);



        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD,16));
        submit.setBackground(Color.BLACK);
        submit.setBounds(150,620,100,30);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD,16));
        cancel.setBackground(Color.BLACK);
        cancel.setBounds(350,620,100,30);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);

        JLabel l13 = new JLabel("Form No :");
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(650,10,120,30);
        add(l13);

        JLabel lf = new JLabel(formno);
        lf.setFont(new Font("Raleway", Font.BOLD,12));
        lf.setBounds(710,10,60,30);
        add(lf);

        getContentPane().setBackground(new Color(108, 180, 200));
        setLayout(null);
        setSize(800,850);
        setVisible(true);
        setLocation(450,30);

    }
    @Override

    public void actionPerformed(ActionEvent e){
        String atype = null;

        if(r1.isSelected()){
            atype="Saving Account";
        }
        else if (r2.isSelected()) {
            atype="Current Account";
        }
        else if (r3.isSelected()) {
            atype="Fixed Deposite Account";
        }
        else if (r4.isSelected()) {
            atype="Recurring Deposite Account";
        }

        Random ran = new Random();
        long first_7 = (ran.nextLong()%90000000L)+1409963000000000L;
        String card_no = ""+Math.abs(first_7);

        long first_3 = (ran.nextLong()%9000L)+3000L;
        String pin = ""+Math.abs(first_3);

        String fac = "";
        if(m1.isSelected()){
            fac = "ATM CARD";
        }
        else if (m2.isSelected()) {
            fac = "Mobile Banking";
        }
        else if (m3.isSelected()) {
            fac = "Cheque Book";

        }
        else if (m4.isSelected()) {
            fac = "Internet Banking";
        }
        else if (m5.isSelected()) {
            fac = "EMAIL Alerts";
        }
        else if (m6.isSelected()) {
            fac = "E-Statement";
        }

        try {
            if(e.getSource()==submit) {
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }
                else {

                        Conn con1 = new Conn();
                        String q = "insert into signup3 values('" + formno+ "','" + atype+ "','" + card_no + "','" + pin+ "','" + fac+ "')";
                        String q2 = "insert into login values('"+formno +"','"+card_no+"','"+pin+"')";
                        con1.statement.executeUpdate(q);
                        con1.statement.executeUpdate(q2);
                        JOptionPane.showMessageDialog(null,"Card Number :"+card_no+"\npin :"+pin);
                        new Deposite(pin);
                        setVisible(false);

                }
            } else if (e.getSource()==cancel) {
                System.exit(0);
            }


        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public static void main(String[] args){

        new Signup3("");
    }
}
