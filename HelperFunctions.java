import java.lang.Math;

public class HelperFunctions {
    
    static double calculateStandardDeviation(float[] points){
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

    static float calculateMean(float[] points){
        float totalPoints = 0;
        for (int i = 0; i < points.length; i ++) {
            totalPoints += points[i];
        }
        float meanPoints = totalPoints / points.length;
        return meanPoints;
    }

    //maybe figure out how to determine if the dataset is normal?
}