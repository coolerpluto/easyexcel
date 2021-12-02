package com.fan.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.fan.bean.CNDC;
import com.fan.dao.CNDCDao;
import com.fan.service.impl.CNDCServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MyExcelListener extends AnalysisEventListener<CNDC> {

    private CNDCDao cndcDao;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private String date;
    private Boolean isHas;

    public MyExcelListener(CNDCDao cndcDao,String date, Boolean isHas){
        this.cndcDao = cndcDao;
        this.date = date;
        this.isHas = isHas;
    }
    @Override
    public void invoke(CNDC cndc, AnalysisContext analysisContext) {
//        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd" );
//        Date date = new Date();
//        String dateStr = sdf.format(date);
//        cndc.setDate(dateStr);
//        cndc.setSum_target(cndc.getFirst_target()+cndc.getSecond_target()+cndc.getThird_target()
//                +cndc.getFourth_target()+cndc.getFifth_target());
//        cndc.setSum_complete(cndc.getFirst_complete()+cndc.getSecond_complete()+cndc.getThird_complete()
//                +cndc.getFourth_complete()+cndc.getFifth_complete());
//        if(cndc.getDepartment().startsWith("通用渠道")){
//            cndc.setDepartment("通用渠道销售部");
//        }
//        System.out.println(cndc);
//        cndcDao.insertCNDC(cndc);


//        List<CNDC> cndcs = cndcService.selectCNDCsByDate(date);
//        System.out.println(date);
//        System.out.println(cndcs);
//        for (CNDC cndc1 : cndcs) {
//            System.out.println(cndc1);
//        }

        if (isHas){

            cndcDao.updateCNDC(cndc);
        }else {
            cndc.setDate(date);
            cndc.setSum_target(cndc.getFirst_target()+cndc.getSecond_target()+cndc.getThird_target()
            +cndc.getFourth_target()+cndc.getFifth_target());
            cndc.setSum_complete(cndc.getFirst_complete()+cndc.getSecond_complete()+cndc.getThird_complete()
            +cndc.getFourth_complete()+cndc.getFifth_complete());
            cndcDao.insertCNDC(cndc);
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
