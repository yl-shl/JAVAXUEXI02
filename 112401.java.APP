import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class APP {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public APP() {
        textArea_A.setText("");
        textArea_A.setBounds(100,100,300,150);
        textArea_A.setBackground(Color.orange);
        textArea_B.setBounds(100,300,300,150);
        textArea_B.setBackground(Color.yellow);
        myPanel.add(textArea_A);
        myPanel.add(textArea_B);

        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (textArea_A.getText().equals("F")) {
                        textArea_B.append("输入正确！");
                    }

                    if (!textArea_A.getText().equals("F")) {
                        textArea_B.append("输入错误！");
                    }
                }


//                if (e.getKeyCode() == KeyEvent.VK_UP) {
//                    textArea_B.append("点击就送通宝！\n");
//                }
//                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
//                    textArea_B.setText("");

                }

        });
    }
    //显示窗体方法
    void go(){


                    JFrame frame = new JFrame("点击就送");
                    myPanel.setLayout(null);
                    myPanel.add(label_txt);
                    frame.setContentPane(myPanel);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setBounds(100, 100, 512, 720);
                    //frame.pack();
                    frame.setVisible(true);
                }
                public static void main(String[]args){
                    new APP().go();
                }
            }
