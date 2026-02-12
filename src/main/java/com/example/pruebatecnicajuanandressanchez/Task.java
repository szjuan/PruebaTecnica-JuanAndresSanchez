package com.example.pruebatecnicajuanandressanchez;

public class Task {


    // Informacion Producto
    private int productID;

    private String name;

    public String toStringConsulata() {
        return "Task{" +
                "YearExp=" + YearExp +
                ", status='" + status + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }

    public String Consulta(){

        return this.toStringConsulata();
    }

    private String type;

    // Informacion Card

    private String cardid;

    private int cardNumber;

    private String holderName;

    private String issuedAt;

    private int Year;
    private int YearExp;
    private int Month;
    private int Day;

    private String expiresAt;

    private String status;

    private String blockedReason;

    private String blockeadAt;

    private int Balance;

    private String currency;

    //setters y getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public String getBlockeadAt() {
        return blockeadAt;
    }

    public void setBlockeadAt(String blockeadAt) {
        this.blockeadAt = blockeadAt;
    }

    public String getBlockedReason() {
        return blockedReason;
    }

    public void setBlockedReason(String blockedReason) {
        this.blockedReason = blockedReason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getYearExp() {
        return Year;
    }

    public void setYearExp(int year) {
        YearExp = year + 3;
    }

    public String getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    public String toStringIssuedAt() {
        return "Task{" +
                "Year=" + Year +
                ", Month=" + Month +
                ", Day=" + Day +
                '}';
    }


    public String toStringExpiredAt() {
        return "Task{" +
                "Year=" + YearExp +
                ", Month=" + Month +
                ", Day=" + Day +
                '}';
    }



    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }



}
