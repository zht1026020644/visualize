package com.zjlab.visualize.mapper;

import com.zjlab.visualize.bean.TrainData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TrainDataMapper {
    List<TrainData> queryList();
}
