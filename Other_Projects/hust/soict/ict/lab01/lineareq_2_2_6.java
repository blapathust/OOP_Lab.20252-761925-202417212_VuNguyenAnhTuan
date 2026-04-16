import javax.swing.JOptionPane;

public class lineareq_2_2_6 {
    
    static void linear()
    {
        double a = Integer.parseInt(JOptionPane.showInputDialog("Enter a: "));
        double b = Integer.parseInt(JOptionPane.showInputDialog("Enter b: "));

        if (a == 0)
        {
            if (b == 0)
            {
                JOptionPane.showMessageDialog(null, "Inf solutions.");
            }
            else JOptionPane.showMessageDialog(null, "No solution.");

            return;
        }

        JOptionPane.showMessageDialog(null, "x = " + -1*b/a);
    }

    static void system()
    {
        double a11 = Integer.parseInt(JOptionPane.showInputDialog("Enter a11: "));
        double a12 = Integer.parseInt(JOptionPane.showInputDialog("Enter a12: "));
        double a21 = Integer.parseInt(JOptionPane.showInputDialog("Enter a21: "));
        double a22 = Integer.parseInt(JOptionPane.showInputDialog("Enter a22: "));
        double b1 = Integer.parseInt(JOptionPane.showInputDialog("Enter b1: "));
        double b2 = Integer.parseInt(JOptionPane.showInputDialog("Enter b2: "));

        double d = a11*a22 - a12*a21;
        double d1 = a11*b2 - a21*b1;
        double d2 = a12*b2 - a22*b1;

        if (d == 0)
        {
            if (d1 == 0 && d2 == 0) JOptionPane.showMessageDialog(null, "Inf solutions.");
            else JOptionPane.showMessageDialog(null, "No solutions.");

            return;
        }

        JOptionPane.showMessageDialog(null, "x = " + d1/d + "; y = " + d2/d);
    }

    static void quadratic()
    {
        double a = Integer.parseInt(JOptionPane.showInputDialog("Enter a: "));
        double b = Integer.parseInt(JOptionPane.showInputDialog("Enter b: "));
        double c = Integer.parseInt(JOptionPane.showInputDialog("Enter c: "));

        double delta = b*b - 4*a*c;

        if (delta < 0) JOptionPane.showMessageDialog(null, "No solution.");
        else if (delta == 0) JOptionPane.showMessageDialog(null, "x = " + -1*b/(2*a));
        else JOptionPane.showMessageDialog(null, "x1 = " + (-1*b + Math.sqrt(delta))/(2*a) + "; x2 = " + (-1*b - Math.sqrt(delta))/(2*a));
    }

    public static void main(String[] args) {
        
        String[] options = {"Linear", "System of 2 linear equations", "Quadratic"};

        int num = JOptionPane.showOptionDialog(null, "Select the type of equation to be solved:", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);

        if (num == 0) linear();
        if (num == 1) system();
        if (num == 2) quadratic();

        System.exit(0);
    }
}
