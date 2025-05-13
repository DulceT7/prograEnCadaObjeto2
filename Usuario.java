public class Usuario {

       // Propiedades del objeto
         private String nombre;
         private String apellidos;
         private int edad;
         private int fechaNacimiento;
    
         // Método constructor 
        public Usuario(String nombre,String apellidos,int edad,int fechaNacimiento) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
            this.fechaNacimiento = fechaNacimiento;
        }

        // Métodos gets
        public int getEdad(){
            return this.edad;
        }

        public String getNombre(){
            return this.nombre;
        }

        public String getApellidos(){
            return this.apellidos;
        }

        public int getFechaNacimiento(){
            return this.fechaNacimiento;
        }

        // Métodos set
        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public void setFechaNacimiento(int fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
        
        // Métodos
        public void mostrarDatos() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellidos: " + apellidos);
            System.out.println("Edad: " + edad);
            System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
    }
    }
