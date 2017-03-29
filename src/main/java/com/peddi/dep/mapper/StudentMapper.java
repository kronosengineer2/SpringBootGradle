package com.peddi.dep.mapper;

import com.peddi.dep.domain.StudentFamilyDetailsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;


/**
 * Created by Peddi on 3/17/17.
 */
@Mapper
@Component
public interface StudentMapper {

    @Select("select address,fatherName from first.student where id = #{id}")
    StudentFamilyDetailsVO findStudentFamilyDetailsById(@Param("id") int id);

    @Select("select name from first.student where id = #{id}")
    String findStudentNameById(@Param("id") int id);
}
