import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class mouse_event {
    public static void main(String[] args) {
        // window 
        JFrame frame = new JFrame("text window");
        frame.setSize(1000,1200);
        frame.setLayout(null);

        // button 
        JButton button = new JButton("submit");
        button.setBounds(50,50,150,50);
        frame.add(button);

        frame.addMouseListener(new MouseAdapter(){
            public void MouseClicked(MouseEvent e){
                // lable.setText("x: " + e.getX() + ", y: " + e.getY());
                System.out.println("x: " + e.getX() + ", y: " + e.getY());
                }
            });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
