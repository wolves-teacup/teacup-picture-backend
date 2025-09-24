package com.teacup.teacuppicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.teacup.teacuppicturebackend.common.BaseResponse;
import com.teacup.teacuppicturebackend.common.DeleteRequest;
import com.teacup.teacuppicturebackend.model.dto.picture.*;
import com.teacup.teacuppicturebackend.model.entity.Picture;
import com.teacup.teacuppicturebackend.model.vo.PictureVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;
import com.teacup.teacuppicturebackend.model.entity.User;

import javax.servlet.http.HttpServletRequest;

/**
* @author wolves
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-09-19 17:57:30
*/
public interface PictureService extends IService<Picture> {


    //上传图片
    PictureVO uploadPicture(Object inputSource,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);


    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    void validPicture(Picture picture);

    /**
     * 图片审核
     * @param pictureReviewRequest
     * @param loginUser
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);


    //补充审核参数
    void fillReviewParams(Picture picture, User loginUser);

    //批量抓取和创建图片
    Integer uploadPictureByBatch(
            PictureUploadByBatchRequest pictureUploadByBatchRequest,
            User loginUser
    );
}
