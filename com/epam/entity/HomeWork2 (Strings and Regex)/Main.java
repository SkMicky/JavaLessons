package WorkWithStrings;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("/home/pavel/Desktop/test"))){
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while(line != null){
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String textForOperations = sb.toString();
            System.out.println(textForOperations);
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File couldn't find");
        }catch(IOException ioe){
            ioe.printStackTrace();
            System.out.println("Input-Output Error!");
        }

        //**  VARIANT A  TASK 19    **//
        /*StringEditor stringEditor = new StringEditor();
        stringEditor.textConvertation("котозябра", 3);*/

        //** VARIANT B   TASK 16    **//
        /*WordConverter wordConverter = new WordConverter();
        wordConverter.convertation();*/

        //**  VARIANT C   TASK 8     **//
        /*TextFormatter textFormatter = new TextFormatter();
        System.out.println(textFormatter.getReNewStr());*/
    }
}
