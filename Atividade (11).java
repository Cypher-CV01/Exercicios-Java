import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Tarefa implements Comparable<Tarefa> {
    String titulo;

    public Tarefa(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int compareTo(Tarefa outra) {
        
        return this.titulo.compareTo(outra.titulo);
    }

    @Override
    public String toString() {
        return titulo;
    }
}

public class TarefaSorter {
    public static void main(String[] args) {
        List<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(new Tarefa("Estudar"));
        tarefas.add(new Tarefa("Almocar")); 
        tarefas.add(new Tarefa("Dormir"));

        Collections.sort(tarefas);

        System.out.println(tarefas);
    }
}