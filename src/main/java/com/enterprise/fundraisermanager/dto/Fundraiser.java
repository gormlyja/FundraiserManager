package com.enterprise.fundraisermanager.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;
/**
 * This is the Model Layer for fundraiser. Data that can be stored to a database is represented by this class. Each instance is associated with an entry in a database table.
 * @author
 */
@Entity
@Table(name="fundraiserdb")
public @Data
class Fundraiser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="activeStatus")
    private Boolean activeStatus;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="homeImage")
    private String homeImage;

    @OneToMany(mappedBy = "goals")
    private List<Goal> goals;

    @OneToMany(mappedBy = "tierList")
    private List<Tier> tierList;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME, pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name="startDate")
    private Calendar startDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME, pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name="endDate")
    private Calendar endDate;

    @Column(name="totalFundraised")
    private Double totalFundraised;
}
