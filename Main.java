public class Main {

    public static void main(String[] args){
        
        // Usuario
        Usuario usuario1 = new Usuario("Sofia", "Sandoval H.", 16, 2009);
        Usuario usuario2 = new Usuario("Dulce", "Taguite O.", 18, 2007);

        // Métodos del objeto
        usuario1.setNombre("Camiluchis");
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();

        System.out.println(usuario1.getEdad());

        if (usuario1.getEdad() >= 18) {
            System.out.println("Mayor de edad");
        }
    }
}