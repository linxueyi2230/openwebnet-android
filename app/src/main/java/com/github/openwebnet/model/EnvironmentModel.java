package com.github.openwebnet.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class EnvironmentModel extends RealmObject {

    public static final String FIELD_ID = "id";
    public static final String FIELD_NAME = "name";

    @Required
    @PrimaryKey
    private Integer id;

    @Required
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
