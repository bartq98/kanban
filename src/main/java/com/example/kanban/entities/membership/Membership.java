package com.example.kanban.entities.membership;

import com.example.kanban.entities.boards.Board;
import com.example.kanban.entities.users.Users;

import javax.persistence.*;

@Entity
public class Membership {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private Integer userId;
    
    @Column(nullable = false, length = 30)
    private Integer boardId;

    @Enumerated(EnumType.STRING)
    private MemberType member_type;

    @ManyToOne(targetEntity = Users.class)
    private Users user;

    @OneToMany(targetEntity = Board.class, mappedBy = "jeszcze nie wiem")
    private Board board;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuserId() {
        return userId;
    }

    public void setuserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getboardId() {
        return boardId;
    }

    public void setboardId(Integer boardId) {
        this.boardId = boardId;
    }

    public MemberType getMember_type() {
        return member_type;
    }

    public void setMember_type(MemberType member_type) {
        this.member_type = member_type;
    }
}
