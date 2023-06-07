package com.zjlab.visualize.controller;

import com.zjlab.visualize.bean.TrainData;
import com.zjlab.visualize.service.TrainDataService;
import com.zjlab.visualize.service.TrainDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zht
 * @date 2023年06月2023/6/7日 3:31 下午
 */
@RestController
@RequestMapping("data")
public class TrainDataController {
    private TrainDataService trainDataService;

    @Autowired
    public TrainDataController(TrainDataService trainDataService) {
        this.trainDataService = trainDataService;
    }

    @RequestMapping("list")
    public List<TrainData> list(){
        return trainDataService.queryList();
    }
}
