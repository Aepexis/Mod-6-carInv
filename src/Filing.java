import java.io.File;
import java.io.IOException;

public class Filing {

    public static void main (String[] args){
        try{
            File vehicleFile = new File(vehicleFile.txt);
            if (vehicleFile.createNewFile()){
                System.out.println("File created: " + vehicleFile.getName());
            } else{
                System.out.println("File already exists");
            }
        } catch (IOException e){
            System.out.println("Error occurred writing file");
            e.printStackTrace();
        }
    }


    }
}
