package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// <Bean, Type of Primary Key>
public interface PostRepository extends JpaRepository<Post, Integer> {

}
