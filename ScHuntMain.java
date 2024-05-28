import java.util.Scanner;
public class ScHuntMain {
    public static void main(String[] args) {
        ScavengerHuntGame soal = new ScavengerHuntGame();
        soal.addNodeScHunt("\nSiapakah penemu telepon?", "Alexander Graham Bell");
        soal.addNodeScHunt("\nApa nama ibukota Amerika Serikat?", "Washington D.C.");
        soal.addNodeScHunt("\nLagu Fearless dinyanyikan oleh?", "Taylor Swift");
        soal.addNodeScHunt("\nSiapa nama bapak pramuka di Indonesia?", "Sri Sultan Hamengkubuwono IX");
        
        Scanner sc26 = new Scanner(System.in);

        String jawaban;
        do {
            soal.resetCurrentPoint();
            while (soal.getCurrentQuestion() != null){
                System.out.println("Pertanyaan: "+ soal.getCurrentQuestion());
                System.out.print("Jawaban: ");
                jawaban = sc26.nextLine();
                if (soal.checkAnswer(jawaban)){
                    System.out.println("Jawaban benar!! Lanjut ke pertanyaan berikutnya.");
                } else {
                    System.out.println("Jawaban salah! Coba lagi.");
                }
            }
            System.out.println("Hore! Kamu menemukan harta karun.");
            break;
        } while (true);
    }
}