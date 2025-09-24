package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.teacup.teacuppicturebackend.model.entity.Picture;
import generator.service.PictureService;
import generator.mapper.PictureMapper;
import org.springframework.stereotype.Service;

/**
* @author wolves
* @description 针对表【picture(图片)】的数据库操作Service实现
* @createDate 2025-09-19 18:04:12
*/
@Service
public class PictureServiceImpl extends ServiceImpl<PictureMapper, Picture>
    implements PictureService{

}




