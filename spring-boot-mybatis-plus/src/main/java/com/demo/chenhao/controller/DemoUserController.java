package com.demo.chenhao.controller;

import com.demo.chenhao.service.IUserDemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenhao
 * @date 2023/1/29 16:02
 **/
@RestController
@Api(value = "用户管理接口", tags = {"用户管理接口"})
@RequestMapping("/ch/user")
public class DemoUserController {

    private static Logger logger = Logger.getLogger(DemoUserController.class);

    @Autowired
    private IUserDemoService userDemoService;

    @ApiOperation(value = "用户列表查询接口", notes = "用户列表查询接口")
    @RequestMapping(path = "/getUserDemoList", method = RequestMethod.POST)
    public Object getUserDemoList() {
        return userDemoService.getUserDemoList();
    }
}
