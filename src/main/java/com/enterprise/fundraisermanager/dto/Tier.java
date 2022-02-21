package com.enterprise.fundraisermanager.dto;

import lombok.Data;

import javax.persistence.*;
/**
 * This is the Model Layer for Tier. Data that can be stored to a database is represented by this class. Each instance is associated with an entry in a database table.
 * @author
 */
@Entity
@Table(name="tierList")
public @Data
class Tier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tierId;

    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "requiredAmount")
    private Double requiredAmount;
    @Column(name = "earnedStatus")
    private Boolean earnedStatus;

    @ManyToOne
    @JoinColumn(name = "fundraiser_id")
    private Fundraiser fundraiser;

    public Fundraiser getFundraiser() {
        return fundraiser;
    }

    public void setFundraiser(Fundraiser fundraiser) {
        this.fundraiser = fundraiser;
    }
}
