package com.fan.service.impl;

import com.fan.bean.CNDC;
import com.fan.dao.CNDCDao;
import com.fan.service.CNDCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class CNDCServiceImpl implements CNDCService {

    @Autowired
    CNDCDao cndcDao;

    @Override
    public List<CNDC> selectCNDCsByDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
//        System.out.println("==="+date);
        String dateStr = dateFormat.format(date);
        System.out.println("dateS"+dateStr);
//        System.out.println("==="+dateStr);
        return cndcDao.selectCNDC(dateStr);
    }


}
