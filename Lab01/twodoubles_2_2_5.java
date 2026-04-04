import javax.swing.JOptionPane;

public class twodoubles_2_2_5
{
    public static void main(String args[])
    {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("input num 1:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("input num 2:"));

        String quotient1, quotient2;

        if (num2 == 0) quotient1 = "NULL";
        else quotient1 = Double.toString(num1 / num2);

        if (num1 == 0) quotient2 = "NULL";
        else quotient2 = Double.toString(num2 / num1);

        JOptionPane.showMessageDialog(null, "Difference: " + Math.abs(num1 - num2) + "\nSum: " + (num1 + num2) + "\nProduct: " + (num1*num2) + "\nnum1/num2 = " + quotient1 + "\nnum2/num1 = " + quotient2);
}
}