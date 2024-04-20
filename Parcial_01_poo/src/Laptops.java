class Laptops extends ArticulosElectronicos {
    private String marca;
    private double tamaño;

    //constructores
    public Laptops() {
    }

    public Laptops(String nombre, String modelo, String descripcion, double precio, String marca, double tamaño) {
        super(nombre, modelo, descripcion, precio);
        this.marca = marca;
        this.tamaño = tamaño;
    }
    //metodos getters and setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
}
