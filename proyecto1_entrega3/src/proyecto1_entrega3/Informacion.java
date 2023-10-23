package proyecto1_entrega3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Informacion {
    public static List<Carro> cargarInformacionInventario(File archivoInventario) {
        List<Carro> carros = new ArrayList<>();
        cargarInventario(archivoInventario, carros);
        return carros;
    }

    private static void cargarInventario(File archivoInventario, List<Carro> carros) {
		// TODO Auto-generated method stub
		
	}

	public static void actualizarInformacionInventario(File archivo, List<Carro> carros) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
            writer.write("Marca,Modelo,Color,Transmision,Placa,Categoria,Id,Alquilado,Ubicacion"); // Escribir la cabecera
            writer.newLine();

            for (Carro carro : carros) {
                String marca = carro.getMarca();
                String modelo = carro.getModelo();
                String color = carro.getColor();
                String transmision = carro.getTransmision();
                String placa = carro.getPlaca();
                String categoria = carro.getCategoria();
                String id = carro.getId();
                boolean alquilado = carro.getAlquilado();
                String ubicacion = carro.getUbicacion();

                String line = String.join(",", marca, modelo, color, transmision, placa, categoria, id, String.valueOf(alquilado), ubicacion);
                writer.write(line);
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void agregarPedido(Pedido pedido, List<Pedido> pedidos) {
        pedidos.add(pedido);
    }
}
