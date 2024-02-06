import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        JFrame frame =new JFrame("Ingreso de calificaciones");//creo un objeto de la clase JFrame
        frame.setContentPane(new ingresoForm().form1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //defino un boton para cerrar la ventana
        frame.setSize(200,200);
        frame.pack();

        frame.setVisible(true);//muestro todo



    }
}