public class StartSitCalculator {

    public static void main(String[] args) {
        float[] userPoints;
        userPoints = new float[16];
        userPoints[0] = Float.parseFloat(args[0]);
        try {
            System.out.println(userPoints[0]);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Please supply an integer to parse");
            System.exit(1);
        }    
    }
}