package com.hikvision.repository;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description（类描述）: 一句话描述该类的功能
 * @author（创建人）: user
 * @Date 2022/11/8 19:02
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("person_info")
public class PersonInfo {


    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(value = "name")
    private String name;

    @TableField(value = "age")
    private String age;

}
