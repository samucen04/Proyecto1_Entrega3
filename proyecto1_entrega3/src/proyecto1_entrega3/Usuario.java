package proyecto1_entrega3;

public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private String cargo;

    public Usuario(String nombreUsuario, String contrasena, String cargo) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.cargo = cargo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
