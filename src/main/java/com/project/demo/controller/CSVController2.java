package com.project.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:8080")
//@Controller
@RequestMapping("/api/csv")
public class CSVController2 {

    /*@Autowired
    CSVService fileService;

    @PostMapping("/upload")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
        String message = "";

        if (CSVHelper2.hasCSVFormat(file)) {
            try {
                fileService.save(file);

                message = "Uploaded the file successfully: " + file.getOriginalFilename();
                return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
            } catch (Exception e) {
                message = "Could not upload the file: " + file.getOriginalFilename() + "!";message = "Could not upload the file: " + file.getOriginalFilename() + "!";
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
            }
        }
        message = "Please upload a csv file!";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));

    }

    //SELECT * FROM Archive;
    @GetMapping("/download")
    public ResponseEntity<List<Archive>> getAllarchives () {
            try {
                List<Archive> archives = fileService.getAllArchives();

                if (archives.isEmpty()) {
                    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
                }

                return new ResponseEntity<List<Archive>>(archives, HttpStatus.OK);
            } catch (Exception e) {
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
    }

    //1-Stream :Get Archive By First Name 
    @GetMapping(value = "/archives/findByFirstName/{firstName}")
    public ResponseEntity<List<Archive>> getArchivesByFirstName (@PathVariable String firstName) {
        try {
            List<Archive> archives = fileService.getArchivesByFirstName(firstName);

            if (archives.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<List<Archive>>(archives, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //2-Stream :Get Archive By Name
    @GetMapping("/archives/findByName/{name}")
    public ResponseEntity<List<Archive>> getArchivesByName (@PathVariable String name) {
        try {
            List<Archive> archives = fileService.getArchivesByName(name);

            if (archives.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<List<Archive>>(archives, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //3-Stream :Get Last Archive By First Name 
    @GetMapping(value = "/archives/findLastArchiveByFirstName/stream/{firstName}")
    public ResponseEntity<Archive> getLastArchiveByFirstName (@PathVariable String firstName) {
        try {
            Archive archive = fileService.getLastArchiveByFirstName(firstName);

            if (archive == null) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(archive, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //4-Stream : Sorted by Name and Date
    @GetMapping(value = "/archives/sortedByNameAndDate/stream/")
    public ResponseEntity<List<Archive>> sortedByNameAndDate() {
        try {
            List<Archive> archives = fileService.sortedByNameAndDate();

            if (archives.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<List<Archive>>(archives, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //5-Stream :Get Archive By Name With More than 50 downloads and sorted by date.
    @GetMapping(value = "/archives/getArchivesByNameWhereDownloadsMoreThan50WithSortedByDate/stream/{name}")
    public ResponseEntity<List<Archive>> getArchivesByNameWhereDownloadsMoreThan50WithSortedByDate(@PathVariable String name) {
        try {
            List<Archive> archives=fileService.getArchivesByNameWhereDownloadsMoreThan50WithSortedByDate(name);

            if (archives.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<List<Archive>>(archives, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/

}


