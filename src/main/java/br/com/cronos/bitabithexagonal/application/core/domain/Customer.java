package br.com.cronos.bitabithexagonal.application.core.domain;

public class Customer {
    private String id;
    private String name;
    private Address address;
    private String cpf;
    private Boolean isValidCpf;

    public Customer() {
        this.isValidCpf = false;
    }

    public Customer(String id, String name, String cpf, Boolean isValidCpf) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
    }

    public void addAddress(Address address) {
        this.address = address;
    }
}
