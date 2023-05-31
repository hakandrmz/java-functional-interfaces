package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    static Supplier<String> getDbConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";

    public static void main(String[] args) {
        System.out.println(getDbConnectionUrl());
        System.out.println(getDbConnectionUrlSupplier.get());
    }

    static String getDbConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }
}
