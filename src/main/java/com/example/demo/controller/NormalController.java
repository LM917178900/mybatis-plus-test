package com.example.demo.controller;

import com.example.demo.model.ApiCode;
import com.example.demo.model.ApiResult;
import com.example.demo.service.INormalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @description: NormalController
 * @author: leiming5
 * @date: 2020-12-29 09:07
 */
@RestController
public class NormalController {

    /**
     * service 接口哦
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
    public ApiResult getById(Long id) throws InterruptedException {

        Thread.sleep(3000);

        if (id == null) {
            return ApiResult.fail(ApiCode.PARAMETER_EXCEPTION);
        }

        return ApiResult.ok(normalService.getById(id));
    }

    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    @GetMapping("normal/getByMap")
    public List<Map<String, Object>> getByMap(Long id) {

        return normalService.getByMap(id);
    }
}
