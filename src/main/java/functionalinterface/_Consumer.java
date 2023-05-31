package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello " + customer.customerName + " your phone number: " + customer.customerPhoneNumber);
    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer =
            (customer, showCustomerPhoneNumber) ->
                    System.out.println("Hello " + customer.customerName + " customer phone number: " + (Boolean.TRUE.equals(showCustomerPhoneNumber) ?
                            customer.customerPhoneNumber : "**********"));

    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "9999999999");
        greetCustomer(maria);
        greetCustomerConsumer.accept(maria);
        greetCustomerBiConsumer.accept(maria, false);
        greetCustomerBiConsumer.accept(maria, true);

    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + " your phone number: " + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
