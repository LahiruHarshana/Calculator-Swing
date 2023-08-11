import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
    //static double number;
    private JButton btnDlt;
    private JButton btnClr;
    double number1 = 0;
    double fnumber =0;
    double mNum = 0;
    int calculation;
    private JButton [] buttons;
    //private JButton btnClick;
    private JTextField txt;
    private JLabel lbl;
    private JPanel displayPanel;
    private JPanel buttonsPanel;
    private JPanel Panel;
    //private JPanel Panel;
    //private
    String z;
    String zt;


    Calculator() {
        initComponents();
    }

    public void initComponents() {
        setSize(300, 450);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        displayPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonsPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        txt = new JTextField(20);


        displayPanel.add(txt);

        buttons = new JButton[16];
        String[] btnNames = {"7", "8", "9", "-", "4", "5", "6", "/", "1", "2", "3", "+", "0", ".", "=", "*"};

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(btnNames[i]);
            buttonsPanel.add(buttons[i]);
            (buttons[i]).addActionListener(this);

        }

        btnDlt = new JButton("Delete");
        btnDlt.setFont(new Font("Serif", Font.PLAIN, 12));
        btnDlt.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnClr = new JButton("Clear");
        btnClr.setFont(new Font("Serif", Font.PLAIN, 12));
        btnClr.setCursor(new Cursor(Cursor.HAND_CURSOR));


        btnDlt.addActionListener(this);
        btnClr.addActionListener(this);

        Panel.add(btnDlt);
        Panel.add(btnClr);


        add(displayPanel, BorderLayout.PAGE_START);
        add(buttonsPanel, BorderLayout.CENTER);
        add(Panel, BorderLayout.PAGE_END);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        c1:switch(event.getActionCommand()){
            case "1":
                txt.setText(txt.getText()+"1");
                break;

            case "2":
                txt.setText(txt.getText()+"2");
                break;

            case "3":
                txt.setText(txt.getText()+"3");
                break;

            case "4":
                txt.setText(txt.getText()+"4");
                break;

            case "5":
                txt.setText(txt.getText()+"5");
                break;

            case "6":
                txt.setText(txt.getText()+"6");
                break;

            case "7":
                txt.setText(txt.getText()+"7");
                break;

            case "8":
                txt.setText(txt.getText()+"8");
                break;

            case "9":
                txt.setText(txt.getText()+"9");
                break;


            case "-":
                fnumber=Double.parseDouble(txt.getText());
                number1 =fnumber;
                txt.setText("");
                calculation = 1;
                break;



            case "/":
                fnumber=Double.parseDouble(txt.getText());
                number1 =fnumber;
                txt.setText("");
                calculation = 2;
                break;

            case "+":
                fnumber=Double.parseDouble(txt.getText());
                number1 =fnumber;
                txt.setText("");
                calculation = 3;
                break;

            case "*":
                fnumber=Double.parseDouble(txt.getText());
                number1 =fnumber;
                txt.setText("");
                calculation = 4;
                break;

            case ".":
                //String num = ".";
                txt.setText(txt.getText()+".");
                break;
            case "0":
                //String num = "0";
                txt.setText(txt.getText()+"0");
                break;

            case "Clear":
                txt.setText("");
                break;

            case "Delete":
                zt=txt.getText();
                try{
                    z=zt.substring(0, zt.length()-1);
                }catch(StringIndexOutOfBoundsException f){return;}
                txt.setText(z);

                break;



            case "=":
                if(calculation==1){
                    double number2 =Double.parseDouble(txt.getText());
                    double result = number1-number2;

                    String num =String.valueOf(result);
                    txt.setText("");
                    txt.setText(num);
                    number2 = 0;
                    number1 = 0;
                    result = 0;

                }

                if(calculation==2){
                    double number2 =Double.parseDouble(txt.getText());
                    double result = number1/number2;

                    String num =String.valueOf(result);
                    txt.setText("");
                    txt.setText(num);
                    number2 = 0;
                    number1 = 0;
                    result = 0;

                }
                if(calculation==3){
                    double number2 =Double.parseDouble(txt.getText());
                    double result = number1+number2;

                    String num =String.valueOf(result);
                    txt.setText("");
                    txt.setText(num);
                    number2 = 0;
                    number1 = 0;
                    result = 0;

                }
                if(calculation==4){
                    double number2 =Double.parseDouble(txt.getText());
                    double result = number1*number2;

                    String num =String.valueOf(result);
                    txt.setText("");
                    txt.setText(num);
                    number2 = 0;
                    number1 = 0;
                    result = 0;

                }


                break;

        }
        //}


    }
}

class Demo{
    public static void main(String args[]){
        new Calculator().setVisible(true);
    }
}


