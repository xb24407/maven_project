package com.app.controller;

import com.alibaba.druid.filter.AutoLoad;
import com.app.model.Student;
import com.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xiaojunzhou on 2016/3/1.
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("addStudent")
    public ModelAndView addStudent(@RequestParam("name") String name, @RequestParam("email") String email) {
        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        int r = studentService.addStudent(student);
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("id", r);
        String viewName = "addStudent";
        ModelAndView modelAndView = new ModelAndView(viewName, modelMap);
        return modelAndView;
    }
}
