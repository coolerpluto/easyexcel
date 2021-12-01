package com.fan.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.fan.bean.CNDC;

public class MyExcelListener extends AnalysisEventListener<CNDC> {
    @Override
    public void invoke(CNDC cndc, AnalysisContext analysisContext) {
        System.out.println(cndc);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
