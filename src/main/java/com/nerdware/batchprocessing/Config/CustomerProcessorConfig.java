package com.nerdware.batchprocessing.Config;


import com.nerdware.batchprocessing.Entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessorConfig implements ItemProcessor<Customer, Customer> {

        @Override
        public Customer process(Customer customer) throws Exception {

            return customer;
        }
}
