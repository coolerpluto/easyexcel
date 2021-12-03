package com.fan.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.fan.bean.CNDC;
import com.fan.dao.CNDCDao;
import com.fan.listener.MyExcelListener;
import com.fan.service.impl.CNDCServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("/upload")
@RestController
public class FileController {

    @Autowired
    CNDCServiceImpl cndcService;

    @Autowired
    CNDCDao cndcDao;

    @RequestMapping("/cndc")
    public String writeCNDC(MultipartFile file, @Param("date") Date date){
        try {
            System.out.println("===进入请求控制器");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateStr = dateFormat.format(date);
            List<CNDC> cndcs = cndcService.selectCNDCsByDate(date);
            System.out.println("===获取日期："+dateStr+"有"+cndcs.size()+"个数据");
            Boolean isHas = cndcs.size()>0 ? true : false;
            System.out.println("===开始读取file文件");
            ExcelReaderBuilder read = EasyExcel.read(file.getInputStream(), CNDC.class, new MyExcelListener(cndcDao,dateStr,isHas));
            read.sheet().doRead();
            return "success";
        } catch (IOException e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
