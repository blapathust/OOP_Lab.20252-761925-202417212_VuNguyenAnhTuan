import javax.swing.JOptionPane;

public class show2nums_2_2_4
{
    public static void main(String[] args) {
        
        String str1, str2, noti = "You've just entered ";

        str1 = JOptionPane.showInputDialog("Input num 1:");
        str2 = JOptionPane.showInputDialog("Input num 2:");

        noti += str1 + " and " + str2;

        JOptionPane.showMessageDialog(null, noti);
    }
}