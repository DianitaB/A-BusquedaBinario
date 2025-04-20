public class MetodoBusquedaBinario {

    private Persona [] personas;
    private ShowConsole showConsole;

    
    public MetodoBusquedaBinario(Persona [] personas){
        this.personas = personas;
        this.showConsole = new ShowConsole();
        showConsole.showMessage("Metodos de Busqueda Binario");
    }

    /* Creacion del metodo sortPersonByEdad - se lo ocupa para ordenar  por edad el arreglor de menor a mayor
    utilizando el metodo Burbuja.
    */

    public void sortPersonaByEdad(){
        int n = personas.length;
        for ( int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if(personas[i].getEdad() > personas[j].getEdad()){
                    Persona aux = personas[j];
                    personas[j] = personas[i];
                    personas[i] = aux;

                }
            }
        }
    }
    /* Creacion del metodo FindPersonaByEdad - 
    para buscar a la persona de acuerdo a la edad que el usuario desee buscar.
    */
    public int findPersonByEdad(int edad){
        
        int bajo = 0;
        int alto = personas.length-1;
        
        while(bajo <= alto){
            int central = bajo + (alto-bajo) / 2 ;
            for(int i = bajo; i <= alto; i++){
                System.out.print(personas[i].getEdad() + " | " );
            }
            System.out.println();
            System.out.println("bajo = " + bajo + " alto = " + alto + " centro = " + central + " valor centro = " + personas[central].getEdad());
           

            if (personas[central].getEdad() == edad){
                System.out.println(" ----> ENCONTRADO");
                return central; 
            }

            if (personas[central].getEdad() < edad){
                System.out.println("----> DERECHA");
                bajo = central + 1 ;
            } else {
                System.out.print("----> IZQUIERDA");
                alto = central - 1 ;
            }
            System.out.println();
        }
        return - 1 ;
    }   
    public void showPersonByEdad (){
        sortPersonaByEdad();
        int edadToFind = showConsole.getEdad();
        int indexPerson = findPersonByEdad(edadToFind);
        if (indexPerson == -1){
            showConsole.showMessage("No hay la persona con esa edad");
        } else {
            showConsole.showMessage("Persona con edad: " + edadToFind + " es " + personas[indexPerson].getNombre());
            showConsole.showMessage(personas[indexPerson].toString());
        }
    }
}