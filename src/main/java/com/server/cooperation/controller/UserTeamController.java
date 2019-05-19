package com.server.cooperation.controller;

import com.server.cooperation.base.bean.Result;
import com.server.cooperation.service.UserTeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/team")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserTeamController {

    private final UserTeamService userTeamService;

    @RequestMapping("/list")
    public Result getGroupList(String userId) {
        return Result.success(userTeamService.getTeamListByUserId(userId));
    }


}
