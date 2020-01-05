package org.depend.injection;

public class Service {

    public String kindOfService;

    Service(String kindOfService){
        this.kindOfService = kindOfService;
    }

    public String getKindOfService() {
        return kindOfService;
    }

    public void setKindOfService(String kindOfService) {
        this.kindOfService = kindOfService;
    }
}
