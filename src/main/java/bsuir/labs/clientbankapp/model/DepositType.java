package bsuir.labs.clientbankapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class DepositType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(unique = true)
    @NotBlank(message = "Поле не может быть пустым или отсутствовать")
    private String type;
}
