package proyecto1_entrega3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private String cliente;
    private List<String> elementos;

    // Constructor y otros métodos de la clase Pedido

    public void agregarElemento(String elemento) {
        if (elementos == null) {
            elementos = new ArrayList<>();
        }
        elementos.add(elemento);
    }
    
    public int getNumeroPedido() {
        return numeroPedido;
    }
    
    public void cerrarPedido() {
        boolean cerrado = false;
		if (!cerrado) {
            cerrado = true;
            System.out.println("Pedido #" + numeroPedido + " ha sido cerrado.");
        } else {
            System.out.println("El pedido #" + numeroPedido + " ya está cerrado.");
        }
    }
}

