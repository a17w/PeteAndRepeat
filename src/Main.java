import javax.swing.JOptionPane;

public class Main
{

    public static void main(String[] args)
    {
        scores show = new scores();
        show.loadScores();
        show.displayScores();
    }
}


class scores
{
    int total;

    int teamScores[] = new int[10];

    void loadScores()
    {
        int option = JOptionPane.YES_OPTION;
        int n = 0;

        while(option == JOptionPane.YES_OPTION && n < teamScores.length)
        {
            String dataString = JOptionPane.showInputDialog("Enter score for player: ");
            int data = Integer.parseInt(dataString);

            teamScores[n] = data;

            if(n < teamScores.length -1)
            {
                option = JOptionPane.showConfirmDialog(null, "Continued?");
                n++;
            }

        }
    }

    void displayScores()
    {
        int total = 0;
        String output = " ";
        for (int i = 0; i < teamScores.length; i++)
        {
            total = total + teamScores[i];
            output = output + teamScores[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}