package com.atguigu.gmall.pms.vo;

import com.atguigu.gmall.pms.entity.ProductAttrValueEntity;
import lombok.Data;

import java.util.List;

/**
 * @Author: Qiao
 * @Description
 * @Date Created in 10:20 2020/5/6
 * @Version 1.0
 */
@Data
public class ItemGroupVO {

    private String name;

    private List<ProductAttrValueEntity> baseAttrs;
}
