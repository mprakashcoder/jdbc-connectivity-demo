package com.swsa.model;

public class OpenNewAccount {
    int account_no;
    private String account_type;
    private String last_name;
    private String first_name;
    private String father_name;
    private String gender;
    private String address;
    private String email_id;
    private long DOB;
    int mobile_no;
    int pin_code;
    int aadhaar_no;

    //Getter and Setter Methods
    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id_id) {
        this.email_id = email_id;
    }

    public long getDOB() {
        return DOB;
    }

    public void setDOB(long DOB) {
        this.DOB = DOB;
    }

    public int getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }

    public int getPin_code() {
        return pin_code;
    }

    public void setPin_code(int pin_code) {
        this.pin_code = pin_code;
    }

    public int getAadhaar_no() {
        return aadhaar_no;
    }

    public void setAadhaar_no(int aadhaar_no) {
        this.aadhaar_no = aadhaar_no;
    }
    //Constructor
    public OpenNewAccount(int account_no, String account_type, String last_name, String first_name,
                          String father_name, String gender, String address, String email_id, long DOB,
                          int mobile_no, int pin_code, int aadhaar_no)
    {
        this.account_no = account_no;
        this.account_type = account_type;
        this.last_name = last_name;
        this.first_name = first_name;
        this.father_name = father_name;
        this.gender = gender;
        this.address = address;
        this.email_id = email_id;
        this.DOB = DOB;
        this.mobile_no = mobile_no;
        this.pin_code = pin_code;
        this.aadhaar_no = aadhaar_no;
    }


    //toString methods
    @Override
    public String toString() {
        return "OpenNewAccount{" +
                "account_no=" + account_no +
                ", account_type='" + account_type + '\'' +
                ", last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", father_name='" + father_name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", email_id='" + email_id + '\'' +
                ", DOB=" + DOB +
                ", mobile_no=" + mobile_no +
                ", pin_code=" + pin_code +
                ", aadhaar_no=" + aadhaar_no +
                '}';
    }

}


