package com.atguigu.gmall.index.service;

import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.index.feign.GmallPmsClient;
import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.atguigu.gmall.pms.vo.CategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Qiao
 * @Description
 * @Date Created in 19:42 2020/5/2
 * @Version 1.0
 */
@Service
public class IndexService {

    @Autowired
    private GmallPmsClient gmallPmsClient;

    public List<CategoryEntity> queryLvl1Categories() {
        Resp<List<CategoryEntity>> listResp = this.gmallPmsClient.queryCategoriesByPidOrLevel(1, null);

        return listResp.getData();
    }

    public List<CategoryVO> querySubCategories(Long pid) {
        // 查询数据库
        Resp<List<CategoryVO>> listResp = gmallPmsClient.querySubCategories(pid);
        List<CategoryVO> categoryVOS = listResp.getData();
        return listResp.getData();
    }

}
