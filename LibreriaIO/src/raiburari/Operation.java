package raiburari;

public class Operation {
    /**
     * Esta es la librería calculadora.
     * Usaremos como operadores las letras S,R,M,D y V, las cuales son constantes finales de String.
     * @param float será el numero nulo que cambiará al resultado de la operación cuando toque.
     */
    public static final String suma="S",resta ="R",multi="M",divi="D",raiz="V";
    public static Float total=null;

    /**
     * Este es el switch que usaremos para decir que operaciones usaremos en la calculadora.
     * @param n1 será el primero numero que pondremos, el dividendo a la hora de dividir y el radicando a la hora de hacer raíces.
     * @param n2 será el otro numero a poner. El divisor al dividir y el índice al hacer raíces.
     * @param O será la letra que pondremos para saber que case queremos en el switch.
     * @return total que dará el resultado de la operacíon que hicimos.
     * @throws Exception en el caso de que pongamos un numero 0 a la hora de dividir o hacer ráices.
     */
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
            case raiz:
                if (n1==0||n2==0){
                    throw new Exception("Que complicado no?");
                }
                total = (float)Math.pow(n1,(1/n2));
        }
        return total;
    }

    /**
     * Esto será el comprobante que usaremos en el caso de poner letras que no hemos marcado como operadores.
     * @param O será la letra que pondremos a la hora de operar.
     * @throws Exception si no hemos puesto uno de las letras operadoras ahí.
     */
    public static void Validate (String O) throws Exception{
        if(!O.equals("S")&&!O.equals("R")&&!O.equals("M")&&!O.equals("D")&&!O.equals("V")){
            throw new Exception("Parámetro Invalido");
        }
    }

    /**
     * Calc será el que cogerá el Input de los floats n1 y n2, tras haberse validado el String O.
     * R será el resultado que nos dará tras operar n1 y n2. Este se mostrará en el Output
     * Pilla las excepciones y los mensajes que hemos tirado en validate y operation de esta librería.
     */
    public void Calc(){
        try {
            String O = LibreriaIO.SInput("S suma\nR resta\nM multiplica\nD divide \nV raices", LibreriaIO.Popup);
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
