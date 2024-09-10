package alejoprojs.applicuadora;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Licuadora {
    
    public static Integer licuado = 1;
    public static Integer batido = 2;

    public static Map<Integer, String> frutas = Map.of(1, "Banana",2, "Piña",3, "Durazno",4, "Fresa",5, "Melon",6, "Naranja");

    //Estado de la licuadora
    private Integer tipoBebida;
    private String fruta;
    
   public void setTipoBebida(Integer tipoBebida) {
    if (tipoBebida.equals(licuado) || tipoBebida.equals(batido)) {
        this.tipoBebida = tipoBebida;    
    } else {
     System.out.println("El tipo de bebida ingresado no esta disponible, por favor usar 1 o 2");
     this.tipoBebida = null;   
    } 
   }

   public Integer getTipoBebida() {
    return this.tipoBebida;
   }

   public void setFrutaByNumber(Integer fruta){
    this.fruta = frutas.get(fruta);
   }

   public void setFrutaByString(String fruta){
     if(frutas.containsValue(fruta)){
        this.fruta = fruta;
     }else{
        System.out.println("La fruta ingresada no esta disponible, ingresar alguna de estas disponibles");
        System.out.println(frutas.values());
     this.fruta = null;   
     }
   }

   public String getFruta(){
    return this.fruta;
   }

   public String Licuar(){
    if (this.tipoBebida != null && this.fruta != null) {
        if(this.tipoBebida.equals(licuado)){
            return "Aqui tienes tu licuado de " + fruta + " al agua";
        } else {
            return "Aqui tienes tu batido de " + fruta + " con leche";
        }
    } else {
        return "No se pudo licuar porque falta la fruta o el tip de bebida, usar sus setters para asignarlo";
    }
   }
}
