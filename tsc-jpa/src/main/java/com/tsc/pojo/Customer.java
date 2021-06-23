package com.tsc.pojo;

import javax.persistence.*;
import java.io.Serializable;
/**
 *		* 所有的注解都是使用JPA的规范提供的注解，
 *		* 所以在导入注解包的时候，一定要导入javax.persistence下的
 */
@Entity
@Table(name = "cst_customer")
public class Customer implements Serializable {
    @Id //声明当前私有属性为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //配置主键的生成策略
    @Column(name = "cust_id") //指定和表中cust_id字段的映射关系
    private Long cusId;
    @Column(name = "cust_name")
    private String custName;
    @Column(name = "cust_source") //指定和表中cust_name字段的映射关系
    private String custSource;
    @Column(name="cust_industry")//指定和表中cust_industry字段的映射关系
    private String custIndustry;
    @Column(name="cust_level")//指定和表中cust_level字段的映射关系
    private String custLevel;
    @Column(name="cust_address")//指定和表中cust_address字段的映射关系
    private String custAddress;
    @Column(name="cust_phone")//指定和表中cust_phone字段的映射关系
    private String custPhone;

    public Long getCusId() {
        return cusId;
    }

    public void setCusId(Long cusId) {
        this.cusId = cusId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
}
