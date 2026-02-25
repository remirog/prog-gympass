public class Main {
    public static void main(String[] args) {

        // Creamos Socios
        Socio socio1 = new Socio(1, "Luis");
        Socio socio2 = new Socio(2, "Carlos");
        Socio socio3 = new Socio(3, "Victor");

        // Creamos Salas
        Sala sala1 = new Sala(1, "1DAM");
        Sala sala2 = new Sala(2, "1ASIR");

        // Mostramos su información
        /*
        System.out.println(socio1);
        System.out.println(socio2);
        System.out.println(sala1);
        System.out.println(sala2);
        */


        // Creamos gimnasio
        Gimnasio myGym = new Gimnasio("1", "JavaGym", 10, 6);

        // registramos Socios
        myGym.registrarSocios(socio1);
        myGym.registrarSocios(socio2);
        myGym.registrarSocios(socio3);

        // Añadir Salas
        myGym.incorporarSala(sala1);
        myGym.incorporarSala(sala2);

        // Designar responsable
        myGym.designarResponsable(3);

        // Mostramos el informe del gimnasio
        System.out.println(myGym.obtenerInforme());


    }
}
