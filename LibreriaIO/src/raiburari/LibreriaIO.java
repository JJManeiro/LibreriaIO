package raiburari;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class LibreriaIO {
    /**
     * Esta es la librería calculadora.Ambos consola y popup tendrán constantes finales.
     * @param Consola llamará un scanner para pedir los numeros y nombre.
     * @param Popup usará JOptionPane para pedir los numeros y nombre.
     */
    public static final int Consola = 1;
    public static final int Popup = 2;

    /**
     * Este será el switch que activará la salida,en el están
     * @param m que dará el resultado que pondremos a leer en el scanner/JoptionPane.
     * @param op será lo que pondremos en el switch para escoger la opción de consola o popup.
     */
    public static void Output(String m,int op){
        switch (op){
            case Consola:
                System.out.println(m);
                break;
            case Popup:
                JOptionPane.showMessageDialog(null,m);
                break;
        }
    }

    /**
     * Con la misma mećanica activamos la entrada
     * @param com dará el resultado que pondremos a leer en el scanner/JoptionPane.
     * @param op ayudara a escoger en el switch.
     * @return será null.
     */
    public static String SInput (String com,int op){
        switch (op){
            case Consola:
                System.out.println("Dame tu nombre");
                Scanner sc1 = new Scanner (System.in);
                return (sc1.nextLine()+"\nEse es tu nombre,no?");
            case Popup:
                return JOptionPane.showInputDialog(com);
        }
        return null;
    }

    /**
     * Casi lo mismo aquí pero con un extra.
     * @param com dará el resultado que pondremos a leer en el scanner/JoptionPane(El JOP será casteado a Integer).
     * @param op ayudara a escoger en el switch.
     * @return null.
     * @throws Exception en el caso que dejemos el numero en blanco.
     */
    public static Integer NInput (String com,int op) throws Exception{
        try {
            switch (op) {
                case Consola:
                    System.out.println("Adivinaré tu numero.");
                    Scanner sc2 = new Scanner(System.in);
                    return sc2.nextInt();
                case Popup:
                    return Integer.parseInt(JOptionPane.showInputDialog(com));
            }
        }
        catch (Exception e){
            throw new Exception("Debes meter un numero.");
        }
        return null;
    }

    /**
     * Misma mecánica que con los números.
     * @param com dará el resultado que pondremos a leer en el scanner/JoptionPane(El JOP será casteado a Float).
     * @param op ayudara a escoger en el switch.
     * @return null.
     * @throws Exception en el caso que dejemos el numero en blanco.
     */
    public static Float FInput (String com,int op) throws Exception{
        try {
            switch (op) {
                case Consola:
                    System.out.println("Lo intentaré de nuevo");
                    Scanner sc3 = new Scanner(System.in);
                    return sc3.nextFloat();
                case Popup:
                    return Float.parseFloat(JOptionPane.showInputDialog(com));
            }
        }
        catch (Exception e){
            throw new Exception("Debes meter un numero.");
        }
        return null;
    }
}
