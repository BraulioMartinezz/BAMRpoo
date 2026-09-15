package miPrincipal;

public class Principal {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new Principal().getGreeting());

        Perro perro ; // Declaarando la variable perro de tipo perro
        perro = new Perro() ;

        /*
        MARCA ERROR PORQUE LOS ATRIBUTOS SON PRIVADOS
        POR LO TANTO NO PUEDES SER MODIFICADOS/ACCEDIDOS POR UNA
        CLASE DIFERENTE A PERRO, EN ESTE CASO LA CLASE PRINCIPAL
        ESTA TRATANDO DE MODIFICARLO 
        
        perro nombre = "mila";
        perro.color = "cafe" ;
        perro.peso =  23.5 ; 
        perro.edad = 12 ;
        perro.raza = "golden"; 
        perro.tamano = "chico"*/
    }
}