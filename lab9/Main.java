import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel contentPane;

    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 350, 220);
        setTitle("Варіант 8");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel label1 = new JLabel("Жорсткість (k):");
        label1.setBounds(40, 30, 100, 20);
        contentPane.add(label1);

        textField1 = new JTextField();
        textField1.setBounds(150, 30, 150, 20);
        contentPane.add(textField1);

        JLabel label2 = new JLabel("Стиснення (x):");
        label2.setBounds(40, 60, 100, 20);
        contentPane.add(label2);

        textField2 = new JTextField();
        textField2.setBounds(150, 60, 150, 20);
        contentPane.add(textField2);

        JLabel label3 = new JLabel("Сила (F):");
        label3.setBounds(40, 90, 100, 20);
        contentPane.add(label3);

        textField3 = new JTextField();
        textField3.setBounds(150, 90, 150, 20);
        textField3.setEditable(false);
        contentPane.add(textField3);

        JButton btnCalculate = new JButton("Обчислити");
        btnCalculate.setBounds(150, 120, 150, 30);
        contentPane.add(btnCalculate);

        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double k = Double.parseDouble(textField1.getText());
                    double x = Double.parseDouble(textField2.getText());
                    double f = k * x;
                    textField3.setText(Double.toString(f));
                } catch (NumberFormatException ex) {
                    textField3.setText("Помилка вводу");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
