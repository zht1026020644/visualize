package com.zjlab.visualize.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zht
 * @date 2023年06月2023/6/7日 2:40 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainData {
    private Integer id;
    private Integer dipCode;
    private Double cost;
    private String DataTime;
}
