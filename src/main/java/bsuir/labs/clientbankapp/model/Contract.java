package bsuir.labs.clientbankapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

//    private DepositType depositType;

    private String number;

    private Date startDate;

    private Date endDate;

    private String term;

    private int depositAmount;

    private double depositInterest;


}
