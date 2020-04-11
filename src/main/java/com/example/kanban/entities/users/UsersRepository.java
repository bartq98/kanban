package com.example.kanban.entities.users;

import com.example.kanban.entities.membership.Membership;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersRepository extends CrudRepository<Users, Integer> {

   @Query("SELECT u.memberships FROM Users u")
    List<Membership> getAllMemberships(Integer id);

}