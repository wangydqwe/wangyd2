package com.example.kyujinsts.entity;

import lombok.Data;

import java.util.Date;

@Data
public class KYUJIN {

    private Integer KJ_ID;
    private Integer KAISHA_ID;
    private String YAKUSHOKU_NAME;
    private String KAISHA_NAME;
    private Integer KYOYU;
    private String JUSHO1;
    private String JUSHO2;
    private String JUSHO3;
    private Integer TELE;
    private Integer MAIL;
    private String BIKO;
    private String KOUSHIN_SHA;
    private Date KOUSHIN_HIDUKE;
    private String SAKUSEI_SHA;
    private Date SAKUSEI_HIDUKE;
}
