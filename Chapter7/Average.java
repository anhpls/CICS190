import java.util.Scanner;


public class Average {

    private int [] data;
    private double mean;

    public Average()
    {
        Scanner keyb = new Scanner(System.in);
        data = new int[5];

        for (int i = 0; i < data.length; i++)
        {
            System.out.println("\nEnter a number for Score " + (i+ 1) + ":");
            data[i] = keyb.nextInt();
        }

        calculateMean();
        selectionSort();
    }

    public void calculateMean()
    {
        int sum = 0;
        for (int num : data)
        {
           sum += num;
        }
        mean = sum / data.length;
    }

    public String toString()
    {
        String dataValues = "\nScores: \n";
        for (int score : data) 
        {
            dataValues += score + "\n";
        }
        dataValues += "\nThe mean is " + mean;
        return dataValues;
    }


    public void selectionSort()
    {
    int startScan, index, maxIndex, maxValue;
    
    // outer for loop to move through array
    for (startScan = 0; startScan < (data.length - 1); startScan++)
    {
        maxIndex = startScan; // assume first index has the max value 
        maxValue = data[startScan]; // store the maximum value

        // inner for loop to find the maximum value
        for (index = startScan + 1; index < data.length; index++) 
        {
            if (data[index] > maxValue) // see if the current number is > max value 
            {
                maxValue = data[index]; // update the new max value 
                maxIndex = index; // index of max value gets updated
            }
        }


        data[maxIndex] = data[startScan]; 
        data[startScan] = maxValue; 
    }

    }
}
