package com.enterprise.fundraisermanager.dto;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Tiers")
public @Data
class Tier {
    @Id
    @GeneratedValue
    private Integer tierId;
    private String name;
    private String description;
    private Double requiredAmount;
    private Boolean earnedStatus;

    //TODO: Many to one
}
