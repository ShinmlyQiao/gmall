package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Qiao
 * @email 
 * @date 2020-04-28 10:53:06
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
