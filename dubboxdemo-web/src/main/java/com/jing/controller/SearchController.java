package com.jing.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import com.jing.service.SearchService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author
 * @Description: 服务的消费方. 调用远程的搜索服务
 * @date 2019/6/916:40
 */

@Controller
@RequestMapping("/search")
public class SearchController {


    //找注册中心注入远程的服务
    @Reference
    private SearchService searchService;

    //返回json数据
    @ResponseBody
    @RequestMapping("/query")
    public String query(String keywords){

        return searchService.query(keywords);
    }
}
