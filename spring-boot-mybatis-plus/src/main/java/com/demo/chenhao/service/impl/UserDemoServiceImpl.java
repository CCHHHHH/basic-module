package com.demo.chenhao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.chenhao.dao.UserDemoMapper;
import com.demo.chenhao.domain.UserDemo;
import com.demo.chenhao.service.IUserDemoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenhao
 * @date 2023/2/14 09:58
 **/
@Service
public class UserDemoServiceImpl extends ServiceImpl<UserDemoMapper, UserDemo> implements IUserDemoService {

    @Override
    public List<UserDemo> getUserDemoList() {
        return this.list();
    }
}
