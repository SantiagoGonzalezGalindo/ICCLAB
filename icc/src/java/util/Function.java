package util;

/**
 *
 * Provides basic mathematical operations and numerical methods.
 *
 * @author Santiago Gonzalez Galindo
 * @version 1.0
 */
public class Function {

    /**
     * Determines whether a number is even.
     *
     * @param number the integer to evaluate
     * @return true if the number is even; false otherwise
     */
    public boolean isEven(int number) {
        // Es par si al dividirlo entre 2 no sobra nada
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Determines whether a number is odd.
     *
     * @param number the integer to evaluate
     * @return true if the number is odd; false otherwise
     */
    public boolean isOdd(int number) {
        // Es impar si no es par
        if (isEven(number)) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Determines whether a number is prime.
     *
     * @param number the integer to evaluate
     * @return true if the number is prime; false otherwise
     */
    public boolean isPrime(int number) {
        // El 0, el 1 y los negativos no son primos
        if (number < 2) {
            return false;
        }
        // Basta con probar divisores hasta la raiz del numero
        // (i <= number / i es lo mismo que i * i <= number)
        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns the greater of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the greater integer
     */
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Returns the smaller of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the smaller integer
     */
    public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Calculates the factorial of a non-negative integer.
     *
     * @param number the integer whose factorial will be calculated
     * @return the factorial of the given number
     */
    public long factorial(int number) {
        // No hay factorial de negativos, por eso se regresa 0
        if (number < 0) {
            return 0;
        }
        // El factorial de 0 es 1 y para los demas se multiplica de 2 hasta el numero
        long resultado = 1;
        for (int i = 2; i <= number; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    /**
     * Calculates the sum of the digits of an integer.
     *
     * @param number the integer whose digits will be added
     * @return the sum of the digits
     */
    public int sumDigits(int number) {
        int suma = 0;
        int digito;
        // Se toma el ultimo digito con % 10 y se quita con / 10
        while (number != 0) {
            digito = number % 10;
            // Si el numero es negativo el residuo sale negativo
            if (digito < 0) {
                digito = -digito;
            }
            suma = suma + digito;
            number = number / 10;
        }
        return suma;
    }

    /**
     * Reverses the digits of an integer.
     *
     * @param number the integer to reverse
     * @return the integer with its digits reversed
     */
    public int reverseNumber(int number) {
        // Se usa long para saber si el numero volteado ya no cabe en un int
        long reverso = 0;
        // Se toma el ultimo digito y se va agregando al final del reverso
        // (si el numero es negativo, el reverso tambien sale negativo)
        while (number != 0) {
            reverso = reverso * 10 + number % 10;
            number = number / 10;
        }
        // Si el numero volteado ya no cabe en un int, se regresa 0
        if (reverso > 2147483647 || reverso < -2147483648) {
            return 0;
        }
        return (int) reverso;
    }

    /**
     * Determines whether an integer is a palindrome.
     *
     * @param number the integer to evaluate
     * @return true if the number is a palindrome; false otherwise
     */
    public boolean isPalindrome(int number) {
        return false;
    }

    /**
     * Calculates the power of a base raised to an integer exponent.
     *
     * @param base the base value
     * @param exponent the exponent
     * @return the result of raising the base to the exponent
     */
    public double power(double base, int exponent) {
        return 0;
    }

    /**
     * Calculates the greatest common divisor of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the greatest common divisor
     */
    public int gcd(int a, int b) {
        return 0;
    }

    /**
     * Counts how many times a specific digit appears in an integer.
     *
     * @param number the integer to analyze
     * @param digit the digit to search for
     * @return the number of occurrences of the digit
     */
    public int countDigit(int number, int digit) {
        return 0;
    }

    /**
     * Calculates the arithmetic mean of an integer array.
     *
     * @param numbers the array of integers
     * @return the arithmetic mean of the array elements
     */
    public double average(int[] numbers) {
        return 0;
    }

    /**
     * Determines whether an integer array is sorted
     * in ascending order.
     *
     * @param numbers the array of integers
     * @return true if the array is sorted; false otherwise
     */
    public boolean isSorted(int[] numbers) {
        return false;
    }
}
