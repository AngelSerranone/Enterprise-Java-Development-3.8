package com.ironhack.Lab3_8.repository;
import com.ironhack.Lab3_8.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {

}
