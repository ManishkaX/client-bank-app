package bsuir.labs.clientbankapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class MaritalStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(unique = true)
    private String name;

    public MaritalStatus(String name) {
        this.name = name;
    }

    public MaritalStatus() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
