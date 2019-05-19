package com.server.cooperation.entity.mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "user_team")
@Getter
@Setter
public class UserTeam {

    @Id
    private String id;
    private String userId;//用户id
    private String teamId;//团队id
    private String status;//用户在当前组内状态
    private Date createDate;
    private Date updateDate;

}
