public class App {
    /**
     * 
     * Method to add 2 numbers (int)
     */
    private static int sum2Numbers(int num1, int num2){
        return num1 + num2;
    }
    /**
     * Method to add 3 numbers (int)
     */
    private static int sum3Numbers(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * Overloading Examples
     */

    /**
     * 
     * Compute for the sum of 2 numbers (int)
     */
    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }

    /**
     * Compute the sum of three Numbers
     * 
     */

    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }



    public static void main(String[] args) throws Exception {
        System.out.println("Overloading");
        /**
         * Invoke Computation Methods
         */
        System.out.println("The sum of 10 and 68 is " + App.sum2Numbers(10, 68));
        System.out.println("The sum of 10 and 20 and 30 is " + App.sum3Numbers(10, 20, 30));

        /**
         * Calling/Invoking Overload Methods
         */
        System.out.println("----------------------------");
        System.out.println("Overloading Methods");
        System.out.println("The sum of 10 and 68 is " + App.computeSum(10, 68));
        System.out.println("The sum of 10 and 20 and 30 is " + App.computeSum(10, 20, 30));
    }
}
