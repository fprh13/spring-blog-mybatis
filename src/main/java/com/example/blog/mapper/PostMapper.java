package com.example.blog.mapper;

import com.example.blog.vo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> findAll();
    List<Post> findByPage(@Param("limit") Integer limit ,@Param("offset") Integer offset);
}