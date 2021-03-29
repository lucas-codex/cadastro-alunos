package cadastrodealunos;

import java.util.ArrayList;


public class Aluno {
    //atributos
    private String nome, cpf;
    private ArrayList<Float> notas = new ArrayList(); 
    
    //metodo construtor
    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //metodos getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Float> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Float> notas) {
        this.notas = notas;
    }
    
    //metodos 
    public void insereNota(float n){
        //metodo para inserir notas
        this.notas.add(n);
    }
    
    public float calculaNotas(){
        //retorna o somatorio das notas
        float somaNotas = 0;
        for (int i = 0; i < this.getNotas().size(); i++){
            somaNotas += this.getNotas().get(i);
        }
        return somaNotas;
    }
    
    public void listar(){
        //lista nome o cpf e todas as notas
        System.out.println("Aluno: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        for (int i = 0; i < this.getNotas().size(); i++){
            System.out.println("Nota " + (i+1) + " -> " + this.getNotas().get(i));
        }
    }
}