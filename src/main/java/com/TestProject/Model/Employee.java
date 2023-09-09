package com.TestProject.Model;

public record Employee(int id, String name, String email) {

    public Employee(int id, String name, String email){
        if(id==0) throw new IllegalStateException("Id can't be 0");
        this.id = id;
        this.email = email;
        this.name = name;

    }
}
