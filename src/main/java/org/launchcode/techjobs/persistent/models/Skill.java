package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description is required.")
    @Size(min = 2, max = 250, message = "Description must be greater than 2 characters and less than 250 characters.")
    private String description;


    public Skill(){ };

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

}
