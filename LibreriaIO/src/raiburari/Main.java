package raiburari;

/**
 * Libreria de calculos + Libreria de Inputs/Outputs.
 * @author Juan
 * @version 24.2.2023
 */
public class Main {
    public static void main(String[] args) throws Exception {
        /**
         * Llamamos a los objetos de la librería IO y la calculadora
         */
        LibreriaIO L = new LibreriaIO();
        Operation O = new Operation();
        /**
         * Librería IO
         * @param name pide un nombre en forma de String.
         * @return nombre vacio si se deja en blanco.
         * @return el nombre que hayamos puesto si no está vació.
         * @param N pide un numero Integer.
         * @return dame numero si se deja vacío.
         * @return el numero dado si pusimos uno.
         * @param F pide un numero float.
         * @return dame numero si se deja vacío.
         * @return el numero dado si pusimos uno.
         */
        String name = LibreriaIO.SInput("nombre?",L.Popup);
        if (name.isEmpty()==true){
            LibreriaIO.Output("nombre en vacío",L.Popup);
        }
        else{
            LibreriaIO.Output("Me alegro de verte,"+name,L.Popup);
        }
        Integer N = LibreriaIO.NInput("numero?",L.Popup);
        if (N==null){
            LibreriaIO.Output("dame numero",L.Popup);
        }
        else{
            LibreriaIO.Output((N.toString()+"\nFue ese tu numero?"),L.Popup);
        }
        Float F = LibreriaIO.FInput("decimal?",L.Popup);
        if (F==null){
            LibreriaIO.Output("dame numero",L.Popup);
        }
        else{
            LibreriaIO.Output(F.toString()+"\nFue ese tu numero?",L.Popup);
        }
        /**
         * Llama a la librería calculadora. Esta se verá en las otras clases.
         */
        O.Calc();
    }
}