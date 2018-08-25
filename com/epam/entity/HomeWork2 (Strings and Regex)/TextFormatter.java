package WorkWithStrings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormatter {

    private int necessaryStrLength = 15;

    private final String SUBSTRING_REGEX = "(?<=\\G.{"+ necessaryStrLength +"})";

    private String testText = getText();

    String formattedText = String.format("%-" + necessaryStrLength + "s%n", testText);

    Pattern pattern = Pattern.compile(SUBSTRING_REGEX);
    String[] subStr = pattern.split(formattedText);

    public String getReNewStr(){
        String respacedText = "";
        for(String word:subStr){
            StringBuilder replacerBuider = new StringBuilder();
            replacerBuider.lastIndexOf(" ");
            //Pattern spaceReplacer = Pattern.compile("$(?<=\\s)");
            //Matcher replacer = spaceReplacer.matcher(word);
            //if(replacer.find()){
            respacedText = word.replace(replacerBuider, "\\n");
            //}
        }
        return respacedText;
    }

    public void setNecessaryStrLength(int necessaryStrLength) {
        this.necessaryStrLength = necessaryStrLength;
    }

    private String getText(){
        String readyToInputText = "";
        try(BufferedReader br = new BufferedReader(new FileReader("/home/pavel/Desktop/test"))){
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while(line != null){
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String textForOperations = sb.toString();
            readyToInputText = String.valueOf(sb.append(textForOperations));
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File couldn't find");
        }catch(IOException ioe){
            ioe.printStackTrace();
            System.out.println("Input-Output Error!");
        }
        return readyToInputText;
    }

    public static void main(String[] args) {
        TextFormatter tx = new TextFormatter();
        System.out.println(tx.getReNewStr());
    }
}
