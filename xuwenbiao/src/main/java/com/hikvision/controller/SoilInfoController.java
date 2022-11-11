package com.hikvision.controller;

import com.alibaba.fastjson.JSONObject;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hikvision.ga.common.BaseResult;
import com.hikvision.repository.SoilInfoEntity;
import com.hikvision.service.SoilInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description（类描述）: 土壤信息表 前端控制器
 * @author（创建人）: xuwenbiao
 * @Date 2022/11/10 10:52
 */
@Slf4j
@Api(tags = "土壤信息表")
@RestController
@RequestMapping("/soilInfo")
public class SoilInfoController {


    @Autowired
    SoilInfoService soilInfoService;

    @GetMapping("/getByStationId")
    @ApiOperation("根据站点获取土壤信息")
    public BaseResult<Object> getByStationId(@RequestParam String stationId) {
        SoilInfoEntity entity = SoilInfoEntity.builder()
                .id("1231242345153142134")
                .ph("1.3")
                .conductivity("")
                .rowc("")
                .salinity("")
                .tds("")
                .temperature("")
                .build();
//        try {
        return BaseResult.success(entity);
//        } catch (Exception e) {
//            log.error("getSoilInfoByStationId failed : {},{}", e.getMessage(), e);
//            return BaseResult.fail("0x1c020100", "getSoilInfo failed");
//        }
    }

}
