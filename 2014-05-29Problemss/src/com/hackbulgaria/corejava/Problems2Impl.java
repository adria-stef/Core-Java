package com.hackbulgaria.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    @Override
    public long getSmallestMultiple(int upperBound) {
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
        for (int i = 0; i < lenght; i++) {
            if (array[i] == array[lenght - i - 1]) {
                continue;
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

        if (b == 0) {
            return 1;
        } else {
            return a * pow(a, b - 1);
        }
    }

    @Override
    public int getOddOccurrence(int[] array) {

        List<Integer> listOfIntegers = new ArrayList<>();

        for (Integer integer : array) {
            if (listOfIntegers.contains(integer)) {
                int index = listOfIntegers.indexOf(integer);
                listOfIntegers.remove(index);
            } else {
                listOfIntegers.add(integer);
            }
        }

        if (listOfIntegers.isEmpty()) {
            return -1;
        } else {
            return listOfIntegers.get(0);
        }
    }

    // fix
    @Override
    public long maximalScalarSum(int[] a, int[] b) {

        if (a.length != b.length) {
            return -1;
        }

        int maxx = 0;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                int n = a[i] * b[j];
                if (maxx < n) {
                    maxx = n;
                }
            }

            sum = sum + maxx;
            maxx = 0;
        }

        return sum;
    }

    @Override
    public long doubleFac(int n) {
        long singleFac = factorial(n);
        return factorial(singleFac);
    }

    public static long factorial(long n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    @Override
    public long kthFac(int k, int n) {
        long kthFac = n;
        for (int i = 0; i < k; i++) {
            kthFac = factorial(kthFac);
        }
        return kthFac;
    }

    @Override
    public int maxSpan(int[] array) {
        int maxspan = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (maxspan < j - i + 1) {
                        maxspan = j - i + 1;
                    }
                }
            }
        }
        return maxspan;
    }

    @Override
    public boolean canBalance(int[] array) {
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = i; k < array.length; k++) {
                    firstSum += array[j];
                    secondSum = array[k];
                    if (firstSum == secondSum) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // condition
    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseMe(String argument) {
        StringBuilder reversed = new StringBuilder(argument);
        reversed = reversed.reverse();
        return reversed.toString();
    }

    @Override
    public String copyEveryChar(String input, int k) {

        char[] charArray = input.toCharArray();
        char[] newCharArray = new char[input.length() * k];
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i * k; j < (i + 1) * k; j++) {
                newCharArray[j] = charArray[i];
            }
        }
        return new String(newCharArray);
    }

    @Override
    public String reverseEveryWord(String arg) {
        String[] words = arg.split("\\s");
        for (String word : words) {
            arg = arg.replaceFirst(word, (String) (reverseWord(word)));
        }
        return arg;
    }

    public static String reverseWord(String argument) {
        return new StringBuilder(argument).reverse().toString();
    }

    // condition
    @Override
    public int getPalindromeLength(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {

        int count = 0;
        while (haystack.contains(needle)) {
            count++;
            int index = haystack.indexOf(needle);
            haystack = haystack.substring(0, index)
                    + haystack.substring(index, index + needle.length()).replace(needle, "")
                    + haystack.substring(index + needle.length() + 1, haystack.length());
        }
        return count;
    }

    @Override
    public String decodeURL(String input) {
        // %20=>' ' %3A=>':' %3D=>'?' %2F=>'/'
        StringBuilder inputBuilder = new StringBuilder(input);
        while (input.contains("%20")) {
            inputBuilder.replace(inputBuilder.indexOf("%20"), inputBuilder.indexOf("%20") + 3, "");
            input = inputBuilder.toString();
        }
        while (input.contains("%3A")) {
            inputBuilder.replace(inputBuilder.indexOf("%3A"), inputBuilder.indexOf("%3A") + 3, ":");
            input = inputBuilder.toString();
        }
        while (input.contains("%3D")) {
            inputBuilder.replace(inputBuilder.indexOf("%3D"), inputBuilder.indexOf("%3D") + 3, "?");
            input = inputBuilder.toString();
        }
        while (input.contains("%2F")) {
            inputBuilder.replace(inputBuilder.indexOf("%2F"), inputBuilder.indexOf("%2F") + 3, "/");
            input = inputBuilder.toString();
        }
        return inputBuilder.toString();
    }

    @Override
    public int sumOfNumbers(String input) {
        String[] numbers = input.split("[a-zA-Z _]+");
        int sum = 0;

        for (String number : numbers) {

            while (number.startsWith("0")) {
                number = number.substring(1, number.length());
            }
            if (number.equals("")) {
                number = "0";
            }
            sum = sum + Integer.parseInt(number);
        }
        return sum;
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        return hasAnagramOf(A, B);
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        char[] chars = string.toCharArray();
        char[] chars2 = string2.toCharArray();

        Stack<Character> stackOfChar = new Stack<>();

        for (Character characterA : chars) {
            stackOfChar.push(characterA);
        }

        for (Character characterB : chars2) {
            for (Character characterA : chars) {
                if (characterB.equals(characterA) && !stackOfChar.isEmpty()) {
                    stackOfChar.pop();
                }
            }
        }

        if (stackOfChar.isEmpty()) {
            return true;
        }

        return false;
    }
}
