package com.laraib.bookstoreapi.model;

import lombok.Data;

@Data
public class Customer {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
}
