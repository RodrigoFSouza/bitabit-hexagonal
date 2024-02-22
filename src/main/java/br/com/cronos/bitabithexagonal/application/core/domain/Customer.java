package br.com.cronos.bitabithexagonal.application.core.domain;

import java.io.Serial;
import java.io.Serializable;

public class Customer implements Serializable {
    private static final long serialVersionUID = 42L;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getCpf() {
        return cpf;
    }

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void addAddress(Address address) {
        this.address = address;
    }
}
