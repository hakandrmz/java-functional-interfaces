package functionalinterface;

import java.util.function.Function;

public class _Function {

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);

        Integer apply = incrementByOneFunction.apply(1);
        System.out.println(apply);

        int multiply = multiplyByTenFunction.apply(apply);
        System.out.println(multiply);

        Function<Integer, Integer> addByOneThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyByTenFunction);
        Integer apply1 = addByOneThenMultiplyBy10.apply(5);
        System.out.println(apply1);
    }

    static int incrementByOne(int number) {
        return number + 1;
    }


}
