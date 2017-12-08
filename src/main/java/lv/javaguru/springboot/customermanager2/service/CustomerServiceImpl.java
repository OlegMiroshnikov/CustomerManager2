package lv.javaguru.springboot.customermanager2.service;

import lv.javaguru.springboot.customermanager2.dao.CustomerDaoImpl;
import lv.javaguru.springboot.customermanager2.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl {

    @Autowired
    private CustomerDaoImpl customerDao;

    public void setCustomerDao(CustomerDaoImpl customerDao) {
        this.customerDao = customerDao;
    }

    @Transactional
    public void addCustomer(Customer customer) {
        this.customerDao.addCustomer(customer);
    }

    @Transactional
    public void updateCustomer(Customer customer) {
        this.customerDao.updateCustomer(customer);
    }

    @Transactional
    public void removeCustomer(int id) {
        this.customerDao.removeCustomer(id);
    }

    @Transactional
    public Customer getCustomerById(int id) {
        return this.customerDao.getCustomerById(id);
    }

    @Transactional
    public List<Customer> listCustomers() {
        return this.customerDao.listCustomers();
    }
}
