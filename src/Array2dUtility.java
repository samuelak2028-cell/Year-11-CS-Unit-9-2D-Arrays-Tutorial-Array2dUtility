
public class Array2dUtility {
    public static void print (int[][] array) {
        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }

    public static int sum (int[][] array) {
        int sum = 0;
        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static double average (int[][] array) {
        return ((double)sum(array)/(array.length*array.length));
    }

    public static int minimum (int[][] array) {
        int minimum = array[0][0];
        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                if (array[i][j] <= minimum) {
                    minimum = array[i][j];
                }
            }
        }
        return minimum;
    }

    public static int maximum (int[][] array) {
        int maximum = array[0][0];
        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                if (array[i][j] >= maximum) {
                    maximum = array[i][j];
                }
            }
        }
        return maximum;
    }

    public static int evenCountStandard (int[][] array) {
        int evens = 0;
        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    evens++;
                }
            }
        }
        return evens;
    }

    public static int evenCountEnhanced (int[][] array) {
        int evens = 0;
        for (int[] row : array) {
            for (int element : row) {
                if (element % 2 == 0) {
                    evens++;
                }
            }
        }
        return evens;
    }

    public static boolean allPositive (int[][] array) {
        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length; j++){
                if (array[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] rowSums (int[][] array) {
        int[] result = new int[array.length];
        for (int i = 0; i<array.length; i++) {
            int sum = 0;
            for (int j = 0; j<array[i].length; j++){
                sum += array[i][j];
            }
            result [i] = sum;
        }
        return result;
    }

    public static int[] colSums (int[][] array) {
        int[] result = new int[array[0].length];
        for (int i = 0; i<array[0].length; i++) {
            int sum = 0;
            for (int j = 0; j<array.length; j++){
                sum += array[j][i];
            }
            result [i] = sum;
        }
        return result;
    }
    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.

}
