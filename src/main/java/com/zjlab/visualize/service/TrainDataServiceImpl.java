package com.zjlab.visualize.service;

import com.zjlab.visualize.bean.TrainData;
import com.zjlab.visualize.mapper.TrainDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zht
 * @date 2023年06月2023/6/7日 3:29 下午
 */
@Service
@Transactional
public class TrainDataServiceImpl implements TrainDataService{
    private TrainDataMapper trainDataMapper;

    @Autowired
    public TrainDataServiceImpl(TrainDataMapper trainDataMapper) {
        this.trainDataMapper = trainDataMapper;
    }

    @Override
    public List<TrainData> queryList() {
        return trainDataMapper.queryList();
    }
}
