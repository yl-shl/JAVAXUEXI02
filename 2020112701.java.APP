import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class APP {
    JPanel myPanel=new JPanel();
    JLabel label_img=new JLabel();
    JLabel label_score=new JLabel();
    int score,score1,score2,score3,score4;

    //构造方法
    public APP() {

            myPanel .addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getX() < 190 && e.getX() > 155 && e.getY() < 320 && e.getY() > 270) {
                    score1 = 1;
                    score = score1 + score2 + score3 + score4;
                    label_score.setText("Your Score:" + String.valueOf(score));
                }

                if (e.getX() < 100 && e.getX() > 37 && e.getY() < 690 && e.getY() > 645) {
                    score2 = 1;
                    score = score1 + score2 + score3 + score4;
                    label_score.setText("Your Score:" + String.valueOf(score));
                }

                if (e.getX() < 465 && e.getX() > 340 && e.getY() < 730 && e.getY() > 650) {
                    score3 = 1;
                    score = score1 + score2 + score3 + score4;
                    label_score.setText("Your Score:" + String.valueOf(score));
                }

                if (e.getX() < 290 && e.getX() > 210 && e.getY() < 710 && e.getY() > 660) {
                    score4 = 1;
                    score = score1 + score2 + score3 + score4;
                    label_score.setText("Your Score:" + String.valueOf(score));
                }
            }

        });


    }
    //显示窗体方法
    void go(){
        label_score.setForeground(Color.BLUE);
        label_score.setFont(new Font("Arial",Font.PLAIN,20));
        label_score.setText("Your Score:0");
        label_score.setBounds(0,0,200,50);

        java.net.URL imgURL = APP.class.getResource("3.png");
        label_img.setIcon(new ImageIcon(imgURL));
        label_img.setBounds(0,0,1000,800);

        myPanel.add(label_score);
        myPanel.add(label_img);


        JFrame frame = new JFrame("小红帽找茬游戏");
        myPanel.setLayout(null);

        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,800);
//        //frame.pack();
        frame.setVisible(true);


    }
    public static void main(String[] args) {
        new APP().go();
    }
}
