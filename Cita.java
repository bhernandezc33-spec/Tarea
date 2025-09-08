import java.time.*;

public class Cita {
    private long id;
    private Paciente Paciente;
    private Dueno dueno;
    private LocalDateTime fecha;
    private String motivo;
    private EstadoCita estado;

    public void setId(long id) { this.id = id; }
    public long getId(long id) { return id; }
    public void setPaciente(Paciente Paciente) { this.Paciente = Paciente;}
    public Paciente getPaciente() { return Paciente; }
    public void setDueno(Dueno dueno) { this.dueno = dueno; }
    public Dueno getDueno() { return dueno; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
    public LocalDateTime getFecha() { return fecha; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
    public String getMotivo() { return motivo; }
    public void setEstadoCita(EstadoCita estado) { this.estado = estado; }
    public EstadoCita getEstadoCita() { return estado; }
    public void reagendar(LocalDateTime fecha){setFecha(fecha);}
    public void cancelar(){setEstadoCita(EstadoCita.CANCELADA);}

    public static class Paciente {
        private long id;
        private String nombre;
        private String especie;
        private String raza;
        private int edadMeses;
        private double pesoKg;

        public long getId(){ return id; }
        public void setId(long id){ this.id = id; }
        public String getNombre(){ return nombre; }
        public void setNombre(String nombre){ this.nombre = nombre; }
        public String getEspecie(){ return especie; }
        public void setEspecie(String especie){ this.especie = especie; }
        public String getRaza(){ return raza; }
        public void setRaza(String raza){ this.raza = raza; }
        public int getEdadMeses(){ return edadMeses; }
        public void setEdadMeses(int edadMeses){ this.edadMeses = edadMeses; }
        public double getPesoKg(){ return pesoKg; }
        public void setPesoKg(double pesoKg){
            if(pesoKg > 1) {
                this.pesoKg = pesoKg;
            }
        }

        public Paciente(long id, String nombre, String especie, String raza, int edadMeses, double pesoKg) {
            this.id = id;
            this.nombre = nombre;
            this.especie = especie;
            this.raza = raza;
            this.edadMeses = edadMeses;
            this.pesoKg = pesoKg;}

        public Paciente(long id, String nombre) {
            this.id = id;
            this.nombre = nombre;}

        public void actualizarPeso(double nuevoPeso){setPesoKg(nuevoPeso);}
        public void cumplirMes(){this.edadMeses = this.edadMeses + 1;}
        public boolean esCachorro(){return getEdadMeses() < 12;}
    }
}