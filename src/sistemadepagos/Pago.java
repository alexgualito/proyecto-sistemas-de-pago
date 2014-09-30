

package sistemadepagos;


public class Pago {
    
    public Pago(){
        System.out.println("a ver si es cierto que aparezco");
        
    }
     public float hacerPago(int horasTrabajadas, float sueldo){
        float pago=horasTrabajadas*sueldo;
        return pago;
    }
}
