package com.ioc.configurationbeanxml.tp;

import java.util.List;

public class TpController {

    private TpServices tpServices;

    public TpController(TpServices tpServices) {
        this.tpServices = tpServices;
    }

    public TpServices getTpServices() {
        return this.tpServices;
    }

    public void setTpServices(TpServices tpServices) {
        this.tpServices = tpServices;
    }

    public List<TpEntity> getAllTpEntities(TpEntity tpEntity) {
        this.tpServices.add(tpEntity);
        return this.tpServices.all();
    }
}
