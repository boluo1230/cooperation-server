package com.server.cooperation.controller;

import com.server.cooperation.base.bean.Result;
import com.server.cooperation.service.UserGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/group")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserGroupController {

    private final UserGroupService userGroupService;

    @RequestMapping("/list")
    public Result getGroupList(String userId, String teamId) {
        return Result.success(userGroupService.getGroupListByUserId(userId, teamId));
    }

}
