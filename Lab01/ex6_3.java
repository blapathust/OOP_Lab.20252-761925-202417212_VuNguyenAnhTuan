import javax.swing.JOptionPane;

class ex6_3
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog("enter n:"));

        int curr = 1, space = 0;
        for (int i = 0; i < n; i++) space += 2;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < space / 2; j++) System.out.print(' ');
            for (int j = 0; j < curr; j++) System.out.print('*');
            for (int j = 0; j < space / 2; j++) System.out.print(' ');

            curr += 2;
            space -= 2;

            System.out.println();
        }

        System.exit(0);
    }
}
