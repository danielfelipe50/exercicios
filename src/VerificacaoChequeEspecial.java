import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o saldo atual da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o valor que deseja sacar: ");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
            // Verificar se o saque ultrapassa o limite do cheque especial
           // Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
        } else if(saque>(saldo+limiteChequeEspecial)) {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            
            
             // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
        }
        else{
          System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
          
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}