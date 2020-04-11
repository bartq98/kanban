package com.example.kanban.entities.membership;

import com.example.kanban.entities.boards.Board;
import com.example.kanban.entities.users.Users;

import javax.persistence.*;


@Entity
public class Membership {
    @Id private Integer id;
    private Integer userId;
    private Integer boardId;
    @Enumerated(EnumType.STRING)
    private MemberType member_type;

    @ManyToOne //;)-<-<
    private Users user;

    @ManyToOne
    private Board board;

    public void setMember_type(MemberType member_type) {
        this.member_type = member_type;
    }

    public Integer getUserId() {
        return this.user.getId();
    }

    public Integer getBoardId() {
        return this.boardId;
    }

    public void setBoard(Integer boardId) {
        this.boardId = boardId;
    }

    public void setUser(Users userId) {
        this.user = userId;
    }
}
