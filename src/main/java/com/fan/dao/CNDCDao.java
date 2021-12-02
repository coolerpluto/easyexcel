package com.fan.dao;

import com.fan.bean.CNDC;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Mapper
public interface CNDCDao {
    int insertCNDC(CNDC cndc);
    List<CNDC> selectCNDC(String date);
    int updateCNDC(CNDC cndc);
}
