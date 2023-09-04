import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n=3;
        Aluno[] aluno = new Aluno[n];
        Scanner leitura = new Scanner(System.in);
        int i;
        
        for(i=0; i<n; i++){
            aluno[i] = new Aluno();
            System.out.printf("Digite o nome do aluno %d:", i+1);
            aluno[i].nome=leitura.nextLine();
            System.out.printf("Digite o email do aluno %d:", i+1);
            aluno[i].email=leitura.nextLine();
            System.out.printf("Digite a matricula do aluno %d:", i+1);
            aluno[i].matricula=leitura.nextInt();
            System.out.printf("Digite o ano letivo do aluno %d:", i+1);
            aluno[i].anoLetivo=leitura.nextInt();
            System.out.printf("Digite a idade do aluno %d:", i+1);
            aluno[i].idade=leitura.nextInt();
            if(i==n-1){
                leitura.close(); 
            } else {
                leitura.nextLine();
            }
        }
        for(i=0; i<n; i++){
            System.out.printf("Dados do aluno %d\n Nome: %s\n email: %s\n matricula: %d\n ano letivo: %d\n idade: %d\n", i+1, aluno[i].nome, aluno[i].email, aluno[i].matricula, aluno[i].anoLetivo, aluno[i].idade);
        }
    }
}