package com.fan.bean;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class CNDC {
    @ExcelIgnore
    private String date;

    @ExcelProperty(value = {"销售部门"},index = 0)
    private String department;

    @ExcelProperty(value = {"合同第一周目标"},index = 3)
    private Double first_target;

//    @ExcelProperty("合同第一周达成")
    @ExcelProperty(value = {"合同第一周达成"},index = 4)
    private Double first_complete;

//    @ExcelProperty("合同第二周目标")
    @ExcelProperty(value = {"合同第二周目标"},index = 5)
    private Double second_target;

//    @ExcelProperty("合同第二周达成")
    @ExcelProperty(value = {"合同第二周达成"},index = 6)
    private Double second_complete;

//    @ExcelProperty("合同第三周目标")
    @ExcelProperty(value = {"合同第三周目标"},index = 7)
    private Double third_target;

//    @ExcelProperty("合同第三周达成")
    @ExcelProperty(value = {"合同第三周达成"},index = 8)
    private Double third_complete;

//    @ExcelProperty("合同第四周目标")
    @ExcelProperty(value = {"合同第四周目标"},index = 9)
    private Double fourth_target;

//    @ExcelProperty("合同第四周达成")
    @ExcelProperty(value = {"合同第四周达成"},index = 10)
    private Double fourth_complete;

//    @ExcelProperty("合同第五周目标")
    @ExcelProperty(value = {"合同第五周目标"},index = 11)
    private Double fifth_target;

//    @ExcelProperty("合同第五周达成")
    @ExcelProperty(value = {"合同第五周达成"},index = 12)
    private Double fifth_complete;

    @ExcelIgnore
    private Double sum_target;

    @ExcelIgnore
    private Double sum_complete;
}
