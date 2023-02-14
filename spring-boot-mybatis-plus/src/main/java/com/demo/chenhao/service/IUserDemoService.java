package com.demo.chenhao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.chenhao.domain.UserDemo;

import java.util.List;

/**
 * @author chenhao
 * @date 2023/2/14 09:50
 **/
public interface IUserDemoService extends IService<UserDemo> {
    /**
     * 查询用户列表接口
     * @return
     */
    List<UserDemo> getUserDemoList();
}
