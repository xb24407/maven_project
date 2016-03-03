package com.app.model;

/**
 * Created by xiaojunzhou on 2016/3/1.
 */
public class Student {
    private Integer id;
    private String name;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String toString(){
       return "name:"+this.name+" email:"+this.email;
    
    }
}
