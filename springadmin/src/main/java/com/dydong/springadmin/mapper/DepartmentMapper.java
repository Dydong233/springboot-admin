package com.dydong.springadmin.mapper;

import com.dydong.springadmin.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {
    //1.查询所有部门
    List<Department> getDepartments();
    //2.根据员工id获取部门
    Department getDepartmentById(int pid);
}
