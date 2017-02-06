package com.itools.repository;

import com.itools.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dmitry on 7.2.17.
 */
public interface TagRepository extends JpaRepository<Tag, Long> {
}
