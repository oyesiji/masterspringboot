package com.example.demodocker;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController
{
    @RequestMapping("/")
    public List<Customer> findAll()
    {
    	Map<String, String> env = System.getenv();
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(1, "frank"));
        customerList.add(new Customer(2, "john"));
        customerList.add(new Customer(3, "jubril"));
        customerList.add(new Customer(4, env.get("OPENSHIFT_LASTNAME")));
        return customerList;
    }
}