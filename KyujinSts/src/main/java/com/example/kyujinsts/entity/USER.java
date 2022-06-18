package com.example.kyujinsts.entity;

import lombok.Data;

import java.util.Date;

@Data
public class USER {
    private Integer U_ID;
    private String U_NAME;
    private String U_PASSWORD;
    private String KOUSHIN_SHA;
    private Date KOUSHIN_HIDUKE;
    private String SAKUSEI_SHA;
    private Date SAKUSEI_HIDUKE;




}
