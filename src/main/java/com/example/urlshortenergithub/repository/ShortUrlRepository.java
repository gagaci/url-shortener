package com.example.urlshortenergithub.repository;

import com.example.urlshortenergithub.enitity.ShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShortUrlRepository extends JpaRepository<ShortUrl,Long> {

    Optional<ShortUrl> findAllByCode(String code);
}
