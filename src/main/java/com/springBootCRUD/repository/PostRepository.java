package com.springBootCRUD.repository;

import com.springBootCRUD.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
//    Collection<Post> findAllByOrderByCreationDateDesc();


}
