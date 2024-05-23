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
class Maria extends practico{
    //atributos
    int edad;
    double estatura;
    public Maria(String Nombre, String Apellido, int id,int edad,double estatura){
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
//hija heredando a otra hija
class Lupe extends Maria{
    //Atributo
    String tipo_pelo;
    String cumpleaños;
    String color_ojos;
    public Lupe(String Nombre, String Apellido, int id,int edad,double estatura,String tipo_pelo,String cumpleaños,String color_ojos){
        super(Nombre, Apellido, id, edad, estatura);
        this.tipo_pelo=tipo_pelo;
        this.cumpleaños=cumpleaños;
        this.color_ojos=color_ojos;
    }
    public void Mostrar1(){
        System.out.println("Datos");
        System.out.println("Nombre: "+Nombre);
        System.out.println("Apellido: "+Apellido);
        System.out.println("Id: "+id);
        System.out.println("Edad: "+ edad);
        System.out.println("Estatura: "+estatura);
        System.out.println("Pelo: "+tipo_pelo);
        System.out.println("Color ojos: "+color_ojos);
        System.out.println("Cumpleaños: "+cumpleaños);


    }
}