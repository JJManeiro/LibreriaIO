package raiburari;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class LibreriaIO {
    public static final int Consola = 1;
    public static final int Popup = 2;
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
