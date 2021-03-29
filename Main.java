package cadastrodealunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Sala> sal = new ArrayList<> ();
        Sala aula = new Sala();
        String aluno, cpf;
        int opc = -1, quantiNotas, i;
        
        do{
            System.out.println("Escolha uma opção\n1 - Inserir\n2 - Listas\n3 - Situações\n0 - Sair");
            System.out.print("Opção: ");
            opc = teclado.nextInt();
            
            switch (opc) {
                case 1 -> {
                    //inserir aluno
                    teclado.nextLine();
                    System.out.print("Aluno: ");
                    aluno = teclado.nextLine();
                    System.out.print("CPF: ");
                    cpf = teclado.nextLine();
                    System.out.print("Quantidade de notas: ");
                    quantiNotas = teclado.nextInt();
                    float notas[] = new float[quantiNotas];
                    for ( i = 0; i < quantiNotas; i++){
                        System.out.print("Nota " + (i+1) + ": ");
                        notas[i] = teclado.nextFloat();
                    }
                    
                    Aluno al = new Aluno(aluno, cpf);
                    for ( i = 0; i < quantiNotas; i++){
                        al.insereNota(notas[i]);
                    }
                    aula.insereAluno(al);
                    break;
                }
                
                case 2 -> {
                    //listar aluno
                    aula.listarTodos();
                    break;
                }
                
                case 3 -> {
                    //situação do aluno
                    aula.verSituacao();
                    break;
                }
                
                case 0 -> {
                    //sair
                    System.out.println("Saindo...");
                    break;
                }
                
                default -> {
                    System.out.println("Valor digitado está incorrento, tente outro");
                }
            }
        }while (opc != 0);
    }
    
}
