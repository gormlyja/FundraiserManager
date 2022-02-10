package com.enterprise.fundraisermanager.dto;

import lombok.Data;

public @Data
class Goal {
    private Integer Id;
    private String name;
    private String description;
    private Double goalAmount;
}
