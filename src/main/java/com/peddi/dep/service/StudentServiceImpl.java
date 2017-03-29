package com.peddi.dep.service;

import com.peddi.dep.dao.StudentDAO;
import com.peddi.dep.domain.StudentFamilyDetailsVO;
import com.peddi.dep.domain.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by peddi on 3/16/17.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDAO studentDAO;
    StudentVO studentVO = new StudentVO();
    public StudentVO getStudentDetails(int id){
        studentVO.setId(id);
        studentVO.setName(studentDAO.getStudentDetails(id));
        studentVO.setStudentFamilyDetailsVO(studentDAO.getStudentFamilyDetails(id));
        return studentVO;
    }
}
