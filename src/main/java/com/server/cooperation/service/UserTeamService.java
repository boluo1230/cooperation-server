package com.server.cooperation.service;

import com.server.cooperation.entity.mongo.Team;

import java.util.List;

public interface UserTeamService {

    List<Team> getTeamListByUserId(String userId);

}
