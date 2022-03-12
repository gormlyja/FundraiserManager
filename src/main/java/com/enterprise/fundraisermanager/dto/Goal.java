package com.enterprise.fundraisermanager.dto;

import lombok.Data;

import javax.persistence.*;
/**
 * This is the Model Layer for Goal. Data that can be stored to a database is represented by this class. Each instance is associated with an entry in a database table.
 * @author
 */
@Entity
@Table(name="goals")
public @Data
class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "goalAmount")
    private Double goalAmount;

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
