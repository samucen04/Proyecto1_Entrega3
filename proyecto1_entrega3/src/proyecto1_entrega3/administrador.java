package proyecto1_entrega3;
import java.util.ArrayList;
import java.util.List;

public class administrador {
	
    private static List<Carro> listaDeVehiculos;

    public administrador() {
        listaDeVehiculos = new ArrayList<>();
    }

    public static boolean registrarCompra(Carro vehiculo) {
        
    	if (!vehiculo.getAlquilado()) {
            listaDeVehiculos.add(vehiculo);
            
           
            vehiculo.setAlquilado(true);
            
            return true; 
        } else {
            return false; 
        }
    }

    
    public String obtenerUbicacion(Carro vehiculo) {
        String ubicacion = vehiculo.getUbicacion();
        return ubicacion;
    }
    

    public boolean darDeBajaVehiculo(Carro vehiculo) {
        boolean exitoso = listaDeVehiculos.remove(vehiculo);
        return exitoso; 
    }
}