package com.example.departmentService.Department.Service;

import com.example.departmentService.Department.Entity.DepartmentEntity;
import com.example.departmentService.Department.Repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository ;

    public DepartmentEntity saveDepartment(DepartmentEntity department) {
        log.info("SaveDepartment of service class");
        return  departmentRepository.save(department);
    }

    public DepartmentEntity findDepartmentById(Long departmentId) {
        log.info("FInd service");
        return departmentRepository.findByDepartmentId(departmentId);
    }

    public String deleteDepartment(Long departmentId) {
        departmentRepository.deleteById(departmentId);
        return "Deleted";
    }
}
