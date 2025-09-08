public class Main {
    public static void main(String[] args) {
        Dueno[] duenos = new Dueno[500];
        Paciente[] pacientes = new Paciente[1000];

        for (int i = 0; i < duenos.length; i++) {
            long id = i + 1;
            String nombre = "  " + id;
        }


        for (int i = 0; i < pacientes.length; i++) {
            long id = i + 1;
            String nombre = "Mascota_" + id;
            String especie = (i % 2 == 0) ? "perro" : "gato";
            String raza = "mestizo";
            int edadMeses = (i % 120) + 1;
            double pesoKg = 1.0 + (i % 30);

            pacientes[i] = new Paciente(id, nombre, especie, raza, edadMeses, pesoKg);
        }


        System.out.println(" Primeros 3 dueños");
        for (int i = 0; i < 3; i++) {
            System.out.println(duenos[i]);
        }

        System.out.println("primeras 6 mascotas");
        for (int i = 0; i < 6; i++){
            System.out.println(pacientes[i]);}
    }
}