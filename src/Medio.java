public class Medio extends Aluno{

    private String espec;

    Medio(String nome, String espec){
        this.nome= nome;
        this.espec= espec;
    }
    public void mostrarAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Status: " + situacao);
        System.out.println("Especificação: "+ espec);
    }
}
