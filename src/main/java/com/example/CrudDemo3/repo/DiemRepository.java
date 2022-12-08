package com.example.CrudDemo3.repo;

import com.example.CrudDemo3.entity.Diem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiemRepository extends JpaRepository<Diem,Long> {
}
