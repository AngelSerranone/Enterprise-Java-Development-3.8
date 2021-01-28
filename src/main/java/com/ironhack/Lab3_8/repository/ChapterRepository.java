package com.ironhack.Lab3_8.repository;
import com.ironhack.Lab3_8.models.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Integer> {

}
