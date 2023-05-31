package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _BiFunction {

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultipleBiFunction =
            (numberToIncrementByOne, numberToMultipleBy) -> (numberToIncrementByOne + 1) * numberToMultipleBy;

    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        Integer apply = incrementByOneFunction.apply(1);
        System.out.println(apply);

        int multiply = multiplyByTenFunction.apply(apply);
        System.out.println(multiply);

        Function<Integer, Integer> addByOneThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyByTenFunction);
        Integer apply1 = addByOneThenMultiplyBy10.apply(5);
        System.out.println(apply1);

        //BiFunction takes 2 argument return 1 result
        int i = incrementByOneAndMultiply(4, 100);
        System.out.println(i);

        Integer apply2 = incrementByOneAndMultipleBiFunction.apply(4, 100);
        System.out.println(apply2);
    }

    static int incrementByOne(int number) {
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }


}
