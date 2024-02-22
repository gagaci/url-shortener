package com.example.urlshortenergithub.request.converter;

import com.example.urlshortenergithub.enitity.ShortUrl;
import com.example.urlshortenergithub.request.ShortUrlRequest;
import org.springframework.stereotype.Component;

@Component
public class ShortUrlRequestConverter {
    public ShortUrl convertToEntity(ShortUrlRequest shortUrlRequest) {
        return ShortUrl.builder().url(shortUrlRequest.getUrl())
                .code(shortUrlRequest.getCode())
                .build();
    }
}
