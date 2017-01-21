package com.concretepage.persistence.generation.startegy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "identityIdentifier")
public class IdentityIdentifier {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}