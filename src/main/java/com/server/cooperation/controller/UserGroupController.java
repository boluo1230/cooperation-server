package com.server.cooperation.controller;

import com.server.cooperation.base.bean.Result;
import com.server.cooperation.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/group")
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserGroupController {

    @Autowired
    private UserGroupService userGroupService;

    @RequestMapping("/list")
    public Result getGroupList(String userId) {
        return Result.success(userGroupService.getGroupListByUserId(userId));
    }

}
