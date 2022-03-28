import java.util.ArrayList;

   public class LlenarPersonas {
   public static void main(String[] args) {
   int n = 9;
   
   String nombres[] = { "Ana", "Luis", "Alicia", "Pedro", "Carmen", "Andrea", "Cristina", "Julio","Patricia" };
   int edades[] = { 14, 15, 13, 15, 16, 12, 16, 14, 13 };

   ArrayList<Persona> lista = new ArrayList<Persona>();

   // Llena la lista
   for (int i = 0; i < n; i++){
      lista.add(new Persona(nombres[i], edades[i]));
   }

   // Muestra la lista
   for (int i = 0; i < lista.size(); i++)
      System.out.println(lista.get(i).getNombre() + "*" + lista.get(i).getEdad());
   }
}// main
