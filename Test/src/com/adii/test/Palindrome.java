package com.adii.test;

public class Palindrome {

        public static boolean isPrime(int n) {
            for (int i = 2; i < Math.sqrt(n) + 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean isPalindrome(String palindrome) {
            palindrome.toLowerCase();
            StringBuilder sb = new StringBuilder(palindrome);
            StringBuilder reversed = new StringBuilder(palindrome);
            reversed.reverse();
            if (sb.equals(reversed)) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean isPalindrome(int n) {
            int lenght = String.valueOf(n).length();
            int[] array = new int[lenght];
            for (int i = 0; i < lenght; i++) {
                array[i] = n % 10;
                n = n / 10;

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

        public static boolean smartPalindrome(int n) {
            int lenght = String.valueOf(n).length();
            for (int i = lenght; i > 0; i++) {
                int one = n % (10 * (lenght - i + 1));
                // one = one / 10* ;
                int two = n % (10 ^ i);
                if (one == two) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            // System.out.println(isPrime(4));
            // System.out.println(isPrime(7));
            // System.out.println(isPalindrome("ToToTotot"));
            // System.out.println(isPalindrome("tototo"));
            // System.out.println(isPalindrome("tototot"));
            // System.out.println(isPalindrome(32));
            // System.out.println(isPalindrome(33));
            // System.out.println(isPalindrome(32323));
            // System.out.println(isPalindrome(323232));
            System.out.println(smartPalindrome(4));
            System.out.println(smartPalindrome(43434));
            System.out.println(smartPalindrome(423324));
            System.out.println(smartPalindrome(4234324));
            System.out.println(smartPalindrome(456));
        }
    }

    
}
