import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();
        System.out.println("Digite sua primeira nota: ");
        a1.setN1(sc.nextDouble());
        System.out.println("Digite sua segunda nota: ");
        a1.setN2(sc.nextDouble());
        System.out.println("Digite sua terceira nota: ");
        a1.setN3(sc.nextDouble());
        a1.calculo_media();
        System.out.println("Sua média é: " + a1.getMedia());

        a1.calculo_media();
        if (a1.getMedia() >= 7){
            System.out.println("Parabéns! Você foi aprovado.");
        }else if (a1.getMedia() < 7 && a1.getMedia() >= 4){
            System.out.println("Infelizmente você foi reprovado.");
        }else {
            System.out.println("Você está na final.");
        }
    }
}