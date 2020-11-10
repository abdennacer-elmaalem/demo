package com.project.demo.service;

import com.project.demo.helper.CSVHelper;
import com.project.demo.model.Archive;
import com.project.demo.repository.ArchivRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CSVService {

    @Autowired
    ArchivRepo repository;

    public void save(MultipartFile file) {
        try {
            List<Archive> archives = CSVHelper.csvToArchives(file.getInputStream());
            repository.saveAll(archives);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    public List<Archive> getAllArchives() {
        return repository.findAll();
    }

    public List<Archive> getArchivesByFirstName(String firstName){

        return repository.findAll().stream()
                .filter(s->s.getFirstName().contentEquals(firstName))
                .collect(Collectors.toList());
    }

    public List<Archive> getArchivesByName(String name) {

        return repository.findAll().stream()
                .filter(s->s.getName().contentEquals(name))
                .collect(Collectors.toList());

    }

    public Archive getLastArchiveByFirstName(String firstName) {

        return repository.findAll().stream()
                .filter(s->s.getFirstName().contentEquals(firstName))
                .reduce((first,next) -> next).get();

    }


    public List<Archive> sortedByNameAndDate() {

        return repository.findAll().stream()
                .sorted(Comparator.comparing(Archive::getName).thenComparing(Archive::getDate))
                .collect(Collectors.toList());

    }

    public List<Archive> getArchivesByNameWhereDownloadsMoreThan50WithSortedByDate(String name) {

        return repository.findAll().stream()
                .filter(s->s.getName().contentEquals(name))
                .filter(s-> Integer.parseInt(s.getDownloads()) >= 50)
                .sorted(Comparator.comparing(Archive::getDate))
                .collect(Collectors.toList());

    }

}
