package com.example.demo.repository;
import com.example.demo.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
public interface HistoryRepository extends JpaRepository<History, Integer> {
}
