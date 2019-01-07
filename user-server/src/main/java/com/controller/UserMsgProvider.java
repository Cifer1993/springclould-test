package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2019/1/5.
 */
@RestController
public class UserMsgProvider {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String sendKafka(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("发送消息");
        try {
            String message = "{\"allKindcode\":\"050602,050931,051047,050202,050501,050711,050712,050232,050451,050930,050932,050933,050934,050211,050253,050261,050936,050937,050311,050935,050441,050461,050938,050643,050917,050100\",\"vehicleTonnage\":0,\"vehicleMaker\":\"神龙汽车有限公司\",\"businessNature\":\"5\",\"riskModelLevel\":1,\"familyName\":\"爱丽舍\",\"vehicleWeight\":\"1620\",\"brandName\":\"雪铁龙\",\"allPremium\":\"720.33,108.05,66.27,856.31,173.95,1.79,4.64,68.94,21.41,128.45,34.79,0.27,0.70,272.24,85.63,247.45,37.12,40.84,61.46,12.29,133.89,42.81,6.42,71.41,14.28,665.0\",\"dmflag\":\"0136\",\"coefficient3\":0.1,\"inserttime\":{\"time\":1519808803000,\"minutes\":6,\"seconds\":43,\"hours\":17,\"month\":1,\"year\":118,\"timezoneOffset\":-480,\"day\":3,\"date\":28},\"vehicleExhaust\":1.587,\"ciTotalPremium\":665,\"handler1Code\":\"09041914\",\"licenseNo\":\"粤B5V6H8\",\"vehicleYear\":\"2014\",\"ciPoundage\":-551.9,\"vehicleMakerID\":\"MK0693\",\"vehicleSeat\":5,\"vehicleID\":\"XTAAFD0110\",\"vehicleQuality\":1206,\"agentCode\":\"000051200001\",\"biTotalPremium\":3211.74,\"biPoundage\":-2665.49,\"brandID\":\"XTA\",\"groupId\":\"XTA1AF04\",\"engineNo\":\"3072365\",\"vehicleName\":\"东风雪铁龙DC7162LYCA轿车\",\"enginePower\":\"86\",\"vehicleClass\":\"轿车类\",\"familyID\":\"XTAAF\",\"familyIDNew\":\"\",\"uuid\":\"451c53c5-bebe-4cc5-93a0-02ac7179b837\",\"frameNo\":\"LDC643T3XF3254629\"}";
            kafkaTemplate.send("kafkatest", message);
            return "ResultCode.SUCCESS"+"发送kafka成功";
        } catch (Exception e) {
            return "ResultCode.EXCEPTION"+"发送kafka失败";
        }
    }
}
