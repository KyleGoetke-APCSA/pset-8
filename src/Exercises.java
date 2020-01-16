public class Exercises {

    /*
    HOW TO RUN THIS
    1) cd ~/???/pset8/src
    2) ./grademe.sh biggest
    */

    public boolean commonEnd(int[] a, int[] b) {
        if (a == null || a.length == 0 || b == null || b.length == 0) {
            return false;
        }

        // write your code here
        if ((a[0] == b[0]) || (a[a.length-1] == b[b.length-1])) {
            return true;
        }

        return false;    // default return value to ensure compilation
    }

    public String[] endsMeet(String[] values, int n) {
        String emptyString[] = new String[0];
        if (values == null || n < 0 || values.length < n) {
            return emptyString;
        }

        // write your code here
        String[] combinedString = new String[n * 2];
        int valueOfN = n;

        // go from first boi until nth boi
        for (int i = 0; i < n; i++) {
			combinedString[i] = values[i];
		}

        // go from length - nth boi until last boi
        for (int i = n; i < n * 2; i++) {
			combinedString[i] = values[values.length - valueOfN];
            valueOfN--;
		}

        return combinedString;

        // return null; default return value to ensure compilation
    }

    public int difference(int[] numbers) {
        // input verification
        if (numbers == null || numbers.length < 1) {
            return -1;
        }

        int largestValue = numbers[0];
        int smallestValue = numbers[0];
        // write your code here
        for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largestValue) {
                largestValue = numbers[i];
            }
            if (numbers[i] < smallestValue) {
                smallestValue = numbers[i];
            }
		}

        return largestValue - smallestValue;

        // return -1; // default return value to ensure compilation
    }

    public double biggest(double[] numbers) {
        // input verification

        // write your code here
        // code

        return -1;        // default return value to ensure compilation
    }

    public String[] middle(String[] values) {
        // input verification

        // write your code here
        // code

        return null;    // default return value to ensure compilation
    }

    public boolean increasing(int[] numbers) {
        // input verification

        // write your code here
        // code

        return false;    // default return value to ensure compilation
    }

    public boolean everywhere(int[] numbers, int x) {
        // input verification

        // write your code here
        // code

        return false;    // default return value to ensure compilation
    }

    public boolean consecutive(int[] numbers) {
        // input verification

        // write your code here
        // code

        return false;    // default return value to ensure compilation
    }

    public boolean balance(int[] numbers) {
        // input verification

        // write your code here
        // code

        return false;    // default return value to ensure compilation
    }

    public int clumps(String[] values) {
        // input verification

        // write your code here
        // code

        return -1;        // default return value to ensure compilation
    }
}
