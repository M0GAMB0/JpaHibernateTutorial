package com.example.jpatut;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//tells code to auto assign pk
    int cardNo;

    Date expiry;
    @Enumerated(EnumType.STRING)//used to put enums as String in mySql table
    Status status;
    @OneToOne//Mapping from child to parent.
    @JoinColumn//to connect child to parent model | by default it takes pk of user to connect| but if we mention unique key it will connect using unique key
    User user;

}
