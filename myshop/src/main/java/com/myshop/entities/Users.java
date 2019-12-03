package com.myshop.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="users")
public class Users {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userid;
    private String username;
    private String password;
    private Date createdate;
    private String role;
    
    /**
     * @return the userid
     */
    public int getUserid() {
        return userid;
    }
    
    /**
     * @param userid the userid to set
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }
    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * @return the createdate
     */
    public Date getCreatedate() {
        return createdate;
    }
    
    /**
     * @param createdate the createdate to set
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
    
    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }
    
    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Users [userid=" + userid + ", username=" + username + ", password=" + password + ", createdate=" + createdate + ", role=" + role + "]";
    }

}
