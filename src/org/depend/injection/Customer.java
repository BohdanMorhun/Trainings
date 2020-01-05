package org.depend.injection;

public class Customer {

    private Service service;

    Customer(Service service) {
        this.service = service;
    }

    String getService() {
        return service.getKindOfService();
    }
}
