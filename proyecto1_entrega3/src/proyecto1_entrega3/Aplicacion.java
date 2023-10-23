package proyecto1_entrega3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Aplicacion {
	
	private List<Usuario> usuarios;
    private Usuario usuarioActual;
    
    public Aplicacion() {
        usuarios = new ArrayList<>();
        // Agrega usuarios a la lista
        usuarios.add(new Usuario("usuario1", "contrasena1", "cargo1"));
        usuarios.add(new Usuario("usuario2", "contrasena2", "cargo2"));
        // Agrega más usuarios según sea necesario
    }
	
	Empresa Empresa;
	
	public void ejecutarAplicacion()
	{
		
		Empresa = new Empresa(); // Crear una instancia de Empresa
	    File archivoMenu = new File ("./data/carros.csv");
	    List<Carro> carros = Empresa.cargarInformacionInventario(archivoMenu);
	    
		inicioSesion();
		
		//  File archivoIngredientes = new File ("./data/ingredientes.txt");;
		// File archivoCombos = new File ("./data/combos.txt");
		
	}
	
	public void sistemaInicioAdministrador () {
		System.out.println("  RENTA CARROS - Administrador  ");

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				System.out.println("\nOPCIONES\n");
				System.out.println("\t1. Mostrar inventario");
				System.out.println("\t2. Crear un nuevo pedido");
				System.out.println("\t3. Anadir elemento a un pedido");
				System.out.println("\t4. Cerrar pedido y guardar factura");
				System.out.println("\t5. Consultar pedido segun id");
				System.out.println("\t6. Cerrar aplicaci�n");
				System.out.println();
				int opcion_seleccionada = Integer.parseInt(input("Seleccione una opcion"));
				if (opcion_seleccionada < 6 && opcion_seleccionada > 0) 
					ejecutarOpcionAdmin(opcion_seleccionada);
				
				else if (opcion_seleccionada == 6)
				{
					System.out.println("Saliendo de la aplicaci�n - Gracias por su visita");
					continuar = false;
				}
				else
				{
					System.out.println("\nSeleccione una opcion valida.\n");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("\nSeleccione un n�mero de las opciones..\\n");
			}
		}
	}
	
	public void sistemaInicioEmpleado () {
		System.out.println("  RENTA CARROS - Empleado  ");

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				System.out.println("\nOPCIONES\n");
				System.out.println("\t1. Mostrar inventario");
				System.out.println("\t2. Crear un nuevo pedido");
				System.out.println("\t3. Anadir elemento a un pedido");
				System.out.println("\t4. Cerrar pedido y guardar factura");
				System.out.println("\t5. Consultar pedido segun id");
				System.out.println("\t6. Cerrar aplicaci�n");
				System.out.println();
				int opcion_seleccionada = Integer.parseInt(input("Seleccione una opcion"));
				if (opcion_seleccionada < 6 && opcion_seleccionada > 0) 
					ejecutarOpcionEmplea(opcion_seleccionada);
				
				else if (opcion_seleccionada == 6)
				{
					System.out.println("Saliendo de la aplicaci�n - Gracias por su visita");
					continuar = false;
				}
				else
				{
					System.out.println("\nSeleccione una opci�n v�lida.\n");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("\nSeleccione un n�mero de las opciones..\\n");
			}
		}
	}
	
	public void sistemaInicioClienteContacto () {
		System.out.println("  RENTA CARROS - Cliente  ");
		System.out.println("  Primero necesitamos algunos datos como cliente");
		int datosContacto = Integer.parseInt(input("Digita tu dato de contacto"));
	    String fechaNacimientoString = input("Ingrese fecha nacimiento formato mm-aa-dd");
	    String nacionalidad = input("Digita tu nacionalidad");
	    
	    if( datosContacto > 0 && fechaNacimientoString != "" && nacionalidad != "") {
	    	try {
	            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-yy-dd");
	            Date fechaNacimiento = dateFormat.parse(fechaNacimientoString);
	            
	            Date fechaActual = new Date();
	            
	            // Calculamos la diferencia en años
	            long diferenciaEnMilisegundos = fechaActual.getTime() - fechaNacimiento.getTime();
	            long años = diferenciaEnMilisegundos / 31556952000L; // Aproximadamente 31,556,952,000 ms por año.
	            
	            if (años >= 18) {
	                System.out.println("Eres mayor de edad.");
	                System.out.println("Puedes seguir");
	                sistemaInicioCliente();
	            } else {
	                System.out.println("Eres menor de edad.");
	                System.out.println("No puedes seguir");
	            }
	        } catch (ParseException e) {
	            System.out.println("Formato de fecha incorrecto. Debe ser mm-aa-dd.");
	        }
	    }
	}	    
	
	public void sistemaInicioCliente () {
		boolean continuar = true;
		while (continuar)
		{
			try
			{
				System.out.println("\nOPCIONES\n");
				System.out.println("\t1. Mostrar inventario");
				System.out.println("\t2. Crear un nuevo pedido");
				System.out.println("\t3. Anadir elemento a un pedido");
				System.out.println("\t4. Cerrar pedido y guardar factura");
				System.out.println("\t5. Consultar pedido segun id");
				System.out.println("\t6. Cerrar aplicaci�n");
				System.out.println();
				int opcion_seleccionada = Integer.parseInt(input("Seleccione una opcion"));
				if (opcion_seleccionada < 6 && opcion_seleccionada > 0) 
					ejecutarOpcionClien(opcion_seleccionada);
				
				else if (opcion_seleccionada == 6)
				{
					System.out.println("Saliendo de la aplicaci�n - Gracias por su visita");
					continuar = false;
				}
				else
				{
					System.out.println("\nSeleccione una opci�n v�lida.\n");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("\nSeleccione un n�mero de las opciones..\\n");
			}
		}
	}
	
	public void ejecutarOpcionAdmin(int opcionSeleccionada)
	{
		if (opcionSeleccionada == 1)
			ejecutarMostrarInventario();
		else if (opcionSeleccionada == 2)
			ejecutarNuevoPedido(opcionSeleccionada, null, null, null);
		else if (opcionSeleccionada == 3)
			ejecutarAgregarElementoPedido(null, null);
		else if (opcionSeleccionada == 4)
			ejecutarCerrarPedido(null);
		else if (opcionSeleccionada == 5)
			ejecutarConsultarPedido();
	}
	
	public void ejecutarOpcionEmplea(int opcionSeleccionada)
	{
		if (opcionSeleccionada == 1)
			ejecutarMostrarInventario();
		else if (opcionSeleccionada == 2)
			ejecutarNuevoPedido(opcionSeleccionada, null, null, null);
		else if (opcionSeleccionada == 3)
			ejecutarAgregarElementoPedido(null, null);
		else if (opcionSeleccionada == 4)
			ejecutarCerrarPedido(null);
		else if (opcionSeleccionada == 5)
			ejecutarConsultarPedido();
	}
	
	public void ejecutarOpcionClien(int opcionSeleccionada)
	{
		if (opcionSeleccionada == 1)
			ejecutarMostrarInventario();
		else if (opcionSeleccionada == 2)
			ejecutarNuevoPedido(opcionSeleccionada, null, null, null);
		else if (opcionSeleccionada == 3)
			ejecutarAgregarElementoPedido(null, null);
		else if (opcionSeleccionada == 4)
			ejecutarCerrarPedido(null);
		else if (opcionSeleccionada == 5)
			ejecutarConsultarPedido();
	}
	
	
	private void ejecutarConsultarPedido() {
		System.out.println("Escogiste la 5");
	}

	public void ejecutarCerrarPedido(Pedido pedido) {
	    if (pedido != null) {
	        pedido.cerrarPedido();
	        System.out.println("Pedido #" + pedido.getNumeroPedido() + " cerrado con éxito.");
	    } else {
	        System.out.println("Pedido no válido. No se pudo cerrar el pedido.");
	    }
	}

	public void ejecutarAgregarElementoPedido(Pedido pedido, String elemento) {
	    if (pedido != null) {
	        pedido.agregarElemento(elemento);
	        System.out.println("Elemento '" + elemento + "' añadido al pedido #" + pedido.getNumeroPedido());
	    } else {
	        System.out.println("Pedido no válido. No se pudo agregar el elemento.");
	    }
	}
	
	private void ejecutarNuevoPedido(int idCarro, String cliente, Date fechaInicio, Date fechaFin) {
	    File archivoInventario = new File("./data/carros.csv");
	    List<Carro> carros = Empresa.cargarInformacionInventario(archivoInventario);

	    Carro carroSeleccionado = null;
	    for (Carro carro : carros) {
	    	if (Integer.parseInt(carro.getId()) == idCarro) {
	            carroSeleccionado = carro;
	            break;
	        }
	    }

	    if (carroSeleccionado == null) {
	        System.out.println("Carro no encontrado en el inventario.");
	        return;
	    }
	    if (carroSeleccionado.getAlquilado()) {
	        System.out.println("El carro seleccionado ya está alquilado.");
	        return;
	    }
	    Pedido nuevoPedido = new Pedido();
	    Informacion.agregarPedido(nuevoPedido, null);
	    carroSeleccionado.setAlquilado(true);
	    Informacion.actualizarInformacionInventario(archivoInventario, carros);

	    System.out.println("Nuevo pedido creado con éxito:");
	    System.out.println("Carro alquilado - Placa: " + carroSeleccionado.getPlaca());
	}
	        
	 
	  
	private void ejecutarMostrarInventario() {
		File archivoInventario = new File("./data/carros.csv");
	    List<Carro> carros = Empresa.cargarInformacionInventario(archivoInventario);

	    if (carros.isEmpty()) {
	        System.out.println("No hay carros disponibles en el inventario.");
	    } else {
	        System.out.println("Inventario de carros:");

	        for (Carro carro : carros) {
	            System.out.println("Placa: " + carro.getPlaca());
	            System.out.println("Marca: " + carro.getMarca());
	            System.out.println("Modelo: " + carro.getModelo());
	            System.out.println("Color: " + carro.getColor());
	            System.out.println("Transmisión: " + carro.getTransmision());
	            System.out.println("Categoria: " + carro.getCategoria());
	            System.out.println("Id: " + carro.getId());
	            System.out.println("Alquilado: " + carro.getAlquilado());
	            System.out.println("Ubicacion: " + carro.getUbicacion());
	            System.out.println();
	        }
	    }
	}
	
	public void inicioSesion () {
		try
		{
			System.out.println("\nINICIO SESION \n");
			System.out.println("\t1. Ya tienes usuario?");
			System.out.println("\t2. Registrarse");
			System.out.println("\t3. Salir");
			System.out.println();
			int opcion_seleccionada = Integer.parseInt(input("Seleccione una opcion"));
			if (opcion_seleccionada < 3 && opcion_seleccionada > 0) 
				ejecutarOpcionRegistro(opcion_seleccionada);
			
			else if (opcion_seleccionada == 3)
			{
				System.out.println("Saliendo de la aplicaci�n - Gracias por su visita");
			}
			else
			{
				System.out.println("\nSeleccione una opcion valida.\n");
			}
		}
		catch (NumberFormatException e)
		{
			System.out.println("\nSeleccione un numero de las opciones..\\n");
		}
	}
	
	public void ejecutarOpcionRegistro(int opcionSeleccionadaR)
	{
		if (opcionSeleccionadaR == 1)
			realizarInicioSesion();
		else if (opcionSeleccionadaR == 2)
			registrarUsuario();
	}
	
	public void registrarUsuario() {
	    String nombreUsuario = input("Ingrese un nombre de usuario: ");
	    String contrasena = input("Ingrese una contraseña: ");
        System.out.println("\nQue cargo tienes? \n");
		System.out.println("\t1. Administrador");
		System.out.println("\t2. Cliente");
		System.out.println("\t3. Empleado");
		int opcion_cargo = Integer.parseInt(input("Seleccione su cargo"));
		String cargo = "";
		if (opcion_cargo == 1) 
			cargo = "Administrador";
		
		else if (opcion_cargo == 2)
		{
			cargo = "Cliente";
		}
		else if (opcion_cargo == 3)
		{
			cargo = "Empleado";
		}

	    Usuario nuevoUsuario = new Usuario(nombreUsuario, contrasena, cargo);
	    usuarios.add(nuevoUsuario);
	    System.out.println("Usuario registrado con éxito.");
	    realizarInicioSesion();
	}

	public void realizarInicioSesion() {
        boolean inicioSesionExitoso = false;

        while (!inicioSesionExitoso) {
            String nombreUsuario = input("Nombre de usuario: ");
            String contrasena = input("Contraseña: ");
            System.out.println("\nQue cargo tienes? \n");
    		System.out.println("\t1. Administrador");
    		System.out.println("\t2. Cliente");
    		System.out.println("\t3. Empleado");
    		int opcion_cargo = Integer.parseInt(input("Seleccione su cargo"));
    		String cargo = "";
    		if (opcion_cargo == 1) 
    			cargo = "Administrador";
    		
    		else if (opcion_cargo == 2)
    		{
    			cargo = "Cliente";
    		}
    		else if (opcion_cargo == 3)
    		{
    			cargo = "Empleado";
    		}

            for (Usuario usuario : usuarios) {
                if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena) && usuario.getCargo().equals(cargo)) {
                    usuarioActual = usuario;
                    System.out.println("Inicio de sesión exitoso. Bienvenido, " + usuario.getNombreUsuario() + " es usted " + usuario.getCargo() + "!");
                    inicioSesionExitoso = true;
                    if (usuario.getCargo() == "Administrador") {
                    	sistemaInicioAdministrador();
                    } else if (usuario.getCargo() == "Cliente") {
                    	sistemaInicioClienteContacto();
                    } else {
                    	sistemaInicioEmpleado();
                    }
                    
                }
            }

            if (!inicioSesionExitoso) {
                System.out.println("Nombre de usuario o contraseña incorrectos. Por favor, inténtelo de nuevo.");
                System.out.println("\nDeseas intentar de nuevo el registro? \n");
        		System.out.println("\t1. Si");
        		System.out.println("\t2. No");
        		int opcion_sesion = Integer.parseInt(input("Que dices?"));
                if (opcion_sesion == 1) {
                	realizarInicioSesion();
                } else {
                	System.out.println("Registrate");
                    registrarUsuario(); 
                }
            }
        }
    }
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + " ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

	
	public static void main(String[] args) {
		Aplicacion consola = new Aplicacion();
		consola.ejecutarAplicacion();
	}

}
