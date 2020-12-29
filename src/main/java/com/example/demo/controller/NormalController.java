package com.example.demo.controller;

import com.example.demo.model.SysTask;
import com.example.demo.service.INormalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: NormalController
 * @author: leiming5
 * @date: 2020-12-29 09:07
 */
@RestController
public class NormalController {

    /**
     *  service 接口哦
     */
    @Resource
    private INormalService normalService;

    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    @GetMapping("normal/getById")
    public List<SysTask> getById(Long id){

        return normalService.getById(id);
    }
}
