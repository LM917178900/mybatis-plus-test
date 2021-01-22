package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.mapper.SysLogMapper;
import com.example.demo.model.ApiResult;
import com.example.demo.model.SysLog;
import com.example.demo.model.SysLogVo;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @description: SysLogController
 * @author: leiming5
 * @date: 2021-01-22 11:24
 */
@RestController
public class SysLogController {

    /**
     * sysLog mapper
     */
    @Resource
    private SysLogMapper sysLogMapper;

    /**
     * 通过id 查询系统日志
     *
     * @param id 日志id
     * @return 日志对象
     * @author leiming5
     */
    @GetMapping("/test/getById")
    public ApiResult getById(@RequestParam("id") Long id){

        SysLog sysLog = sysLogMapper.getById(id);
        System.out.println("==========> name:" + id);

//        JSONObject jb  = JSONObject.parseObject((String) sysLog.getLogData());
//
//        System.out.println("===>" + jb.getString("msg"));
//        System.out.println("===>" + jb.getString("data"));
//        System.out.println("===>" + jb.getString("time"));
        return ApiResult.ok(sysLog);
    }

    /**
     * 新增日志对象
     *
     * @param sysLogVo 日志对象
     * @return 操作结果
     * @author leiming5
     */
    @PostMapping("/test/add")
    public ApiResult add(@RequestBody SysLogVo sysLogVo){

//        SysLog sysLog = new SysLog();
//        BeanUtils.copyProperties(sysLogVo, sysLog);
//        sysLog.setLogData(JSON.toJSONString(sysLogVo.getLogData()));
//        sysLog.setGmtCreate(new Date());
//
//        List<SysLog> logs = Collections.singletonList(sysLog);
//        sysLogMapper.batchInsert(logs);

        return ApiResult.ok();
    }

    /**
     * 修改日志对象，没有修改，只有新增
     *
     * @param sysLogVo 日志对象
     * @return 操作结果
     * @author leiming5
     */
    @PostMapping("/test/edit")
    public ApiResult edit(@RequestBody SysLogVo sysLogVo){
//
//        SysLog sysLog = new SysLog();
//        BeanUtils.copyProperties(sysLogVo, sysLog);
//        sysLog.setLogData(JSON.toJSONString(sysLogVo.getLogData()));
//        sysLog.setGmtCreate(new Date());
//
//        List<SysLog> logs = Collections.singletonList(sysLog);
//        sysLogMapper.batchInsert(logs);

        return ApiResult.ok();
    }
}
