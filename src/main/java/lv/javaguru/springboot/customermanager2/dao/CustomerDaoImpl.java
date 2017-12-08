package lv.javaguru.springboot.customermanager2.dao;

import lv.javaguru.springboot.customermanager2.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImpl {
    private static final Logger logger = LoggerFactory.getLogger(CustomerDaoImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addCustomer(Customer customer) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(customer);
        logger.info("Customer successfully saved. Customer details: " + customer);
    }

    public void updateCustomer(Customer customer) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(customer);
        logger.info("Customer successfully update. Customer details: " + customer);
    }

    public void removeCustomer(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Customer customer = (Customer) session.load(Customer.class, new Integer(id));
        if (customer != null) {
            session.delete(customer);
        }
        logger.info("Customer successfully removed. Customer details: " + customer);
    }

    public Customer getCustomerById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Customer customer = (Customer) session.load(Customer.class, new Integer(id));
        logger.info("Customer successfully loaded. Customer details: " + customer);
        return customer;
    }

    public List<Customer> listCustomers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Customer> customerList = session.createQuery("from Customer").list();
        for (Customer customer : customerList) {
            logger.info("Customer list: " + customer);
        }
        return customerList;
    }
}
