package proyecto1_entrega3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    public List<Carro> cargarInformacionInventario(File archivoInventario) {
        List<Carro> carros = new ArrayList<>();
        cargarInventario(archivoInventario, carros);
        return carros;
    }

    private void cargarInventario(File archivoInventario, List<Carro> carros) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(archivoInventario);
            br = new BufferedReader(fr);

            // Saltar la primera línea
            br.readLine();

            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 8) {
                    String marca = partes[0].trim();
                    String modelo = partes[1].trim();
                    String color = partes[2].trim();
                    String transmision = partes[3].trim();
                    String placa = partes[4].trim();
                    String categoria = partes[5].trim();
                    String id = partes[6].trim();
                    boolean alquilado = Boolean.parseBoolean(partes[7].trim());
                    String ubicacion = partes[8].trim();

                    Carro carro = new Carro(placa, marca, modelo, color, transmision, categoria, id, alquilado, ubicacion);
                    carros.add(carro);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}