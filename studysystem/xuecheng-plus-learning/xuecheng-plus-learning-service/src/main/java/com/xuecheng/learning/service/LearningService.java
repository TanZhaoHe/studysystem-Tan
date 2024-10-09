package com.xuecheng.learning.service;

import com.xuecheng.base.model.RestResponse;

/**
 * @author Mr.Tan
 * @version 1.0
 * @description 在线学习相关的接口
 * @date 2024/5/28 10:17
 */
public interface LearningService {

    /**
     * @description 获取教学视频
     * @param courseId 课程id
     * @param teachplanId 课程计划id
     * @param mediaId 视频文件id
     * @return com.xuecheng.base.model.RestResponse<java.lang.String>
     * @author Mr.Tan
     * @date 2024/5/5 9:08
     */
    public RestResponse<String> getVideo(String userId, Long courseId, Long teachplanId, String mediaId);

}
