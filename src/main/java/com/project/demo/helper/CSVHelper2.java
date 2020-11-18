package com.project.demo.helper;

import org.springframework.stereotype.Component;

//@Component
public class CSVHelper2 {

   /* public static String TYPE = "text/csv";
    static String[] HEADERs = { "Name", "Size", "First name", "Last name", "Downloads", "Date", "Path" };

    public static boolean hasCSVFormat(MultipartFile file) {

        if (!TYPE.equals(file.getContentType())) {
            return false;
        }

        return true;
    }

    public static List<Archive> csvToArchives(InputStream is) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
             CSVParser csvParser = new CSVParser(fileReader,
                     CSVFormat.EXCEL.withDelimiter(';').withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());){

            List<Archive> archives = new ArrayList<Archive>();

            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            for (CSVRecord csvRecord : csvRecords) {
                Archive archive = new Archive(
                        csvRecord.get(0),
                        csvRecord.get(1),
                        csvRecord.get(2),
                        csvRecord.get(3),
                        csvRecord.get(4),
                        csvRecord.get(5),
                        csvRecord.get(6)
                );

                archives.add(archive);
            }

            return archives;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }
*/

}
