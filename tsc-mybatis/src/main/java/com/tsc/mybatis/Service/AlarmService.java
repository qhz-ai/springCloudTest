package com.tsc.mybatis.Service;


import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;
import com.tsc.mybatis.Mapper.AlarmMapper;
import com.tsc.mybatis.Pojo.AlarmInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmService {
    @Autowired
    private AlarmMapper alarmMapper;





    public PageInfo<AlarmInfo> findAll(){
        int page=1;
        int pageSize=10;
       // PageHelper.startPage(1, 10);
        PageHelper.startPage(1,10);
        List<AlarmInfo> list = this.alarmMapper.findAll();
        PageInfo<AlarmInfo> alarmInfoPageInfo = new PageInfo<AlarmInfo>(list,pageSize);
        //System.out.println(alarmInfoPageInfo);

        //打印分页信息
        System.out.println("当前页码：第" + alarmInfoPageInfo.getPageNum() + "页");
        System.out.println("分页大小：每页" + alarmInfoPageInfo.getPageSize() + "条");
        System.out.println("数据总数：共" + alarmInfoPageInfo.getTotal() + "条");
        System.out.println("总页数：共" + alarmInfoPageInfo.getPages() + "页");


        return alarmInfoPageInfo;

    }
}
