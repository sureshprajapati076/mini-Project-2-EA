package edu.mum.cs.ea.catalog.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment  {


    String type ;

    int preferred ;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
@Id
String user_id ;


    public String getType() {
        return type;
    }

    public int getPreferred() {
        return preferred;
    }

    public void setPreferred(int preferred) {
        this.preferred = preferred;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Payment(String type, String ccv, String number,int preferred) {
        this.type = type;
        this.ccv = ccv;
        this.number = number;
        this.preferred = preferred;
    }
    public Payment()
    {

    }

    String ccv;
    String number;
}
