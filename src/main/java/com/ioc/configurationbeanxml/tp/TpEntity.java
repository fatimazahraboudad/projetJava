package com.ioc.configurationbeanxml.tp;

import java.time.LocalDate;

public class TpEntity {
    private String id;
    private String name;

    public TpEntity() {

    }
    public TpEntity(String name, String id) {
        this.name = name;
        this.id = id;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TpEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
