package com.demo.chenhao.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.chenhao.domain.UserDemo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chenhao
 * @date 2023/2/14 09:58
 **/
@Mapper
public interface UserDemoMapper extends BaseMapper<UserDemo> {
}
