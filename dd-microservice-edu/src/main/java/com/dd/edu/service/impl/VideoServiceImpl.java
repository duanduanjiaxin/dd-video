package com.dd.edu.service.impl;

import com.dd.edu.entity.Video;
import com.dd.edu.mapper.VideoMapper;
import com.dd.edu.service.VideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课程视频 服务实现类
 * </p>
 *
 * @author jx.duan
 * @since 2020-04-14
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {

}
