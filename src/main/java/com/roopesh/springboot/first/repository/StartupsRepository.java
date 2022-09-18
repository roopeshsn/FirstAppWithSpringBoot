package com.roopesh.springboot.first.repository;

import com.roopesh.springboot.first.entity.Startups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StartupsRepository extends JpaRepository<Startups, Long> {
}
