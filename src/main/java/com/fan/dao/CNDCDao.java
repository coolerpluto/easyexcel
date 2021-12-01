package com.fan.dao;

import com.fan.bean.CNDC;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CNDCDao {
    int insertCNDC(List<CNDC> cndcList);
}
