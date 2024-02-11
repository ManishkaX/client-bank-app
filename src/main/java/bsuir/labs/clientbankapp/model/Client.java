package bsuir.labs.clientbankapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String surname;
    @NotNull
    private String name;
    @NotNull
    private String patronymic;

    @NotNull
    private Date birthdate;
    @NotNull
    @OneToOne
    private Sex sex;

    @NotNull
    private String passportSeries;
    @NotNull
    private String passportNumber;
    @NotNull
    private String authority;
    @NotNull
    private Date issueDate;
    @NotNull
    private String identificationNumber;
    @NotNull
    private String birthPlace;
    @NotNull
    @OneToOne
    private City actualResidenceCity;
    @NotNull
    private String actualResidenceAddress;

    private int homePhoneNumber;
    private int cellPhoneNumber;

    @Email
    private String email;

    @NotNull
    @OneToOne
    private City residenceCity;

    @OneToOne
    private MaritalStatus maritalStatus;

    @NotNull
    @OneToOne
    private Nationality nationality;

    @NotNull
    @OneToOne
    private Disability disability;

    @NotNull
    private boolean retiree;

    private double monthlyRevenue;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public City getActualResidenceCity() {
        return actualResidenceCity;
    }

    public void setActualResidenceCity(City actualResidenceCity) {
        this.actualResidenceCity = actualResidenceCity;
    }

    public String getActualResidenceAddress() {
        return actualResidenceAddress;
    }

    public void setActualResidenceAddress(String actualResidenceAddress) {
        this.actualResidenceAddress = actualResidenceAddress;
    }

    public int getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(int homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public int getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(int cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public City getResidenceCity() {
        return residenceCity;
    }

    public void setResidenceCity(City residenceCity) {
        this.residenceCity = residenceCity;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public Disability getDisability() {
        return disability;
    }

    public void setDisability(Disability disability) {
        this.disability = disability;
    }

    public boolean isRetiree() {
        return retiree;
    }

    public void setRetiree(boolean retiree) {
        this.retiree = retiree;
    }

    public double getMonthlyRevenue() {
        return monthlyRevenue;
    }

    public void setMonthlyRevenue(double monthlyRevenue) {
        this.monthlyRevenue = monthlyRevenue;
    }
}
