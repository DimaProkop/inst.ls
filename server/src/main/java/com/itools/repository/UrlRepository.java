package com.itools.repository;

import com.itools.entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dmitry on 7.2.17.
 */
public interface UrlRepository extends JpaRepository<Url, Long> {
}
