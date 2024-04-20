class Telefonos extends ArticulosElectronicos {
    private String marca;
    private double espaciomemoria;

    //Constructores
    public Telefonos() {
    }

    public Telefonos(String nombre, String modelo, String descripcion, double precio, String marca, double espaciomemoria) {
        super(nombre, modelo, descripcion, precio);
        this.marca = marca;
        this.espaciomemoria = espaciomemoria;
    }
    //metodos getters and setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getEspaciomemoria() {
        return espaciomemoria;
    }

    public void setEspaciomemoria(double espaciomemoria) {
        this.espaciomemoria = espaciomemoria;
    }
}
