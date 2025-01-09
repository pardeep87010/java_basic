import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import javax.swing.JFrame;

public class menu_and_submenu {
    public static void main(String[] args) {
        // Create a window
        JFrame frame = new JFrame("Menu and Submenu Example");
        frame.setSize(1000, 800);
        frame.setLayout(null);

        // Create a menu bar
        MenuBar menubar = new MenuBar();

        // Create menus
        Menu filemenu = new Menu("File");
        Menu editmenu = new Menu("Edit");

        // Create a submenu
        Menu open = new Menu("Open");
        MenuItem open_File = new MenuItem("Open File");
        MenuItem open_folder = new MenuItem("Open Folder");
        open.add(open_File); // Add items to the submenu
        open.add(open_folder);

        // Create other menu items
        MenuItem save = new MenuItem("Save");

        // Add menu items to the main menu
        filemenu.add(open); // Add the "Open" submenu
        filemenu.add(save);

        // Add menus to the menu bar
        menubar.add(filemenu);
        menubar.add(editmenu);

        // Set the menu bar for the frame
        frame.setMenuBar(menubar);

        // Finalize the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
