public class Aluno {
    protected String nome;
    protected double prova1;
    protected double prova2;
    protected double media;
    protected String situacao;
//getter
    public double getMedia() {
        return this.media;
    }
    //funçao
    public double calcularMedia() {
        this.media = (prova1 + prova2) / 2;
        return this.media;
    }
//funcao
    public String verificarSituacao() {
        if (this.media >= 7.0) return "Aprovado";
        return "Reprovado";
    }

    public void mostrarAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Status: " + situacao);
    }

}
