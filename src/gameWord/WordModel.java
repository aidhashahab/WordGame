/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameWord;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author user
 */
public class WordModel {

    private String basicWord;
    private String soal;
    private String hint;
    private String jawaban;

    public WordModel() {
    }

    public WordModel(String basicWord, String hint) {
        this.basicWord = basicWord;
        this.hint = hint;
       }

    
    public String createSoal() {
        basicWord = basicWord.toUpperCase();
        String[] arrayOfWord = basicWord.split("");
        Arrays.sort(arrayOfWord);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayOfWord.length; i++) {
            sb.append(arrayOfWord[i]);
        }
        String soal = sb.toString(); 
        return soal;
    }

    public String acakHuruf(){
        basicWord = basicWord.toUpperCase();
        String[] arrayOfWord = basicWord.split("");
        List<String> hurufHuruf = Arrays.asList(arrayOfWord);
        Collections.shuffle(hurufHuruf);
        
        StringBuilder sb = new StringBuilder();
        for (String huruf : hurufHuruf) {
            sb.append(huruf);
        }
        return sb.toString();
    }
    
    public boolean cekJawaban(){
        boolean hasil = false;
        if( jawaban.equalsIgnoreCase(basicWord)){
            hasil = true;
        }
        return hasil;
    }

    public String getSoal() {
        return soal;
    }
    
    public void setSoal(String soal) {
        this.soal = soal;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getBasicWord() {
        return basicWord;
    }

    public void setBasicWord(String basicWord) {
        this.basicWord = basicWord;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    @Override
    public String toString() {
        return this.basicWord + this.hint; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
