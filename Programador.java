public class Programador {
    private String linguagem;

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public void informarLinguagem() {
        System.out.println("A linguagem utilizada é: " + linguagem);
    }
}
