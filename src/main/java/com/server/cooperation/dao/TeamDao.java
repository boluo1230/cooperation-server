package com.server.cooperation.dao;

import com.server.cooperation.entity.mongo.Team;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamDao {

    List<Team> getTeamList();

    List<Team> getTeamByTeamIds(List<String> teamIds);

    int saveTeam(Team team);

}
