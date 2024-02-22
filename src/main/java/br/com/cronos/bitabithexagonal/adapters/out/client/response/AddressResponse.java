package br.com.cronos.bitabithexagonal.adapters.out.client.response;

import lombok.Data;

@Data
public class AddressResponse {
    private String street;
    private String district;
    private String city;
    private String state;
    private String zipCode;
    private Double latitude;
    private Double longitude;
}
