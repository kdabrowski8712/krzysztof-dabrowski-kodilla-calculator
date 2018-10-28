public class Calculator {

    public int subtractSecondMinusFirst(int A , int B) {
        return B-A;
    }

    public int sum (int A , int B) {
        return A+B;
    }

    public static void main (String [] args) {

        Calculator c = new Calculator();

        System.out.println("Subtract 10 - 3 : " + c.subtractSecondMinusFirst(3,10));
        System.out.println("Sum 10 + 3: + " + c.sum(10,3));

    }
}
