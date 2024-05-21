package org.lenguyendangdinh.qlcanho.services;

import org.lenguyendangdinh.qlcanho.NotFoundException;
import org.lenguyendangdinh.qlcanho.models.Customer;
import org.lenguyendangdinh.qlcanho.services.minterfaces.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired private ICustomerService iCustomerService;
    public List<Customer> listAll() {
        return (List<Customer>) iCustomerService.findAll();
    }
    public void save(Customer category) {
        iCustomerService.save(category);
    }
    public Customer getByID(Integer categoryId) {
        Optional<Customer> user = iCustomerService.findById(categoryId);
        return user.orElse(null);
    }
    public Customer get(Integer cusId) throws NotFoundException {
        Optional<Customer> category = iCustomerService.findById(cusId);
        if (category.isPresent()){
            return category.get();
        }
        throw new NotFoundException("Không tìm thấy danh mục: " + cusId);
    }
}
