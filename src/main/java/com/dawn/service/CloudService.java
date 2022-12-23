package com.dawn.service;

import com.dawn.mapper.CloudMapper;
import com.dawn.pojo.Cloud;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CloudService {
    @Resource
    CloudMapper cloudMapper;
    public Cloud getKey(Long id){
        return cloudMapper.selectById(id);
    }
    public List<Cloud> selectAll(){
        return cloudMapper.selectAll();
    }
}
