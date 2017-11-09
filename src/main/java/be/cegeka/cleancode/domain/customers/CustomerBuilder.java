package be.cegeka.cleancode.domain.customers;

public class CustomerBuilder {

    private int id;
    private String name;

    public Customer buildFull(){
        Customer customer = new Customer(name);
        return customer;
    }

    public CustomerBuilder withName(String name){
        this.name = name;
        return this;
    }

    public CustomerBuilder withId(int id){
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
