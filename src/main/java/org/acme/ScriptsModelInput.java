package org.acme;

import java.util.Map;
import java.util.HashMap;

@io.quarkus.runtime.annotations.RegisterForReflection()
public class ScriptsModelInput {


    @com.fasterxml.jackson.annotation.JsonProperty(value = "lastName")
    private java.lang.String lastName;

    public java.lang.String getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    private java.lang.String name;

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(value = "message")
    private java.lang.String message;

    public java.lang.String getMessage() {
        return message;
    }

    public void setMessage(java.lang.String message) {
        this.message = message;
    }
}
