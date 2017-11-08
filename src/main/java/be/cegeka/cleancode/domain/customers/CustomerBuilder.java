package be.cegeka.cleancode.domain.customers;

public class CustomerBuilder {

    private String name;

    public Customer buildFull(){
        Customer customer = new Customer(name);
        return customer;
    }

    public CustomerBuilder withName(String name){
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
}
