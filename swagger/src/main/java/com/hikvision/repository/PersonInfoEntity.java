package com.hikvision.repository;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description（类描述）: 测试人员Model
 * @author（创建人）: xuwenbiao
 * @Date 2022/11/8 9:25
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(value = "人员信息测试类")
public class PersonInfoEntity {

    @ApiModelProperty(value = "主键uuid", required = false)
    String id;

    @ApiModelProperty(value = "姓名", required = true)//不管用，只能在可视化页面上面提示。swagger上的注解只能起到显示和声明的作用。
    String name;

    @ApiModelProperty(value = "年龄", required = false)
    String age;
}
