import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 * Main application for the Data Analysis Mini‑Project.
 *
 * TODO:
 *  - Update the path to your dataset file
 *  - Read the CSV file using Scanner
 *  - Parse each row and extract the correct columns
 *  - Construct Data objects from each row
 *  - Store them in an array
 *  - Write methods to analyze the dataset (min, max, average, filters, etc.)
 *  - Print insights and answer your guiding question
 *  - Add Javadoc comments for any methods you create
 */
public class App {

    public static void main(String[] args) throws FileNotFoundException{

        // TODO: Update this with your CSV file path
        File file = new File("StateData2020-CDC-Census(StateData2020-CDC-Census).csv");
        Scanner scan = new Scanner(file);
        scan.nextLine(); // Skip header line
        int i = 0;
        StateDrugData[] stateDrugDatas = new StateDrugData[52];
        while(scan.hasNext()){
            String[] line = scan.nextLine().split(",");
            StateDrugData newData = new StateDrugData(line[0], Double.parseDouble(line[5]), Integer.parseInt(line[6]));
            stateDrugDatas[i] = newData;
            i++;
        }
        System.out.println(StateDrugData.getHighestDrugDeathRate(stateDrugDatas));
        System.out.println(StateDrugData.getAverageDrugDeathRate(stateDrugDatas));
        scan.close();
   
    }


}