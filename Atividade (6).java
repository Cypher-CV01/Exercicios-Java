public class Livro {
    String titulo;
    boolean emprestado; 

    public void emprestar() {
        this.emprestado = true;
    }

    public String status() {
        if (this.emprestado) {
            return "Indisponivel";
        }
        return "Disponivel";
    }

    public static void main(String[] args) {
        Livro l = new Livro();
        l.titulo = "Java para Iniciantes"; 

        
        System.out.println(l.status()); 
        l.emprestar();

        
        System.out.println(l.status()); 
    }
}