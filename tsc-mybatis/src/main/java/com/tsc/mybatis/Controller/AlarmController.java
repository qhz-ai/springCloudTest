package com.tsc.mybatis.Controller;

import com.github.pagehelper.PageInfo;
import com.tsc.mybatis.Pojo.AlarmInfo;
import com.tsc.mybatis.Service.AlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AlarmController {

    @Autowired
    private AlarmService alarmService;
    @GetMapping("alarmInfo")
    @ResponseBody
    public List<AlarmInfo> findAll(){
        PageInfo<AlarmInfo> pageInfo = this.alarmService.findAll();
        return pageInfo.getList();
    }
}


