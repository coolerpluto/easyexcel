package com.fan.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.fan.bean.CNDC;
import com.fan.listener.MyExcelListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@RequestMapping("/upload")
@RestController
public class FileController {

    @RequestMapping("/cndc")
    public String writeCNDC(MultipartFile file){
        try {
            ExcelReaderBuilder read = EasyExcel.read(file.getInputStream(), CNDC.class, new MyExcelListener());
            read.sheet().doRead();
            return "success";
        } catch (IOException e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
