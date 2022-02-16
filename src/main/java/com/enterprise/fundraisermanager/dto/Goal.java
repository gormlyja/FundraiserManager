package com.enterprise.fundraisermanager.dto;

import lombok.Data;

public @Data
class Goal {
    private String name;
    private Integer id;
    private String description;
    private Double goalAmount;
}
