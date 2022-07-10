package com.xirm.demo.repository;

import com.xirm.demo.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author huzj
 * @date 2022/6/17 16:12
 * @version 1.0
 */
@Repository
@Mapper
public interface TeacherMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}
