package com.app.serviceImpl;

import com.app.mapper.StudentMapper;
import com.app.model.Student;
import com.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by xiaojunzhou on 2016/3/1.
 */
@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public int addStudent(Student student) {
        return studentMapper.insertStudent(student);
    }
}
