public class Doctor {
    //Atributos
    static int id = 0; //Autoincrementado
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el objeto Doctor: ");
        id++;
    }

    //comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

}
