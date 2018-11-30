package lesson4;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


    public class Window extends JFrame {

        private JButton button = new JButton("Enter");
        private JTextField inputEnter = new JTextField("", 5);
        private JTextField input = new JTextField("", 5);
        private JLabel label = new JLabel("Input massage ");
        String string = input.toString();


        public Window() {
            setTitle("Dialog window");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setBounds(300, 300, 300, 150);
            setVisible(true);
            Container container = this.getContentPane();
            container.setLayout(new GridLayout(3, 2, 2, 2));
            container.add(button);
            container.add(inputEnter);
            inputEnter.setToolTipText("");

            container.add(label);
            container.add(input);
            input.setToolTipText("");


            inputEnter.addActionListener(new ButtonEventListener());
            button.addActionListener(new ButtonEventListener());
        }

        public class ButtonEventListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                inputEnter.setText(e.getActionCommand());
                System.out.println (string);
            }
        }

        public static void main (String[]args){
            new Window();
        }
}
