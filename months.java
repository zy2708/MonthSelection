import javax.swing.JOptionPane;
public class months {
    public enum monthselection {January,February,March,April,May,June,July,August,September,October,November,December}
    public static void main(String[] args) {
        monthselection[] choices = { monthselection.January,monthselection.February,monthselection.March,monthselection.April,monthselection.May,
                monthselection.June,monthselection.July,monthselection.August,monthselection.September,monthselection.October,
                monthselection.November,monthselection.December};
        monthselection input = (monthselection) JOptionPane.showInputDialog(null,"Month Selection", "Month",
                JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]);
        int n=0;
        while (n==0) {
            switch(input){
                case December:
                    JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
                    break;
                case January:
                    JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
                    break;
                case February:
                    JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
                    break;
                case March:
                    JOptionPane.showMessageDialog(null, "Happy Spring days!");
                    break;
                case April:
                    JOptionPane.showMessageDialog(null, "Happy Spring days!");
                    break;
                case May:
                    JOptionPane.showMessageDialog(null, "Happy Spring days!");
                    break;
                case June:
                    JOptionPane.showMessageDialog(null, " It’s a summer time.");
                    break;
                case July:
                    JOptionPane.showMessageDialog(null, " It’s a summer time.");
                    break;
                case August:
                    JOptionPane.showMessageDialog(null, " It’s a summer time.");
                    break;
                case September:
                    JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
                    break;
                case October:
                    JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
                    break;
                case November:
                    JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
            }
            //Fill in switch case code below to check for account type and return appropriate Welcome message
            input = (monthselection) JOptionPane.showInputDialog(null,"Month Selection", "Month",
                    JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]);
            if(n==JOptionPane.CANCEL_OPTION){
                n=1;
            }
            else{
                n=0;
            }
        }
    }
}

