package com.SpringbootTraining.WebsiteUsers.repository;

import com.SpringbootTraining.WebsiteUsers.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebUsersRepository extends JpaRepository<Users, Integer> {
}
