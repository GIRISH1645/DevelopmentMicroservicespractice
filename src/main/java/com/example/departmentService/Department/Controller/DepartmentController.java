package com.example.departmentService.Department.Controller;

import com.example.departmentService.Department.Entity.DepartmentEntity;
import com.example.departmentService.Department.Service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

@PostMapping("/Savedepartment")
    public DepartmentEntity saveDepartment(@RequestBody DepartmentEntity department){
    log.info("SaveDepartment Controller Class");
        return departmentService.saveDepartment(department);
    }
@GetMapping("/{id}")
    public DepartmentEntity findDepartmentbyId(@PathVariable("id") Long departmentId){
    log.info("FindDepartmentby id");
    return departmentService.findDepartmentById(departmentId);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDepartmentEntry(@PathVariable("id") Long departmentId){
    return departmentService.deleteDepartment(departmentId);
    }
}
