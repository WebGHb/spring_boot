package com.hikvision.repository;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description（类描述）: 土壤信息表
 * @author（创建人）: xuwenbiao
 * @Date 2022/11/10 10:31
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(value = "SoilInfoEntity对象", description = "土壤信息表")
@TableName("tb_soil_info")
public class SoilInfoEntity {

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "温度")
    @TableField(value = "temperature", exist = true)
    String temperature;

    @ApiModelProperty(value = "盐度")
    @TableField(value = "salinity", exist = true)
    String salinity;

    @ApiModelProperty(value = "PH值")
    @TableField(value = "ph", exist = true)
    String ph;

    @ApiModelProperty(value = "含水率")
    @TableField(value = "rowc", exist = true)
    String rowc;

    @ApiModelProperty(value = "电导率")
    @TableField(value = "conductivity", exist = true)
    String conductivity;

    @ApiModelProperty(value = "TDS总溶解固体")
    @TableField(value = "tds", exist = true)
    String tds;


    //扩展字段
    @TableField(value = "预留字段", exist = false)
    String extend;
    @TableField(value = "预留字段2", exist = false)
    String extend2;
    @TableField(value = "预留字段3", exist = false)
    String extend3;
}
