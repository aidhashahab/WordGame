package gameWord;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class QuestionGenerator {

    public static List<WordModel> createQuestionInCollection() {
        // bank soal yg berbentuk arraylist
        ArrayList<WordModel> bankSoal = new ArrayList<>();// taro di luar biar scop nya bisa digunakan di luar
        // arraylist di isi dengan soal dan hint di bawah ini 
        try {
        Scanner scan = new Scanner(new File("C:/DEV/BankSoal.txt")); // hanya membuka

            while (scan.hasNextLine()) { // ada baris gak? kalo ada di proses di bawah
                String question = scan.nextLine(); // baris pertama di ambil sebaris
                String[] data = question.split(","); // di split memisahkan menjadi 2 bagian, soal dan hint
                
                
                String questionGame = data[0];
                String hintGame = data[1];

                WordModel wm = new WordModel(questionGame, hintGame);
                bankSoal.add(wm); //soal dan hint dimasukkan ke wm yaitu wordmodel
            }
            for (WordModel item : bankSoal) {
                System.out.println(item);
            }

        } catch  (FileNotFoundException ex)  {
                Logger.getLogger(QuestionGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bankSoal;
        }
}
