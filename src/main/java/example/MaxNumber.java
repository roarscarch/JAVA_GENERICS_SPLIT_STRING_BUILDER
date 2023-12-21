package example;

public class MaxNumber {
    public static <T extends Comparable<T>> T maxNum(T num1, T num2) {
        if (num1.compareTo(num2) > 0)
            return num1;
        else if(num1.compareTo(num2)<0)
            return num2;
        else
            return num1;

    }

    public static void main(String[] args) {
        Integer result1 = maxNum(3, 7);
        System.out.println("Maximum Integer: " + result1);

        Double result2 = maxNum(2.5, 1.8);
        System.out.println("Maximum Double: " + result2);


        String result3= maxNum("Anurag","D");
        System.out.println("Max String : "+ result3);
    }
}
