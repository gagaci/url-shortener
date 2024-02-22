package com.example.urlshortenergithub.enitity;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "UrlShortener")
@Table(name = "url_shortener")
@Getter
@Setter
@Builder
@AllArgsConstructor
public class ShortUrl {
    @Id
    @SequenceGenerator(
            name = "url_sequence",
            sequenceName = "url_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "url_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "url",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String url;
    @Column(
            name = "code",
            nullable = false,
            columnDefinition = "TEXT",
            unique = true)
    private String code;

    public ShortUrl(String url, String code) {
        this.url = url;
        this.code = code;
    }

    public ShortUrl() {

    }
}
