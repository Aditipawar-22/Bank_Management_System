package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    String formno;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    TextField textPan,textAdh;
    JRadioButton r1,r2,r3,r4;
    JButton next;
    public Signup2(String formno){

        super("APPLICATION FORM :");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(90,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(130,0,100,100);
        add(image);

        this.formno = formno;

        JLabel label1 = new JLabel("Page 2 :");
        label1.setFont(new Font("Raleway",Font.BOLD,25));
        label1.setBounds(330,5,600,30);
        add(label1);

        JLabel label2 = new JLabel("Additional Details ");
        label2.setFont(new Font("Raleway",Font.BOLD,30));
        label2.setBounds(330,65,600,30);
        add(label2);

        JLabel labelR = new JLabel("Religion :");
        labelR.setFont(new Font("Raleway",Font.BOLD,20));
        labelR.setBounds(110,120,600,30);
        add(labelR);

        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);



        JLabel labelC = new JLabel("Category :");
        labelC.setFont(new Font("Raleway",Font.BOLD,20));
        labelC.setBounds(110,170,100,30);
        add(labelC);

        String category[] = {"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel labelIncome = new JLabel("Income :");
        labelIncome.setFont(new Font("Raleway",Font.BOLD,20));
        labelIncome.setBounds(110,220,100,30);
        add(labelIncome);

        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000,Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel labelEdu = new JLabel("Educational :");
        labelEdu.setFont(new Font("Raleway",Font.BOLD,20));
        labelEdu.setBounds(110,270,150,30);
        add(labelEdu);

        String education[] = {"Non-Graduate","Graduate","post-Graduate","PHD","Other"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel labelOcc = new JLabel("Occupation :");
        labelOcc.setFont(new Font("Raleway",Font.BOLD,20));
        labelOcc.setBounds(110,320,150,30);
        add(labelOcc);

        String occupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);


        JLabel labelPan = new JLabel("PAN Number :");
        labelPan.setFont(new Font("Raleway",Font.BOLD,20));
        labelPan.setBounds(110,370,150,30);
        add(labelPan);

        textPan = new TextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,14));
        textPan.setBounds(350,370,400,30);
        add(textPan);

        JLabel labelAdh = new JLabel("Aadhar Number :");
        labelAdh.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdh.setBounds(110,420,180,30);
        add(labelAdh);

        textAdh = new TextField();
        textAdh.setFont(new Font("Raleway",Font.BOLD,14));
        textAdh.setBounds(350,420,400,30);
        add(textAdh);

        JLabel labelSen = new JLabel("Senior Citizen :");
        labelSen.setFont(new Font("Raleway",Font.BOLD,20));
        labelSen.setBounds(110,470,600,30);
        add(labelSen);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(350,470,80,30);
        r1.setForeground(Color.BLACK);
        r1.setBackground(new Color(252, 208, 76));
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(440,470,100,30);
        r1.setForeground(Color.BLACK);
        r2.setBackground(new Color(252, 208, 76));
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEx = new JLabel("Existing Account :");
        labelEx.setFont(new Font("Raleway",Font.BOLD,20));
        labelEx.setBounds(110,520,600,30);
        add(labelEx);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(350,520,80,30);
        r3.setForeground(Color.BLACK);
        r3.setBackground(new Color(252, 208, 76));
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(440,520,100,30);
        r4.setForeground(Color.BLACK);
        r4.setBackground(new Color(252, 208, 76));
        add(r4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(650,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,12));
        l13.setBounds(730,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,20));
        next.setBounds(580,600,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(252, 208, 76));
        setLayout(null);
        setSize(800,850);
        setVisible(true);
        setLocation(450,30);



    }
    @Override

    public void actionPerformed(ActionEvent e){

           String rel =(String)comboBox.getSelectedItem();
           String cate = (String)comboBox2.getSelectedItem();
           String inc = (String)comboBox3.getSelectedItem();
           String edu = (String)comboBox4.getSelectedItem();
           String occ = (String)comboBox5.getSelectedItem();
           String pan_no = textPan.getText();
           String adhar_no = textAdh.getText();

           String senior_citizen = null;
           if (r1.isSelected()){
               senior_citizen = "Yes";
           }
           else if(r2.isSelected()){
               senior_citizen = "No";
           }
           String ex_Acc = null;
           if (r3.isSelected()){
               ex_Acc = "Yes";
           }
           else if(r4.isSelected()){
               ex_Acc = "No";
           }

           try {
               if(textPan.getText().equals("") || textAdh.getText().equals("")) {
                   JOptionPane.showMessageDialog(null,"Fill all the fields");
               }
               else {
                   Conn con1 = new Conn();
                   String q = "insert into signup2 values('" + formno+ "','" + rel+ "','" + cate + "','" + inc + "','" + edu + "','" + occ+ "','" + pan_no+ "', '" + adhar_no+ "', '" + senior_citizen + "','" + ex_Acc+"')";
                   con1.statement.executeUpdate(q);
                   new Signup3(formno);
                   setVisible(false);
               }




           }
           catch (Exception ex){
               ex.printStackTrace();
           }






    }

    public static void main(String args[]){
        new Signup2("");
    }
}

