package com.peddi.dep.controller;

import com.peddi.dep.domain.StudentVO;
import com.peddi.dep.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by peddi on 3/15/17.
 */
@RestController
public class StudentController {
    @Autowired
    public StudentServiceImpl studentServiceImpl;
    @RequestMapping("/getStudent")
    public StudentVO getStudent(@RequestParam(value = "id") int id){
        return studentServiceImpl.getStudentDetails(id);
    }

}
