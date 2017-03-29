package com.peddi.dep.service;

import com.peddi.dep.domain.StudentVO;

import java.io.IOException;

/**
 * Created by Peddi on 3/16/17.
 */
public interface StudentService {
    public StudentVO getStudentDetails(int id) throws IOException;
}
