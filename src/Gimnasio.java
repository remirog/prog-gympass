public class Gimnasio {

    private final String codigo;
    private final String nombre;
    private Socio socios[];
    private Sala salas[];
    private int responsableId;

    private int siguientePosicionSocio = 0;
    private int siguientePosicionSala = 0;

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

        this.responsableId = -1;
    }

    /**
     * Registramos socios
     * @param socio
     * @return si le ha añadido y todó es correcto devuelve un true sino un false
    */

    public boolean registrarSocios(Socio socio) {
        boolean resultado = false;

        if ( !buscarSocio(socio.getNumSocio()) && comprobarSiHayHuecoSocio()) {
            socios[siguientePosicionSocio] = socio;
            siguientePosicionSocio++;
            resultado = true;
        }
        return resultado;
    }

    /**
     * Comprueba si hay hueco en socios
     * @return si ha encontrado hueco devuelve un true sino un false
     */

    public boolean comprobarSiHayHuecoSocio(){
        boolean resultado = false;

        for (int i = 0; i < MAX_SOCIOS && !resultado; i++) {
            if (this.socios[i] == null) {
                siguientePosicionSocio = i;
                resultado = true;
            }
        }
        return resultado;
    }

    /**
     * Busca el socio si esta o no esta a traves de un id
     * @param id del socio
     * @return si le ha encontrado devuelve un true sino un false
     */

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

    /**
     * Expulsa socio del array socios a traves de un id
     * @param id del socio
     * @return si le ha expulsado y todó es correcto devuelve un true sino un false
     */

    public Socio expulsarSocio(int id){
        Socio socio = null;

        for (int i = 0; i < MAX_SOCIOS; i++) {
         if (buscarSocio(id)){
             socios[i] = null;
             socio = socios[i];
            }
        }
        return socio;

    }

    /**
     * Designamos un responsable a traves de el numero socio
     * @param numeroSocio del socio
     * @return si le ha designado y todó es correcto devuelve un true sino un false
     */

    public boolean designarResponsable(int numeroSocio){
        boolean resultado = false;

        for (int i = 0; i < MAX_SOCIOS && !resultado; i++) {
            if (socios[i].getNumSocio() == numeroSocio){
                responsableId = i;
                resultado = true;
            }
        }
        return resultado;
    }

    /**
     * Incorporamos una sala a salas
     * @param sala que quermos incorporar
     * @return si la ha creado y todó es correcto devuelve un true sino un false
     */

    public boolean incorporarSala(Sala sala){
        boolean resultado = false;

        if ( !buscarSala(sala.getCodigoSala()) && comprobarHuecoLibreSala()) {
            salas[siguientePosicionSala] = sala;
            siguientePosicionSala++;
            resultado = true;
        }
        return resultado;
    }

    /**
     *
     * @return si hay hueco libre y todó es correcto devuelve un true sino un false
     */

    public boolean comprobarHuecoLibreSala(){
        boolean resultado = false;

        for (int i = 0; i < MAX_SALAS && !resultado; i++) {
            if (this.salas[i] == null) {
                siguientePosicionSala = i;
                resultado = true;
            }
        }
        return resultado;
    }

    /**
     * Busca la sala si esta o no esta a traves de codigoSala
     * @param codigoSala de la sala
     * @return si ha encontrado la sala y todó es correcto devuelve un true sino un false
     */

    public boolean buscarSala(int codigoSala){
        boolean resultado = false;
        int i = 0;

        while (i < MAX_SALAS && !resultado) {
            if (salas[i] != null && codigoSala == salas[i].getCodigoSala()){
                resultado = true;
            }
        }
        return resultado;
    }







}
