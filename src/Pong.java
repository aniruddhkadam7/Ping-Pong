import java.awt.*;

class Pong {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frame e1 = new Frame(0,0,1100,600);
                e1.setBounds(200,150,1100,638);
                e1.setVisible(true);
            }
        });
    }

}