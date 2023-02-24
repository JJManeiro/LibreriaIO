package raiburari;

public class Operation {
    public static final String suma="S",resta ="R",multi="M",divi="D";
    public static Float total=null;
    public float Operation(float n1,float n2,String O)throws Exception{
        switch (O){
            case suma:
                total=n1+n2;
                break;
            case resta:
                total=n1-n2;
                break;
            case multi:
                total=n1*n2;
                break;
            case divi:
                if(n1==0||n2==0){
                    throw new Exception("No se puede dividir entre 0");
                }
                total=n1/n2;
                break;
        }
        return total;
    }
    public static void Validate (String O) throws Exception{
        if(!O.equals("S")&&!O.equals("R")&&!O.equals("M")&&!O.equals("D")){
            throw new Exception("Parámetro Invalido");
        }
    }
    public void Calc(){
        try {
            String O = LibreriaIO.SInput("S suma\nR resta\nM multiplica\nD divide", LibreriaIO.Popup);
            Validate(O);
            float n1 = LibreriaIO.FInput("numero 1?", LibreriaIO.Popup);
            float n2 = LibreriaIO.FInput("numero 2?", LibreriaIO.Popup);
            float R = Operation(n1, n2, O);
            LibreriaIO.Output("Resultado: " + R, LibreriaIO.Popup);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
