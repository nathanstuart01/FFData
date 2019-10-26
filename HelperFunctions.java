import java.lang.Math;

public class HelperFunctions {
    
    public double calculateStandardDeviation(float[] points){
        float meanPointsAgainst = calculateMean(points);
        float[] data;
        data = new float[points.length];
        for (int i = 0; i <points.length; i ++) {
            float x = points[i];
            float y = (x - meanPointsAgainst);
            float z = (y * y);
            data[i] = z; 
        }
        float meanSquaredDifferences = calculateMean(data);

        double standardDeviation;

        standardDeviation = Math.sqrt(meanSquaredDifferences);

        return standardDeviation;
    }

    public float calculateMean(float[] points){
        float totalPoints = 0;
        for (int i = 0; i < points.length; i ++) {
            totalPoints += points[i];
        }
        float meanPoints = totalPoints / points.length;
        return meanPoints;
    }

    //maybe figure out how to determine if the dataset is normal?

    public static void main(String[] args) {
        HelperFunctions test = new HelperFunctions();
        float[] pointsAgainst;
        int weeksPlayed = 7;
        pointsAgainst = new float[weeksPlayed]; 
        pointsAgainst[0] = 12.30f;
        pointsAgainst[1] = 3.50f;
        pointsAgainst[2] = 9.90f;
        pointsAgainst[3] = 10.10f;
        pointsAgainst[4] = 0.00f;
        pointsAgainst[5] = 11.20f;
        pointsAgainst[6] = 2.00f;
        double teRangeOutcomes = test.calculateStandardDeviation(pointsAgainst);
        System.out.println(teRangeOutcomes);
    }

}