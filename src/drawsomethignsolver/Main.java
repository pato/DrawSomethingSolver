package drawsomethignsolver;
/**
 * @author Patricio Lankenau
 */

import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Main {
    private static Scanner file;
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //
        out.println("DrawSomethingSolver");
        out.print("Number of letters in the word: ");
        int count = Integer.parseInt(in.nextLine());
        out.print("Your letters: ");
        //String[] letters = in.nextLine().split(" ");
        String letters = in.nextLine();
        try{
            file = new Scanner(new File("length"+count+".txt"));
        }catch (Exception e){
            err.println(e);
        }
        while (file.hasNextLine()){
            String word = file.nextLine();
            for (int i=0;i<count;i++){
                //out.println("word: "+word+" | charAt:"+word.charAt(i));
                if (!letters.contains(""+word.charAt(i))){
                    break;
                }else if (i==count-1){
                    out.println(word);
                }
            }
        }

    }
    
}
