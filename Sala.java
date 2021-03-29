package cadastrodealunos;

import java.util.ArrayList;

public class Sala {
    //atributos
    private ArrayList<Aluno> listaAlunos;

    //metodo construtor
    public Sala() {
        this.listaAlunos = new ArrayList<Aluno>();
    }

    //metodos getter and setter

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
    
    //metodos
    public void insereAluno(Aluno a){
        //Adiciona um aluno a sala
        this.listaAlunos.add(a);
    }
    
    public void listarTodos(){
        //mostrar nome cpf e todas as notas dos alunos
        for (int i = 0; i < this.listaAlunos.size(); i++){
            System.out.println("-------------------------");
            listaAlunos.get(i).listar();
            System.out.println("\n");
        }
    }
    
    public void verSituacao(){
        //mostra nome mais somatorio de notas e situação
        //aprovado >=70 reprovado <70 dos alunos
        for (int i = 0; i < this.listaAlunos.size(); i++){
            System.out.println("-------------------------");
            System.out.println("Nome: " + listaAlunos.get(i).getNome());
            float somatorioNotas = listaAlunos.get(i).calculaNotas();
            System.out.println("Soma das notas: " + somatorioNotas);
            if (somatorioNotas >= 70){
                System.out.println("APROVADO");
            }else{
                System.out.println("REPROVADO");
            }
            System.out.println("\n");
        }
    }
}
