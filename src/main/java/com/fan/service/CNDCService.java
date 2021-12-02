package com.fan.service;

import com.fan.bean.CNDC;

import java.util.Date;
import java.util.List;

public interface CNDCService {
    List<CNDC> selectCNDCsByDate(Date date);
}
