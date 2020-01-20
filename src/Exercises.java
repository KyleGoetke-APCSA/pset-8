public class Exercises {

    /*
    HOW TO RUN THIS
    1) cd ~/???/pset8/tests
    2) ./grademe.sh biggest
    */

    public boolean commonEnd(int[] a, int[] b) {
        // input verification
        if (a == null || a.length == 0 || b == null || b.length == 0) {
            return false;
        } else if ((a[0] == b[0]) || (a[a.length-1] == b[b.length-1])) {
            return true;
        } else {
            return false;
        }
    }

    public String[] endsMeet(String[] values, int n) {
        // input verification
        String emptyString[] = new String[0];
        if (values == null || n < 0 || values.length < n) {
            return emptyString;
        }

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
    }

    public int difference(int[] numbers) {
        // input verification
        if (numbers == null || numbers.length < 1) {
            return -1;
        }

        // write your code here
        int largestValue = numbers[0];
        int smallestValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largestValue) {
                largestValue = numbers[i];
            }
            if (numbers[i] < smallestValue) {
                smallestValue = numbers[i];
            }
		}

        return largestValue - smallestValue;
    }

    public double biggest(double[] numbers) {
        // input verification
        if (numbers == null || numbers.length % 2 == 0 || numbers.length < 3) {
            return -1;
        }

        for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
                return -1;
            }
		}

        // write your code here
        double firstElement = numbers[0];
        double lastElement = numbers[numbers.length - 1];
        double middleElement = numbers[(int) Math.floor(numbers.length / 2)];

        double maximum = (firstElement > middleElement && firstElement > lastElement) ? firstElement :
	 	(middleElement > lastElement) ? middleElement :
	 	lastElement;
	 	return maximum;


        // return -1;        // default return value to ensure compilation
    }

    public String[] middle(String[] words) {
        //input verification
        String[] empty = new String[0];
        if (words == null) {
            return empty;
        } else if (words.length < 3 || words.length % 2 == 0) {
            return empty;
        }
        for (int i = 0; i < words.length; i++) {
            boolean containsNull = false;
            containsNull = (words[i] == null) ? true : false;
            if (containsNull) {
                return empty;
            }
        }
        String[] finalArray = new String[3];
        finalArray[0] = words[(int) Math.floor(words.length / 2) - 1];
        finalArray[1] = words[(int) Math.floor(words.length / 2)];
        finalArray[2] = words[(int) Math.floor(words.length / 2) + 1];
	 	return finalArray;
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
