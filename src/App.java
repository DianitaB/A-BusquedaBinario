public class App {
    public static void main(String[] args) throws Exception {
        Persona [] personas = new Persona [9];
        personas[0] = new Persona("Pablo",4);
        personas[1] = new Persona("Maria",5);
        personas[2] = new Persona("Juan",18);
        personas[3] = new Persona("David",60);
        personas[4] = new Persona("Mateo",25);
        personas[5] = new Persona("Diego",12);
        personas[6] = new Persona("Ana",8);
        personas[7] = new Persona("Alicia",9);
        personas[8] = new Persona("Jaime",40);

        MetodoBusquedaBinario mbb = new MetodoBusquedaBinario(personas);
        mbb.showPersonByEdad();
    }  
}
