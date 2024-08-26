package com.ioc.configurationbeanxml.tp;

import java.util.List;

public interface ITpServices {
    TpEntity add(TpEntity tpEntity);
    TpEntity update(TpEntity tpEntity);
    TpEntity delete(TpEntity tpEntity);
    List<TpEntity> findByName(String name);
    List<TpEntity> all();
    TpEntity findById(String name);
}
