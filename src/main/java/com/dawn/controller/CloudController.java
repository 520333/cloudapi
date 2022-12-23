package com.dawn.controller;

import com.dawn.pojo.Cloud;
import com.dawn.service.CloudService;
import com.dawn.utils.eCloudJDK;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)//允许跨域
public class CloudController {
    @Resource
    private CloudService cloudService;

    @GetMapping("/cloud")
    public String selectById(@RequestParam Long id,@RequestParam String messageType){

        eCloudJDK e = new eCloudJDK();
        e.accessKey = cloudService.getKey(id).getAccessKey();
        e.secretKey = cloudService.getKey(id).getSecretKey();
        e.TITLE_RENEW = messageType;
        String uri = e.doSignature("/api/openapi-messagecenter/userMessageCenter/list", "GET", new HashMap<>());
        String hp = String.format("https://%s", "ecloud.10086.cn");
        System.out.println(hp+uri);
        return eCloudJDK.doForResponse(hp+uri, "GET");
    }
    @GetMapping("/cloud/all")
    public Map<String, Object> selectAll(){

        List<Cloud> cloud = cloudService.selectAll();
        for (Cloud c:cloud) {
            c.setAccessKey(null);
            c.setSecretKey(null);
        }
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("all",cloud);
        return map;
    }

}
