/**
 * Represents one row from your dataset.
 *
 * TODO:
 *  - Rename the class to match your dataset (e.g., Pokemon, StateData, CountryStat)
 *  - Add at least 3 private attributes based on your CSV columns
 *  - Write a constructor that initializes all attributes
 *  - Add getter methods for the attributes you need in your analysis
 *  - Override toString() to display the object's data
 *  - Add Javadoc comments for the class and all methods
 */
public class StateDrugData {

    private String stateName;
    private double drugDeathRate;
    private int totalDrugDeaths;

    public StateDrugData(String stateName, double drugDeathRate, int totalDrugDeaths){
        this.stateName = stateName;
        this.drugDeathRate = drugDeathRate;
        this.totalDrugDeaths = totalDrugDeaths;
    }

    public double get_drugDeathRate(){
        return drugDeathRate;
    }

    public String get_stateName(){
        return stateName;
    }

    public int get_totalDrugDeaths(){
        return totalDrugDeaths;
    }

    public static String getHighestDrugDeathRate(StateDrugData[] dataSet){
        double max = Double.NEGATIVE_INFINITY;
        String stateName = "";
        for(int i = 0; i < dataSet.length; i++){
            if(dataSet[i].get_drugDeathRate() > max){
                stateName = dataSet[i].get_stateName();
                max = dataSet[i].get_drugDeathRate();
            }
        }
        return("The highest drug death rate is " + (int)max + "/100k people in " + stateName + ".");
    }

    public static String getAverageDrugDeathRate(StateDrugData[] dataSet){
        double average = 0;
        for(int i = 0; i < dataSet.length;i++){
            average += dataSet[i].get_drugDeathRate();
        }
        average = average/dataSet.length;
        return("The average drug death rate is " + (int)average + "/100k people across all states.");

    }



    public String toString(){
        return(stateName + " has a total of " + totalDrugDeaths + " and a drug death rate of " + drugDeathRate + ".");
    }




}