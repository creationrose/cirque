import java.util.ArrayList;

/**
 * Write a description of class PerformerData here.
 *
 * @author Jessica Hori
 * @version 2015.12.03
 */
public class PerformerData
{
    private ArrayList<Integer> numPerformerData;

    /**
     * Constructor for objects of class PerformerData
     */
    public PerformerData()
    {
        numPerformerData = new ArrayList<>();
        populateData();
    }

    /**
     * @return array list of number of children data
     */
    public ArrayList<Integer> getPerformerData()
    {
        return numPerformerData;
    }

    /**
     * Add number of performer data to the array list
     * Each entry is the reported age of performer
     */
    private void populateData()
    {
        numPerformerData.add(28);
        numPerformerData.add(25);
        numPerformerData.add(39);
        numPerformerData.add(31);
        numPerformerData.add(20);
        numPerformerData.add(33);
        numPerformerData.add(27);
        numPerformerData.add(30);
        numPerformerData.add(21);
        numPerformerData.add(36);
        numPerformerData.add(22);
        numPerformerData.add(34);
        numPerformerData.add(46);
        numPerformerData.add(52);
        numPerformerData.add(39);
        numPerformerData.add(26);
        numPerformerData.add(36);
        numPerformerData.add(24);
        numPerformerData.add(32);
        numPerformerData.add(46);
        numPerformerData.add(48);
        numPerformerData.add(33);
        numPerformerData.add(45);
        numPerformerData.add(31);
        numPerformerData.add(37);
    }
}