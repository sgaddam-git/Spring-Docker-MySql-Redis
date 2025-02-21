package com.sample.data.currency.model;

import lombok.Data;

@Data
public class Currency {
    private Integer id;
    private String name;
    private String code;
    private String createdBy;
    private String modifiedBy;
    private boolean deleted;
}
