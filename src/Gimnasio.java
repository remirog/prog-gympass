public class Gimnasio {

    private final String codigo;
    private final String nombre;
    private Socio socios[];
    private Sala salas[];
    private int responsableld;

    private int siguientePosicion = 0;

    private final int MAX_SOCIOS;
    private final int MAX_SALAS;

    /**
     * Constructor del Gimnasio
     * @param codigo de el gimnasio
     * @param nombre de el gimnasio
     * @param cantidadMaximaSocios que tiene el gimnasio
     * @param cantidadMaximaSalas que tiene el gimnasio
     */

    public Gimnasio(String codigo, String nombre, int cantidadMaximaSocios, int cantidadMaximaSalas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.MAX_SOCIOS = cantidadMaximaSocios;
        this.MAX_SALAS = cantidadMaximaSalas;

        this.socios = new Socio[MAX_SOCIOS];
        this.salas = new Sala[MAX_SALAS];

        this.responsableld = -1;
    }

    /**
     *
     * @param socio
     * @return
    */

    public boolean registrarSocios(Socio socio) {
        boolean resultado = false;

        if ( !buscarSocio(socio.getNumSocio()) && comprobarSiHayHueco()) {
            socios[siguientePosicion] = socio;
            siguientePosicion++;
            return resultado;
        }
        return resultado;
    }

    public boolean comprobarSiHayHueco(){
        boolean resultado = false;

        for (int i = 0; i < MAX_SOCIOS && !resultado; i++) {
            if (this.socios[i] == null) {
                resultado = true;
            }
        }
        return resultado;
    }

    public boolean buscarSocio(int id){
        boolean resultado = false;
        int i = 0;

        while (i < MAX_SOCIOS && !resultado) {
            if (socios[i] != null && id == socios[i].getNumSocio()){
                resultado = true;
            }
        }
        return resultado;
    }






}
