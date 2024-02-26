package bsuir.labs.clientbankapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @NotEmpty(message = "Поле является обязательным")
    @Pattern(regexp = "[а-яА-ЯёЁ]+", message = "Поле не может содержать спец символы или цифры")
    private String surname;
    @NotEmpty(message = "Поле является обязательным")
    @Pattern(regexp = "[а-яА-ЯёЁ]+", message = "Поле не может содержать спец символы или цифры")
    private String name;
    @NotEmpty(message = "Поле является обязательным")
    @Pattern(regexp = "[а-яА-ЯёЁ]+", message = "Поле не может содержать спец символы или цифры")
    private String patronymic;

    @NotNull(message = "Поле является обязательным")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdate;
    @NotNull(message = "Поле является обязательным")
    @OneToOne
    private Sex sex;

    @NotEmpty(message = "Поле является обязательным")
    private String passportSeries;
    @NotEmpty(message = "Поле является обязательным")
    private String passportNumber;

    @NotEmpty(message = "Поле является обязательным")
    private String authority;
    @NotNull(message = "Поле является обязательным")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date issueDate;
    @NotEmpty(message = "Поле является обязательным")
    @Column(unique = true)
    private String identificationNumber;
    @NotEmpty(message = "Поле является обязательным")
    private String birthPlace;
    @NotNull(message = "Поле является обязательным")
    @OneToOne
    private City actualResidenceCity;
    @NotEmpty(message = "Поле является обязательным")
    private String actualResidenceAddress;

    private String homePhoneNumber;
    private String cellPhoneNumber;

    @Email
    private String email;

    @NotNull(message = "Поле является обязательным")
    @OneToOne
    private City residenceCity;

    @OneToOne
    private MaritalStatus maritalStatus;

    @NotNull(message = "Поле является обязательным")
    @OneToOne
    private Nationality nationality;

    @NotNull(message = "Поле является обязательным")
    @OneToOne
    private Disability disability;

    @NotNull(message = "Поле является обязательным")
    private boolean retiree;

    private Double monthlyRevenue;

//    @Transient
//    private String strMonthlyRevenue;


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

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
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

    public Double getMonthlyRevenue() {
        return monthlyRevenue;
    }



    public String getFullName() {
        return this.name + ' ' + this.surname + ' ' + this.patronymic;
    }

    public String getPassport() {
        return this.passportSeries + ' ' + this.passportNumber;
    }

}
