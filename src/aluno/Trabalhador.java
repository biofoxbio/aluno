package aluno;

import javax.swing.JOptionPane;


public class Trabalhador {
    private String cpf;
    private String nome;
    private int idade;
    private String sexo;
    private String end;
    private float salario;

    public Trabalhador(String cpf, String nome, int idade, String sexo, String end, float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.end = end;
        this.salario = salario;
    }

    public Trabalhador() {
        cpf = JOptionPane.showInputDialog(null, "digite seu CPF", "CPF", JOptionPane.INFORMATION_MESSAGE);
        nome = JOptionPane.showInputDialog(null, "digite seu nome", "Nome", JOptionPane.INFORMATION_MESSAGE);
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "digite seu idade", "Idade", JOptionPane.INFORMATION_MESSAGE));
        sexo = JOptionPane.showInputDialog(null, "digite seu sexo", "sexo", JOptionPane.INFORMATION_MESSAGE);
        end = JOptionPane.showInputDialog(null, "digite seu endereço", "Endereço", JOptionPane.INFORMATION_MESSAGE);
        salario = Float.parseFloat(JOptionPane.showInputDialog(null, "digite seu salario ", "Salario", JOptionPane.INFORMATION_MESSAGE));
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    

    
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Trabalhador 1", "Trabalhador 1", JOptionPane.INFORMATION_MESSAGE);
        Trabalhador trabalhador1 = new Trabalhador();
        
        JOptionPane.showMessageDialog(null, "Trabalhador 2", "Trabalhador 2", JOptionPane.INFORMATION_MESSAGE);
        Trabalhador trabalhador2 = new Trabalhador();
        
        JOptionPane.showMessageDialog(null, "Trabalhador 3", "Trabalhador 3", JOptionPane.INFORMATION_MESSAGE);
        Trabalhador trabalhador3 = new Trabalhador();
        
        JOptionPane.showMessageDialog(null, "Trabalhador 4", "Trabalhador 4", JOptionPane.INFORMATION_MESSAGE);
        Trabalhador trabalhador4 = new Trabalhador();
        
        float somador = 0.0f;
        somador +=  trabalhador1.getSalario();
        somador +=   trabalhador2.getSalario();
        somador +=   trabalhador3.getSalario();
        somador +=   trabalhador4.getSalario();
        
        float media = somador/4;
        System.out.println("a media do salario é" + media);
        
        float somadorF = 0.0f;
        if(trabalhador1.getSexo().equalsIgnoreCase("feminino")){
        somadorF += trabalhador1.getSalario();
        }  
        if(trabalhador1.getSexo().equalsIgnoreCase("feminino")){
        somadorF += trabalhador2.getSalario();
        }
        if(trabalhador1.getSexo().equalsIgnoreCase("feminino")){
        somadorF += trabalhador3.getSalario();
        }
        if(trabalhador1.getSexo().equalsIgnoreCase("feminino")){
        somadorF += trabalhador4.getSalario();
        }
    }
}
        
        
    

 

