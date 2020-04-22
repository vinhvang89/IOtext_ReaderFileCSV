import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reader {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            String path = "E:\\Codegym\\Module 2\\Week9\\IOtext_Reader_csvFile\\abc.csv";
            String line = " ";
            String csvSplitBy = ",";
            File file = new File(path);
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null ){
                String[] country = line.split(csvSplitBy);
                System.out.println("Country [code= " + country[0] + " , name=" + country[5] + "]");
            }
            br.close();
        } catch (Exception e){
            System.out.println("Máy hỏng cmnr , vứt mẹ đê ");
        }

    }
}
