package com.my.pharmacy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
public class KakaoApiResponseDto {
    @JsonProperty("documents")
    private List<DocumentDto> documentList;
    @JsonProperty("meta")
    private MetaDto metaDto;
}
