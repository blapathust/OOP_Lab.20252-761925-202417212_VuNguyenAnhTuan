
import javax.swing.JOptionPane;

public class ex6_1 {
    
    public static void main(String[] args) {
        
        int option = JOptionPane.showConfirmDialog(null, "Do you want to upgrade to 1st class?");

        JOptionPane.showMessageDialog(null, "You chose: " + (option ==JOptionPane.YES_OPTION ? "Yes" : "No"));

        System.exit(0);
    }
}
