package com.myshop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int invid;
    private String invjson;
    private int totalamount;
    private String gstno;
    private int transportamount;
    private String transportid;
    private String date;
    private int csid;
    
    /**
     * @return the invid
     */
    public int getInvid() {
        return invid;
    }
    
    /**
     * @param invid the invid to set
     */
    public void setInvid(int invid) {
        this.invid = invid;
    }
    
    /**
     * @return the invjson
     */
    public String getInvjson() {
        return invjson;
    }
    
    /**
     * @param invjson the invjson to set
     */
    public void setInvjson(String invjson) {
        this.invjson = invjson;
    }
    
    /**
     * @return the totalamount
     */
    public int getTotalamount() {
        return totalamount;
    }
    
    /**
     * @param totalamount the totalamount to set
     */
    public void setTotalamount(int totalamount) {
        this.totalamount = totalamount;
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
     * @return the transportamount
     */
    public int getTransportamount() {
        return transportamount;
    }
    
    /**
     * @param transportamount the transportamount to set
     */
    public void setTransportamount(int transportamount) {
        this.transportamount = transportamount;
    }
    
    /**
     * @return the transportid
     */
    public String getTransportid() {
        return transportid;
    }
    
    /**
     * @param transportid the transportid to set
     */
    public void setTransportid(String transportid) {
        this.transportid = transportid;
    }
    
    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }
    
    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Invoice [invid=" + invid + ", invjson=" + invjson + ", totalamount=" + totalamount + ", gstno=" + gstno + ", transportamount=" + transportamount + ", transportid=" + transportid + ", date=" + date + ", csid=" + csid + "]";
    }
    
    
    
    
}
