package org.depend.injection;

public class TestService {

    public static void main(String[] args) {

        Service service1 = new Service("best");
        Service service2 = new Service("good");
        Service service3 = new Service("bad");

        Customer customer1 = new Customer(service1);
        Customer customer2 = new Customer(service2);
        Customer customer3 = new Customer(service3);
        System.out.println(customer1.getService());
        System.out.println(customer2.getService());
        System.out.println(customer3.getService());
        
    }
}
