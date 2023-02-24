package raiburari;

public class Main {
    public static void main(String[] args) throws Exception {
        LibreriaIO L = new LibreriaIO();
        Operation O = new Operation();
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
        O.Calc();
    }
}