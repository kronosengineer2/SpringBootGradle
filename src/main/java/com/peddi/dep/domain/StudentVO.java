package com.peddi.dep.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by peddi on 3/16/17.
 */
public class StudentVO {

    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    int id;

    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String name;

    @JsonProperty("studentFamilyDetailsVO")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    StudentFamilyDetailsVO studentFamilyDetailsVO;

    public StudentFamilyDetailsVO getStudentFamilyDetailsVO() {
        return studentFamilyDetailsVO;
    }

    public void setStudentFamilyDetailsVO(StudentFamilyDetailsVO studentFamilyDetailsVO) {
        this.studentFamilyDetailsVO = studentFamilyDetailsVO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
