package com.fastcampus.projectboards.repository;

import com.fastcampus.projectboards.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}