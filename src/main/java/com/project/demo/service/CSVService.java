package com.project.demo.service;

import com.project.demo.helper.CSVHelper;
import com.project.demo.model.Orders;
import com.project.demo.repository.OrdersRepo;
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
    OrdersRepo repository;

    public void save(MultipartFile file) {
        try {
            List<Orders> orders = CSVHelper.csvToOrders(file.getInputStream());
            repository.saveAll(orders);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    public List<Orders> getAllOrders() {
        return repository.findAll();
    }


    public List<Orders> getOrdersByCustomerName(String customerName){

        return repository.findAll().stream()
                .filter(s->s.getCustomerName().contentEquals(customerName))
                .collect(Collectors.toList());
    }

    public List<Orders> getOrdersByCustomerNameAndDate(String name,String date) {


        return repository.findAll().stream()
                .filter(s->s.getCustomerName().contentEquals(name))
                .filter(s->s.getDate().contentEquals(date))
                .collect(Collectors.toList());
    }

    /*
    public List<Order> getOrdersByName(String name) {

        return repository.findAll().stream()
                .filter(s->s.getName().contentEquals(name))
                .collect(Collectors.toList());

    }

    public Order getLastOrderByFirstName(String firstName) {

        return repository.findAll().stream()
                .filter(s->s.getFirstName().contentEquals(firstName))
                .reduce((first,next) -> next).get();
    }


    public List<Order> sortedByNameAndDate() {

        return repository.findAll().stream()
                .sorted(Comparator.comparing(Order::getName).thenComparing(Order::getDate))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersByNameWhereDownloadsMoreThan50WithSortedByDate(String name) {

        return repository.findAll().stream()
                .filter(s->s.getName().contentEquals(name))
                .filter(s-> Integer.parseInt(s.getDownloads()) >= 50)
                .sorted(Comparator.comparing(Order::getDate))
                .collect(Collectors.toList());

    }
    */

}
