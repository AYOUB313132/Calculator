import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_Form {
    private JTextField display;
    private JButton btnResto;
    private JButton btnEqual;
    private JButton btnDivisor;
    private JButton btnSuma;
    private JButton borrarButton;
    private JButton btnComa;
    private JButton btnMenos;
    private JButton btnMultiplex;
    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JPanel displayCalc;

    double numero1 = 0, numero2 = 0, resultado = 0;
    String operacion;
    public Calculadora_Form() {
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn9.getText());
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn8.getText());
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn7.getText());
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn6.getText());
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn5.getText());
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn4.getText());
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn3.getText());
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn2.getText());
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn1.getText());
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn0.getText());
            }
        });

        btnComa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!display.getText().contains(".") && !display.getText().isEmpty()) {
                    display.setText(display.getText() + ".");
                }
            }
        });


        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 += Double.parseDouble(display.getText());
                operacion = "+";
                display.setText("");
            }
        });


        btnMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(display.getText());
                operacion = "-";
                display.setText("");
            }
        });
        btnMultiplex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(display.getText());
                operacion = "*";
                display.setText("");
            }
        });
        btnDivisor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(display.getText());
                operacion = "/";
                display.setText("");
            }
        });
        btnResto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(display.getText());
                operacion = "%";
                display.setText("");
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero2 = Double.parseDouble(display.getText());
                switch (operacion){
                    case "+": resultado = numero1 + numero2; break;
                    case "-": resultado = numero1 - numero2; break;
                    case "*": resultado = numero1 * numero2; break;
                    case "/": resultado = numero1 / numero2; break;
                    case "%": resultado = numero1 % numero2; break;
                }
                display.setText(String.valueOf( resultado));

                numero1 = 0;
                numero2 = 0;

            }
        });
    }

    public static void main(String [] args){
        JFrame frame = new JFrame("Calculadora_Form");
        frame.setContentPane(new Calculadora_Form().displayCalc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


}
