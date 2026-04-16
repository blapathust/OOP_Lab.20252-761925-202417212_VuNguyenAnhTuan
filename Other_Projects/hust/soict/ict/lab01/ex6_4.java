
import javax.swing.JOptionPane;

class ex6_4
{
    static int[]days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static String[] abb5 = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};
    static String[] abb3 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static String[] full = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

    static int parser(String input)
    {
        for (int i = 0; i < 12; i++)if (input.equalsIgnoreCase(nums[i]) || 
                                        input.equalsIgnoreCase(abb3[i]) || 
                                        input.equalsIgnoreCase(abb5[i]) || 
                                        input.equalsIgnoreCase(full[i])) 
            return i + 1;

        return 0;
    }


    static int days(int month, int year)
    {
        if (month != 2) return days[month - 1];

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) return 29;

        return 28;
    }

    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter a month: ");

        int month = parser(input);
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter a year: "));

        System.out.println(days(month, year));

        System.exit(0);
    }
}
