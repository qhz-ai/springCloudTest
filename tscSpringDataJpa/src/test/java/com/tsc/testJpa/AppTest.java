package com.tsc.testJpa;

import static org.junit.Assert.assertTrue;

import com.tsc.dao.CustomerDao;
import com.tsc.entity.Customer;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class AppTest 
{
    @Autowired
    private CustomerDao customerDao;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void test(){
        Customer customer = new Customer();
        customer.setCustName("小新");
        customerDao.save(customer);

    }
    @Test
    public void test2(){

        Customer one = customerDao.findOne(1l);
        one.setCustName("小名");
        //更新
        customerDao.save(one);
    }
    @Test
    public void test3(){
        customerDao.updateCustomer("晓明",1l);
    }
    @Test
    public void testSpecification(){
        //使用匿名内部类的方式，创建一个Specification的实现类，并实现toPredicate方法
        Specification<Customer> custName = new Specification<Customer>() {

            @Override
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                return criteriaBuilder.like(root.get("custName").as(String.class), "晓明%");
            }
        };
        //Customer one = customerDao.findOne(custName);
        //System.out.println(one);
        Pageable pageable = new PageRequest(0, 5);
        Page<Customer> all = customerDao.findAll(custName,  pageable);
        System.out.println( all.getTotalPages());


    }

}
