package ReverseFileContent;

import java.io.*;

public class ReverseContent {

    public void reverseContent(String inputFile, String outputFile) throws IOException {
        BufferedReader reader = readFile(inputFile);
        String outputString = reverseContent(reader);
        write(outputString , outputFile);


    }

    private void write(String outputString, String outputFile) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        writer.write(outputString);
    }

    BufferedReader readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        return reader;
     }

     String reverseContent(BufferedReader reader) throws IOException {
         String output = "";
        try {
            StringBuilder sb = new StringBuilder();
            for(String line = reader.readLine();line!=null;line=reader.readLine())
            {
                sb.append(line);
            }
            output  = sb.reverse().toString();
        } finally {
            reader.close();
        }
        return output;
     }

}
