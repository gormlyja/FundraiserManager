package com.enterprise.fundraisermanager.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "goal")
public @Data
class Goal {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private Double goalAmount;
}
