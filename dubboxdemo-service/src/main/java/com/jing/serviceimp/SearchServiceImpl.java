package com.jing.serviceimp;

import com.alibaba.dubbo.config.annotation.Service;
import com.jing.service.SearchService;

/**
 * @ClassName:SearchServiceImpl
 * @Description: TODO
 * @Author:RanMoAnRan
 * @Date:2019/6/10 17:20
 * @Version: 1.0
 */
@Service
public class SearchServiceImpl implements SearchService {
    @Override
    public String query(String keywords) {
        return "你的搜索结果是: " + keywords;
    }
}
