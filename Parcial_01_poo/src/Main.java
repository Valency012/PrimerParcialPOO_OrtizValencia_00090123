import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    static ArrayList<Telefonos>telefonosArrayList = new ArrayList<>();
    static ArrayList<Laptops>laptopsArrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal(){
        int opcion;
        do {
            System.out.println("Ingrese una opcion: ");
            System.out.println("1. Agregar articulo");
            System.out.println("2. Modificar informacion de articulo");
            System.out.println("3. Mostrar articulos");
            System.out.println("0. Salir");
            System.out.print(">");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("-------------AGREGAR ARTICULO");
                    System.out.println("Ingrese el nombre: ");
                    System.out.print(">");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el modelo: ");
                    System.out.print(">");
                    String modelo = scanner.nextLine();
                    System.out.println("Ingrese la descripcion del articulo: ");
                    System.out.print(">");
                    String descripcion = scanner.nextLine();
                    System.out.println("Ingrese el precio del articulo: ");
                    System.out.print(">");
                    double precio = scanner.nextDouble();
                    System.out.println("Que producto desea agregar?");
                    System.out.println("1. Telefono");
                    System.out.println("2. Laptop");
                    opcion = scanner.nextInt();
                    if (opcion == 1) {
                        addTelefono();
                        System.out.println("Producto agregado exitosamente!");
                    } else if (opcion == 2) {
                        addLaptop();
                        System.out.println("Producto agregado exitosamente!");
                    } else {
                        System.out.println("Error al selecionar una opcion");
                    }
                    break;

                case 2:
                    System.out.println("-------------MODIFICAR INFORMACION");


                    break;
                case 3:
                    System.out.println("----------------MOSTRAR ARTICULOS");
                    System.out.println("Telefonos----------------");
                    showInfoTelefonos();
                    scanner.nextLine();
                    System.out.println("Laptops----------------");
                    showInfoLaptos();
                    scanner.nextLine();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error al elegir una opcion");
                    break;
            }
        }while(opcion != 0);
    }

    //metodos agregar
    public static void addTelefono(){
        telefonosArrayList = new ArrayList<>();

    }
    public static void addLaptop(){
        laptopsArrayList = new ArrayList<>();
    }
    //metodos mostrar
    public static void showInfoTelefonos(){
        int contador = 1;
        for (Telefonos telefonos : telefonosArrayList){
            System.out.println("---------------------------N°: " + contador);
            System.out.println("Nombre: ");
            String nombre = telefonos.getNombre();
            System.out.println("Modelo: ");
            String modelo= telefonos.getModelo();
            System.out.println("Descripcion: ");
            String descripcion = telefonos.getDescripcion();
            System.out.println("Precio: ");
            double precio = telefonos.getPrecio();
            contador++;
        }
    }
    private static void showInfoLaptos() {
        int contador = 1;
        for (Laptops laptops : laptopsArrayList){
            System.out.println("---------------------------N°: " + contador);
            System.out.println("Nombre: ");
            String nombre = laptops.getNombre();
            System.out.println("Modelo: ");
            String modelo= laptops.getModelo();
            System.out.println("Descripcion: ");
            String descripcion = laptops.getDescripcion();
            System.out.println("Precio: ");
            double precio = laptops.getPrecio();
            contador++;
        }
    }

}