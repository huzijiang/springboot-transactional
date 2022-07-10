package com.xirm.demo.service.impl;

import com.xirm.demo.repository.StudentMapper;
import com.xirm.demo.repository.TeacherMapper;
import com.xirm.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author huzj
 * @version 1.0
 * @date 2022/6/17 16:42
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    public TeacherMapper teacherMapper;

    @Autowired
    public StudentMapper studentMapper;

    /**
     * delete teacher
     */
    @Override
    @Transactional(rollbackFor=Exception.class)
    public void deleteTeacher(int id) throws Exception {
        int i=studentMapper.deleteByPrimaryKey(id);
        int j=teacherMapper.deleteByPrimaryKey(id);
        if(j==0){
            throw new Exception("删除失败！");
        }
    }


}
