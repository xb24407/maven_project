package com.app.mapper;

import com.app.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

/**
 * Created by xiaojunzhou on 2016/3/1.
 */
@Component
public interface StudentMapper {
//    @Insert("INSERT INTO students(name, email) VALUES (#{name}, #{email})")
    int insertStudent(Student student);

    @Select("SELECT * FROM students WHERE stud_id=#{id}")
    @Results(value = {
            @Result(id=true, property="id", column = "stud_id", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "name", column = "name"),
            @Result(property = "email", column = "email")
    })
    Student selectStudent(Integer id);
}
