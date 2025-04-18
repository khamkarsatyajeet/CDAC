/* Q22: Implement a calculator that takes two numbers and an operator (+, -, *, /) as input
and prints the result using only switch-case  */ 


class Que22 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5; 
        char operator = '/'; 

        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2; 
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }
}