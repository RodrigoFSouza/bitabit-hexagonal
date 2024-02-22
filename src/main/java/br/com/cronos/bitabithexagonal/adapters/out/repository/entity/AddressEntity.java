package br.com.cronos.bitabithexagonal.adapters.out.repository.entity;

import lombok.Data;

@Data
public class AddressEntity {
    private String street;
    private String district;
    private String city;
    private String state;
    private String zipCode;
    private Double latitude;
    private Double longitude;
}
