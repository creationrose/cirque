import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * Receive manual data on Cirque du Soleil performers and analyze age patterns
 * @author Jessica Hori
 * @version 2015.12.03
 */

public class PerformerDataDisplay
{
    private Map<AGE_CATEGORY, Integer> categoryMap = new EnumMap<AGE_CATEGORY, Integer>(AGE_CATEGORY.class);
    private enum AGE_CATEGORY {
        TWENTY_TO_TWENTY_NINE,
        THIRTY_TO_THIRTY_NINE,
        FORTY_PLUS };


   public static void main(String[] args)
   {
     PerformerDataDisplay pdd = new PerformerDataDisplay();
     PerformerData pd = new PerformerData();

     pdd.displayData();
   }

    /**
     * Constructor for performers
     */
    public PerformerDataDisplay()
    {
      for(AGE_CATEGORY category: AGE_CATEGORY.values()) {
           categoryMap.put(category, 0);
      }
      analyzeData(new PerformerData().getPerformerData());
    }

    /**
     * Display data for the number of performers
     */
    public void displayData()
    {
        System.out.println("------------------ Number of Performers --------------------");
        System.out.println("Counts show number of adults in each age bracket");
        System.out.println("20-29 : " + categoryMap.get(AGE_CATEGORY.TWENTY_TO_TWENTY_NINE));
        System.out.println("30-39 : " + categoryMap.get(AGE_CATEGORY.THIRTY_TO_THIRTY_NINE));
        System.out.println("40+ : " + categoryMap.get(AGE_CATEGORY.FORTY_PLUS));
        System.out.println("---------------------------------------------------------------");
     }

     /**
     * Analyze the number of performer data by filling in the array
     */
     private void analyzeData(List<Integer> performerData) {
        for (Integer numPerformers : performerData) {
          AGE_CATEGORY category = getCategory(numPerformers);
          Integer currentCount = categoryMap.get(category);
          categoryMap.put(category, ++currentCount);
        }
     }

    /**
     * Logic for returning the correct number of performers
     */
    private AGE_CATEGORY getCategory(int numPerformer) {
        if(numPerformer >= 20 && numPerformer <=29) {
            return AGE_CATEGORY.TWENTY_TO_TWENTY_NINE;
        }
        if(numPerformer >=30 && numPerformer <=39) {
            return AGE_CATEGORY.THIRTY_TO_THIRTY_NINE;
        }
        return AGE_CATEGORY.FORTY_PLUS;
    }
}

