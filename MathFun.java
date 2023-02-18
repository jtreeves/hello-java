class MathFun {
    public static void main(String args[]) {
        int firstNumber = 5;
        int secondNumber = 3;
        int newSum = addTwoNumbers(firstNumber, secondNumber);
        int newDiff = subtractTwoNumbers(firstNumber, secondNumber);
        int newProd = multiplyTwoNumbers(firstNumber, secondNumber);
        int newQuot = divideTwoNumbers(firstNumber, secondNumber);

        System.out.printf("The sum of %d and %d is %d\n", firstNumber, secondNumber, newSum);
        System.out.printf("The difference of %d and %d is %d\n", firstNumber, secondNumber, newDiff);
        System.out.printf("The product of %d and %d is %d\n", firstNumber, secondNumber, newProd);
        System.out.printf("The quotient of %d and %d is %d\n", firstNumber, secondNumber, newQuot);
    }

    public static int addTwoNumbers(int firstNumber, int secondNumber) {
        int sumOfNumbers = firstNumber + secondNumber;
        return sumOfNumbers;
    }

    public static int subtractTwoNumbers(int firstNumber, int secondNumber) {
        int differenceOfNumbers = firstNumber - secondNumber;
        return differenceOfNumbers;
    }

    public static int multiplyTwoNumbers(int firstNumber, int secondNumber) {
        int productOfNumbers = firstNumber * secondNumber;
        return productOfNumbers;
    }

    public static int divideTwoNumbers(int firstNumber, int secondNumber) {
        int quotientOfNumbers = firstNumber / secondNumber;
        return quotientOfNumbers;
    }
}
