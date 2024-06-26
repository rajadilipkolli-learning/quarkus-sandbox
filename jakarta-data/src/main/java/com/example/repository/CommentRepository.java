package com.example.repository;

import java.util.UUID;

import com.example.domain.Comment;

import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, UUID> {
    
}