import javax.swing.*;

// frame - Jframe(text window), frame.setsize(300,400), frame.setdefaultcloseOperation(Jframe.EXIT_ON_CLOSE)
// lable - Jlable(hello), lable.setbound(50,50,100,30)
// Text Fields - JtextFields(enter your name), textfields.setBound(50,100,100,30)
// Button - Jbutton(click), button.setBound(50,150,100,30)
// combobox - String[] options = {"option 1","option 2"}
//            Jcombo1Box<string> CB = new JcomboBox<>(options);
//            CB.setBound(50,50,200,30)
// CheckBox - JcheckBox CHB1 = new JcheckBox("option 1")
//            JcheckBox CHB2 = new JcheckBox("option 1")
//            CHB1.setBound(), CHB2.setBound()
// RadioButton - JRadioButton rb1 = new JRadioButton("Male");
//               JRadioButton rb2 = new JRadioButton("female");
//               ButtonGroup bg = new ButtonGroup()
//               bg.add(rb1) , bg.add(rb2)
// optionpane - "message dialog" = JOptionPane.showMessageDialog(null ,"hey" + name)
//              "input dialog" = String name = JoptionPane.showInputDialog("enter your name ")
//              "confrm dialog" = int option = JoptionPane.showConfirmDialog(null,"do you want to confrim !")

                 
public class GUI_programing {
    public static void main(String[] args) {

        // create a frame or window 
        JFrame frame = new JFrame("text window");
        frame.setSize(1000,1200);
        frame.setLayout(null);
        
        // lable 
        JLabel lable = new JLabel("welcome");
        lable.setBounds(50,50,150,50);
        frame.add(lable);
        
        // TextField
        JTextField textField = new JTextField("enter your name ");
        textField.setBounds(50,100,100,50);
        frame.add(textField);

        // Button
        JButton button = new JButton("submit");
        button.setBounds(50,50,150,50);
        frame.add(button);
        
        // ComboBox
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setBounds(50, 50, 200, 30);
        frame.add(comboBox);
        
        // checkbox 
        JCheckBox cb1 = new JCheckBox("option 1");
        JCheckBox cb2 = new JCheckBox("option 2");
        cb1.setBounds(50, 50, 250, 30);
        cb2.setBounds(50, 50, 300, 30);
        frame.add(cb1);
        frame.add(cb2);
        
        // radiobutton 
        JRadioButton rb1 = new JRadioButton("male");
        JRadioButton rb2 = new JRadioButton("female");
        rb1.setBounds(50, 300, 500, 30);
        rb2.setBounds(50, 350, 550, 30);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        frame.add(rb1);
        frame.add(rb2);

        // optionpane 
        // MessageDigest
        JOptionPane.showMessageDialog(null, "wecome");
        // showInputDialog
        String name = JOptionPane.showInputDialog("enter you name");
        // confirmationdialog 
        int option = JOptionPane.showConfirmDialog(null,"do you want to confrim " +name );
        if(option == JOptionPane.YES_OPTION){
            System.out.print("you chose yes");
        }
        else if (option == JOptionPane.NO_OPTION){
            System.out.print("you chose no");
        }
        else{
            System.out.print("you chose cancel");
        }




        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
