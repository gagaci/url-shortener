package com.example.urlshortenergithub.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ShortUrlRequest {
    @NotEmpty
    private String url;
    private String code;
}
