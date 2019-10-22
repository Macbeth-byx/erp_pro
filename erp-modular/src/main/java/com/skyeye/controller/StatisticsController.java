package com.skyeye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skyeye.common.object.InputObject;
import com.skyeye.common.object.OutputObject;
import com.skyeye.service.StatisticsService;

@Controller
public class StatisticsController {
	
	@Autowired
	private StatisticsService statisticsService;
	
	/**
     * 入库明细
     * @param inputObject
     * @param outputObject
     * @throws Exception
     */
    @RequestMapping("/post/StatisticsController/queryWarehousingDetails")
    @ResponseBody
    public void queryWarehousingDetails(InputObject inputObject, OutputObject outputObject) throws Exception{
    	statisticsService.queryWarehousingDetails(inputObject, outputObject);
    }
    
    /**
     * 出库明细
     * @param inputObject
     * @param outputObject
     * @throws Exception
     */
    @RequestMapping("/post/StatisticsController/queryOutgoingDetails")
    @ResponseBody
    public void queryOutgoingDetails(InputObject inputObject, OutputObject outputObject) throws Exception{
    	statisticsService.queryOutgoingDetails(inputObject, outputObject);
    }
    
    /**
     * 进货统计
     * @param inputObject
     * @param outputObject
     * @throws Exception
     */
    @RequestMapping("/post/StatisticsController/queryInComimgDetails")
    @ResponseBody
    public void queryInComimgDetails(InputObject inputObject, OutputObject outputObject) throws Exception{
    	statisticsService.queryInComimgDetails(inputObject, outputObject);
    }
    
    /**
     * 销售统计
     * @param inputObject
     * @param outputObject
     * @throws Exception
     */
    @RequestMapping("/post/StatisticsController/querySalesDetails")
    @ResponseBody
    public void querySalesDetails(InputObject inputObject, OutputObject outputObject) throws Exception{
    	statisticsService.querySalesDetails(inputObject, outputObject);
    }
	
}
