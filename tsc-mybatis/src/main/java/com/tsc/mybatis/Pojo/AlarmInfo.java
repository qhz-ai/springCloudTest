package com.tsc.mybatis.Pojo;

public class AlarmInfo {
    private Integer id;
    private Integer device_id;
    private String device_ip;
    private String resource_name;
    private String resource_type;
    private String alarm_type;
    private String alarm_grade;
    private String alarm_why;
    private String crate_time;
    private String deal_user;
    private String deal_time;
    private String is_confirm;
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDevice_id() {
        return device_id;
    }

    public void setDevice_id(Integer device_id) {
        this.device_id = device_id;
    }

    public String getDevice_ip() {
        return device_ip;
    }

    public void setDevice_ip(String device_ip) {
        this.device_ip = device_ip;
    }

    public String getResource_name() {
        return resource_name;
    }

    public void setResource_name(String resource_name) {
        this.resource_name = resource_name;
    }

    public String getResource_type() {
        return resource_type;
    }

    public void setResource_type(String resource_type) {
        this.resource_type = resource_type;
    }

    public String getAlarm_type() {
        return alarm_type;
    }

    public void setAlarm_type(String alarm_type) {
        this.alarm_type = alarm_type;
    }

    public String getAlarm_grade() {
        return alarm_grade;
    }

    public void setAlarm_grade(String alarm_grade) {
        this.alarm_grade = alarm_grade;
    }

    public String getAlarm_why() {
        return alarm_why;
    }

    public void setAlarm_why(String alarm_why) {
        this.alarm_why = alarm_why;
    }

    public String getCrate_time() {
        return crate_time;
    }

    public void setCrate_time(String crate_time) {
        this.crate_time = crate_time;
    }

    public String getDeal_user() {
        return deal_user;
    }

    public void setDeal_user(String deal_user) {
        this.deal_user = deal_user;
    }

    public String getDeal_time() {
        return deal_time;
    }

    public void setDeal_time(String deal_time) {
        this.deal_time = deal_time;
    }

    public String getIs_confirm() {
        return is_confirm;
    }

    public void setIs_confirm(String is_confirm) {
        this.is_confirm = is_confirm;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "AlarmInfo{" +
                "id=" + id +
                ", device_id=" + device_id +
                ", device_ip='" + device_ip + '\'' +
                ", resource_name='" + resource_name + '\'' +
                ", resource_type='" + resource_type + '\'' +
                ", alarm_type='" + alarm_type + '\'' +
                ", alarm_grade='" + alarm_grade + '\'' +
                ", alarm_why='" + alarm_why + '\'' +
                ", crate_time='" + crate_time + '\'' +
                ", deal_user='" + deal_user + '\'' +
                ", deal_time='" + deal_time + '\'' +
                ", is_confirm='" + is_confirm + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
