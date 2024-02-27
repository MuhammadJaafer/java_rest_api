package com.devtiro.database.services;

import com.devtiro.database.domain.entities.AuthorEntity;

import java.util.List;

public interface AuthorService {
    AuthorEntity save(AuthorEntity authorEntity);

    List<AuthorEntity> findAll();

    AuthorEntity findById(Long id);

    boolean isExist(Long id);

    AuthorEntity partialUpdate(Long id, AuthorEntity authorEntity);

    void delete(Long id);
}
