
package aluno;


public class Aluno { // atributos
    //"private" significa que so podemos ver os atributos dentro do escopo da classe
    //"protect"permite vizualizar os atribulos da classe no messmo pacote 
    private String nome;
    private String RGM;
    private float a1;
    private float a2;
    private float media;

    public Aluno(String nome, String RGM, float a1, float a2, float media) {
        this.nome = nome;
        this.RGM = RGM;
        this.a1 = a1;
        this.a2 = a2;
        this.media = media;
    }
//"set" vc adiciona a informacao "get"pega a informacao
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRGM() {
        return RGM;
    }

    public void setRGM(String RGM) {
        this.RGM = RGM;
    }

    public float getA1() {
        return a1;
    }

    public void setA1(float a1) {
        this.a1 = a1;
    }

    public float getA2() {
        return a2;
    }

    public void setA2(float a2) {
        this.a2 = a2;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome = " + nome + ", RGM = " + RGM + ", a1 = " + a1 + ", a2 = " + a2 + ", media = " + media + '}';
    }
    
    public void calculoMedia(){ // metodo para calcular "if = se" "else = senão"
        
        media= a1 = a2;
        if(media >=3 || media <= 10){
        System.out.println("Aprovado");
    }else{
            System.out.println("Reprovado");
    }
}
    
    public static void main(String[] args) {
        
        Aluno objaluno1 = new Aluno("kaue", "21964521", 1.0f, 2.0f, 0 );
        objaluno1.calculoMedia();
        System.out.println("Os dados são:" + objaluno1.toString());
        
    }
    
}
