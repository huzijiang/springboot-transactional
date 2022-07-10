package com.xirm.demo.controller;

import com.xirm.demo.service.TeacherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author huzj
 * @version 1.0
 * @date 2022/6/17 17:17
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    TeacherService teacherService;

    @GetMapping("/delete")
    public void deleteTeacher(int id) throws Exception {

        teacherService.deleteTeacher(id);
    }
}
