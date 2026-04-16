
import java.util.PriorityQueue;
import javax.swing.JOptionPane;

class ex6_5
{
    public static void main(String[] args) 
    {
        int size = Integer.parseInt(JOptionPane.showInputDialog("enter size: "));

        PriorityQueue<Integer> myQ = new PriorityQueue<>(size);

        int input, sum = 0;
        for (int i = 0; i < size; i++)
        {
            input = Integer.parseInt(JOptionPane.showInputDialog("Enter value of element #" + (i + 1) + ": "));

            myQ.add(input);
            sum += input;
        }

        for (int i = 0; i < size; i++) System.out.println(myQ.poll());

        System.out.println(sum + ' ' + (sum/(float) size));

        System.exit(0);
    }
}