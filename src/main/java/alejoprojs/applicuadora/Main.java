package alejoprojs.applicuadora;

public class Main {
    public static void main(String[] args) {
        Licuadora licuadora = new Licuadora();
        licuadora.setTipoBebida(Licuadora.licuado);
        licuadora.setFrutaByString("Naranja");;
        System.out.println(licuadora.Licuar());
        
    }
}