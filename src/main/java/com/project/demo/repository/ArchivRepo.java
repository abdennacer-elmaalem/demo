package com.project.demo.repository;

import com.project.demo.model.Archive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArchivRepo extends JpaRepository<Archive,Long> {
    List<Archive> findByFirstName(String firstName);
    List<Archive> findByName(String name);

}
