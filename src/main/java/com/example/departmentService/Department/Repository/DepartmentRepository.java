package com.example.departmentService.Department.Repository;

import com.example.departmentService.Department.Entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {
    DepartmentEntity findByDepartmentId(Long departmentId);
}
