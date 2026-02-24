public class Main {
    public static void main(String[] args) {

        // Creamos dos Socios
        Socio socio1 = new Socio(1, "Luis");
        Socio socio2 = new Socio(2, "Carlos");

        // Creamos dos Salas
        Sala sala1 = new Sala(1,"1DAM");
        Sala sala2 = new Sala(2,"1ASIR");

        // Mostramos su información
        System.out.println(socio1);
        System.out.println(socio2);
        System.out.println(sala1);
        System.out.println(sala2);

        // Creamos gimnasio
        Gimnasio myGym = new Gimnasio("1","JavaGym", 30, 2);


    }
}
