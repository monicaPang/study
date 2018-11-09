package com.lxk.service;

import com.lxk.dao.StudentDao;
import com.lxk.model.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentService {

    @Resource(name = "studentDao")
    private StudentDao dao;

    public List<Student> getAllStudent(){
        return dao.findAll();
    }
}
