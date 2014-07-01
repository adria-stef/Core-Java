package com.hackbulgaria.corejava;

import java.util.Arrays;
import java.util.Stack;

public class Problems2Impl implements Problems2 {

    @Override
    public boolean isOdd(int number) {
        return (number % 2 != 0);
    }

    @Override
    public boolean isPrime(int number) {
        if (number == 0) {
            System.out.println("Neither even, nor odd!");
        }

        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    @Override
    // test fixed
    public int min(int... array) {
        if (array.length == 0) {
            System.out.println("Empty input!");
            return 0;
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public int kthMin(int k, int[] array) {
        Arrays.sort(array);
        return array[k - 1];
    }

    @Override
    public float getAverage(int[] array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    // @Override
    // fails miserably
    // fixed
    // too damn slow
    @Override
    public long getSmallestMultiple(int upperBound) {
        // long multiple = 1;
        //
        // for (long i = upperBound; i >= 1; i--) {
        // multiple *= i;
        // }
        // for (int i = 1; i <= multiple; i++) {
        // boolean isMultiple = true;
        // for (int j = 2; j < upperBound; j++) {
        // if (i % j != 0) {
        // isMultiple = false;
        // }
        // }
        //
        // if (isMultiple) {
        // return i;
        // }
        // }
        // definitely the slowest thing ever
        // long largestMultiple = 1;
        // for (long i = 1; i <= upperBound; i++) {
        // largestMultiple *= i;
        // }
        //
        // long smallestMultiple = 1;
        // // optimize!
        // int[] divisors = new int[upperBound];
        // for (int i = upperBound; i >= 1; i--) {
        // for (int j = 1; j <= i; i++) {
        //
        // for (int k = 0; k < divisors.length; k++) {
        // if (i % j == 0) {
        // divisors[k] = j;
        // }
        // }
        //
        // for (int l = 0; l <= divisors.length; l++)
        // if (smallestMultiple % j != 0) {
        // smallestMultiple *= divisors[l];
        // }
        //
        // }
        // }
        // return smallestMultiple;
        long result = 1;
        for (int i = 2; i <= upperBound; i++) {
            int[] divisors = getDivisors(i);
            int pointer = 0;
            while (result % i != 0) {
                result *= divisors[pointer++];
            }
        }
        return result;
    }

    private static int[] getDivisors(int number) {
        int[] divisors = new int[number];
        int pointer = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                divisors[pointer++] = i;
                number /= i;
                i--;
            }
        }
        return divisors;
    }

    @Override
    public boolean isPalindrome(String argument) {
        int n = argument.length();
        for (int i = 0; i < (n / 2) + 1; ++i) {
            if (argument.charAt(i) != argument.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    // TODO write a smarter one
    @Override
    public boolean isPalindrome(int number) {
        long numberLong = (long) number;
        return isPalindrome(numberLong);

    }

    public boolean isPalindrome(long number) {
        int lenght = String.valueOf(number).length();
        long[] array = new long[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = number % 10;
            number = number / 10;

        }
        boolean flag;
        for (int i = 0; i < lenght; i++) {
            if (array[i] == array[lenght - i - 1]) {
                flag = true;
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public long getLargestPalindrome(long N) {
        for (long i = N; i > 1; i--) {
            if (isPalindrome(i)) {
                return i;
            } else {
                continue;
            }
        }
        return -1;
    }

    @Override
    public int[] histogram(short[][] image) {
        int a = image.length;
        int b = image[0].length;
        int[] result = new int[a * b + 1];

        short check = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                check = image[i][j];
                result[check] = result[check] + 1;
            }
        }
        return result;
    }

    @Override
    public long pow(int a, int b) {
        long result = a ^ b;
        return result;
    }

    @Override
    public int getOddOccurrence(int[] array) {

        Stack<Integer> stackOfIntegers = new Stack<>();

        for (int i = 0; i < array.length; i++) {

            if (!(stackOfIntegers.contains(array[i]))) {
                stackOfIntegers.push(array[i]);
            } else {
                stackOfIntegers.pop();
            }
        }
        if (!(stackOfIntegers.isEmpty())) {
            Integer result = stackOfIntegers.pop();
            return result;
        } else {
            return -1;
        }
    }

    @Override
    public long maximalScalarSum(int[] a, int[] b) {

        if (a.length != b.length) {
            return -1;
        }

        int[] max = new int[a.length];
        int maxx = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                int n = a[i] * b[j];
                if (maxx < n) {
                    maxx = n;
                }
            }
            max[i] = maxx;
        }
        int sum = 0;
        for (int c = 0; c < max.length; c++) {
            sum = sum + max[c];
        }
        return sum;
    }

    @Override
    public long doubleFac(int n) {
        // TODO Auto-generated method stub
        return 0;
    }

    public long factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    @Override
    public long kthFac(int k, int n) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maxSpan(int[] array) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean canBalance(int[] array) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseMe(String argument) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String copyEveryChar(String input, int k) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseEveryWord(String arg) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getPalindromeLength(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String decodeURL(String input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int sumOfNumbers(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        // TODO Auto-generated method stub
        return false;
    }

}
