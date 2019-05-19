package com.server.cooperation.service.impl;

import com.server.cooperation.dao.TeamDao;
import com.server.cooperation.dao.UserTeamDao;
import com.server.cooperation.entity.mongo.Team;
import com.server.cooperation.entity.mongo.UserTeam;
import com.server.cooperation.service.UserTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserTeamServiceImpl implements UserTeamService {

    @Autowired
    private TeamDao teamDao;
    @Autowired
    private UserTeamDao userTeamDao;

    @Override
    public List<Team> getTeamListByUserId(String userId) {
        List<UserTeam> userGroupList = userTeamDao.getUserTeamList(userId);
        List<String> teamIds = userGroupList.stream().map(UserTeam::getTeamId).collect(Collectors.toList());
        return teamDao.getTeamByTeamIds(teamIds);
    }
}
