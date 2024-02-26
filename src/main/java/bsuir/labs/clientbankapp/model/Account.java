package bsuir.labs.clientbankapp.model;

import jakarta.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String number;

    private String code;

    @OneToOne
    private AccountActivity activity;

    private int totalMoney;


}
