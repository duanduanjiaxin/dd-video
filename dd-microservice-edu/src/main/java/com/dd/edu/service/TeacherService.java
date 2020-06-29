package com.dd.edu.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dd.edu.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dd.edu.query.TeacherQuery;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author jx.duan
 * @since 2020-04-14
 */
public interface TeacherService extends IService<Teacher> {

    void pageQuery(Page<Teacher> pageParam, TeacherQuery teacherQuery);
}
