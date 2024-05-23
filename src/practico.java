public class practico {
    //Atributos
    String Nombre;
    String Apellido;
    int id;
    //metodo constructor
    public practico(String Nombre,String Apellido, int id){
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.id=id;
    }

}
class edad extends practico{
    //atributos
    int edad;
    double estatura;
    public edad(String Nombre, String Apellido, int id,int edad,double estatura){
        super(Nombre,Apellido,id);
        this.edad=edad;
        this.estatura=estatura;
    }
    public void Mostrar(){
        System.out.println("Datos");
        System.out.println("Nombre: "+Nombre);
        System.out.println("Apellido: "+Apellido);
        System.out.println("Id: "+id);
        System.out.println("Edad: "+ edad);
        System.out.println("Estatura: "+estatura);

    }
}