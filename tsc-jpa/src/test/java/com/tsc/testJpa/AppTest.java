package com.tsc.testJpa;

import static org.junit.Assert.assertTrue;

import com.tsc.pojo.Customer;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
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

        EntityManagerFactory myJpa = Persistence.createEntityManagerFactory("myJpa");
        //创建实体管理类
        EntityManager entityManager = myJpa.createEntityManager();
        //获取事务对象
        EntityTransaction transaction = entityManager.getTransaction();
        //开启事务
        transaction.begin();
        Customer customer = new Customer();
        customer.setCustName("测试员");
        //保存操作
        entityManager.persist(customer);
        //提交事务
        transaction.commit();
        entityManager.clear();
        myJpa.close();

    }
}
