package com.amigoscode.customer;

public record CustomerRegistrationRequest(Integer id,
                                          String firstName,
                                          String lastName,
                                          String email) {

}
