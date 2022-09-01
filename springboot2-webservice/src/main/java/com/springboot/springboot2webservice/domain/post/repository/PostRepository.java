package com.springboot.springboot2webservice.domain.post.repository;

import com.springboot.springboot2webservice.domain.post.Post;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> , CustomPostRepository{


    @EntityGraph(attributePaths = {"writer"})
    Optional<Post> findWithWriterById(Long id);

    @Override
    void delete(Post entity);
}
