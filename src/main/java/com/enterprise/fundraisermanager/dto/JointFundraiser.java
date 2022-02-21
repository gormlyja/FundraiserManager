package com.enterprise.fundraisermanager.dto;

import lombok.Data;

import javax.persistence.*;
/**
 * This is the Model Layer for Joint Fundraiser. Data that can be stored to a database is represented by this class. Each instance is associated with an entry in a database table.
 * @author
 */
@Entity
@Table(name="jointFundraiser")
public @Data
class JointFundraiser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "userId")
    private Integer userId;
}
