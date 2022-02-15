package com.enterprise.fundraisermanager.dto;

import lombok.Data;

import java.util.Date;

public @Data
class Transaction {
    private Integer userId;
    private Integer transactionAmount;
    private Date turnedInDate;
}
