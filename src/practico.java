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
    public edad(String Nombre, String Apellido, int id,int edad){
        super(Nombre,Apellido,id);
        this.edad=edad;
    }
    public void Mostrar(){
        System.out.println("Datos");
        System.out.println("Nombre: ");
        System.out.println("Apellido: ");
        System.out.println("Id: ");
        System.out.println("Edad: ");

    }
}