package com.hikvision.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description（类描述）: 一句话描述该类的功能
 * @author（创建人）: user
 * @Date 2022/11/9 9:33
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

    private String name;
    private String age;
    private String phone;

}
