package com.T;

import com.app.mapper.StudentMapper;
import com.app.model.Student;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * Created by xiaojunzhou on 2016/3/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml", "/spring-mvc.xml"})
public class Test1 {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    private StudentMapper studentMapper;
    @Test
    public void test1() throws Exception{
        System.out.println(dataSource);
//        dataSource.out.println(sqlSessionFactory);
//        System.out.println(studentMapper);
//        Student student = studentMapper.selectStudent(5);
//        System.out.println(student);
        Connection c = dataSource.getConnection();

        System.out.println(c);
    }

    @Test
    public void test2() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "");
        System.out.println("conn = " + conn);
//        PreparedStatement statement = conn.prepareStatement("Select * from students");
//        ResultSet rs = statement.executeQuery();
//        while(rs.next()) {
//           System.out.println( rs.getString(1));
//
//        }
//        statement.close();
        conn.close();
    }
}
