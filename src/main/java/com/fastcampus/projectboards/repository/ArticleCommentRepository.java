package com.fastcampus.projectboards.repository;

import com.fastcampus.projectboards.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
