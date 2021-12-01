package com.fan.doexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.fan.bean.CNDC;
import com.fan.listener.MyExcelListener;

public class DoExcel {
    public static void main(String[] args) {
        readExcel();
    }
    public static void readExcel(){
        ExcelReaderBuilder read = EasyExcel.read("3.xls", CNDC.class, new MyExcelListener());
        read.sheet().doRead();
    }
}
