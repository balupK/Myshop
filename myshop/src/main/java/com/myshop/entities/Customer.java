package com.myshop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int csid;
    private String name;
    private String shopname;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private int pincode;
    private String mobile1;
    private String mobile2;
    private String landline;
    private String gstno;
    private String reference;
    private String created_date;
    
    /**
     * @return the csid
     */
    public int getCsid() {
        return csid;
    }
    
    /**
     * @param csid the csid to set
     */
    public void setCsid(int csid) {
        this.csid = csid;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the shopname
     */
    public String getShopname() {
        return shopname;
    }
    
    /**
     * @param shopname the shopname to set
     */
    public void setShopname(String shopname) {
        this.shopname = shopname;
    }
    
    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }
    
    /**
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    
    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }
    
    /**
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    
    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    
    /**
     * @return the state
     */
    public String getState() {
        return state;
    }
    
    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * @return the pincode
     */
    public int getPincode() {
        return pincode;
    }
    
    /**
     * @param pincode the pincode to set
     */
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    
    /**
     * @return the mobile1
     */
    public String getMobile1() {
        return mobile1;
    }
    
    /**
     * @param mobile1 the mobile1 to set
     */
    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }
    
    /**
     * @return the mobile2
     */
    public String getMobile2() {
        return mobile2;
    }
    
    /**
     * @param mobile2 the mobile2 to set
     */
    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }
    
    /**
     * @return the landline
     */
    public String getLandline() {
        return landline;
    }
    
    /**
     * @param landline the landline to set
     */
    public void setLandline(String landline) {
        this.landline = landline;
    }
    
    /**
     * @return the gstno
     */
    public String getGstno() {
        return gstno;
    }
    
    /**
     * @param gstno the gstno to set
     */
    public void setGstno(String gstno) {
        this.gstno = gstno;
    }
    
    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }
    
    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }
    
    /**
     * @return the created_date
     */
    public String getCreated_date() {
        return created_date;
    }
    
    /**
     * @param created_date the created_date to set
     */
    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Customer [csid=" + csid + ", name=" + name + ", shopname=" + shopname + ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", mobile1=" + mobile1 + ", mobile2=" + mobile2 + ", landline=" + landline + ", gstno=" + gstno + ", reference=" + reference + ", created_date=" + created_date + "]";
    } 
   
    

}
