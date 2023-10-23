package proyecto1_entrega3;

public class Carro implements CarroObjects {
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private String transmision;
    private String categoria;
    private String id;
    private boolean alquilado;
    private String ubicacion;

    public Carro(String placa, String marca, String modelo, String color, String transmision, String categoria, String id, boolean alquilado, String ubicacion) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.transmision = transmision;
        this.categoria = categoria;
        this.id = id;
        this.alquilado = alquilado;
        this.ubicacion = ubicacion;
    }

    public Carro(String marca2, String modelo2, String categoria2, int id2, boolean alquilado2, String ubicacion2) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getTransmision() {
        return transmision;
    }
    
    @Override
    public String getCategoria() {
        return categoria;
    }

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public boolean getAlquilado() {
		// TODO Auto-generated method stub
		return alquilado;
	}

	@Override
	public String getUbicacion() {
		// TODO Auto-generated method stub
		return ubicacion;
	}
	
	public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

}
