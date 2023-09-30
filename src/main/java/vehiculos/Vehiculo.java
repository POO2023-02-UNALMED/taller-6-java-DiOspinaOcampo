package vehiculos;

public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int veolocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	static int cantidadVehiculos = 0;
	
	public Vehiculo(String placa, int puertas, int veolocidadMaxima, String nombre, int precio, int peso,
			String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.veolocidadMaxima = veolocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos += 1;
		fabricante.agregarVenta();
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVeolocidadMaxima() {
		return veolocidadMaxima;
	}
	public void setVeolocidadMaxima(int veolocidadMaxima) {
		this.veolocidadMaxima = veolocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	static void setCantidadVehiculos(int n) {
		cantidadVehiculos = n;
	}
	
	public String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.cantidadAutomoviles + "\n" +
               "Camionetas: " + Camioneta.cantidadCamionetas + "\n" +
               "Camiones: " + Camion.cantidadCamiones;
	}
}
