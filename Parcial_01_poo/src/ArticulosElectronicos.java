import java.util.ArrayList;

abstract class ArticulosElectronicos {
    protected String nombre;
    protected String modelo;
    protected String descripcion;
    protected double precio;

    static ArrayList<Telefonos>telefonosArrayList = new ArrayList<>();
    static ArrayList<Laptops>laptopsArrayList = new ArrayList<>();

    //constructores
    public ArticulosElectronicos() {
    }

    public ArticulosElectronicos(String nombre, String modelo, String descripcion, double precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    //metodos getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static ArrayList<Telefonos> getTelefonosArrayList() {
        return telefonosArrayList;
    }

    public static void setTelefonosArrayList(ArrayList<Telefonos> telefonosArrayList) {
        ArticulosElectronicos.telefonosArrayList = telefonosArrayList;
    }

    public ArrayList<Laptops> getLaptopsArrayList() {
        return laptopsArrayList;
    }

    public void setLaptopsArrayList(ArrayList<Laptops> laptopsArrayList) {
        this.laptopsArrayList = laptopsArrayList;
    }
}

