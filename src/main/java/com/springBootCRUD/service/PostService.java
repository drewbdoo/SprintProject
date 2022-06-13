package com.springBootCRUD.service;

import com.springBootCRUD.model.Post;
import org.springframework.data.domain.Page;

import java.util.Collection;
import java.util.List;

public interface PostService {

    List<Post> getAllPosts();
    void savePost(Post post);
    Post getPostById(Long id);
    void deletePostById(Long id);
    Page<Post> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
