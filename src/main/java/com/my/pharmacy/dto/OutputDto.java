package com.my.pharmacy.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OutputDto {
    private String pharmacyName;
    private String pharmacyAddress;
    private String directionUrl; // 길 안내 url
    private String roadViewUrl; // 로드뷰
    private String distance;

}
