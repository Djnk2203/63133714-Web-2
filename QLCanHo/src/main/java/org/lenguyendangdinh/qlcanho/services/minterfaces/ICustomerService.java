package org.lenguyendangdinh.qlcanho.services.minterfaces;

import org.lenguyendangdinh.qlcanho.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerService extends CrudRepository<Customer, Integer> {
}
