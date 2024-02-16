package com.app.booksrestapi.repository;

import com.app.booksrestapi.model.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, String> {

    Language findFirstByCode(String code);
}
