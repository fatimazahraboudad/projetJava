package com.ioc.configurationbeanxml.tp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TpServices implements ITpServices {

    private List<TpEntity> entities;

//    public TpServices() {
//        this.entities = new ArrayList<>();
//    }

    public List<TpEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<TpEntity> entities) {
        this.entities = entities;
    }

    @Override
    public TpEntity add(TpEntity tpEntity) {
        entities.add(tpEntity);
        return tpEntity;
    }

    @Override
    public TpEntity update(TpEntity tpEntity) {
        TpEntity oldEntity = findById(tpEntity.getId());
        entities.stream()
                .filter(items -> items.getId() == oldEntity.getId())
                .forEach(tpEntity1 -> {
                    tpEntity1.setName(tpEntity.getName());
                });
        return tpEntity;
    }

    @Override
    public TpEntity delete(TpEntity tpEntity) {
        TpEntity oldEntity = findById(tpEntity.getId());
        entities.remove(oldEntity);
        return oldEntity;
    }

    @Override
    public List<TpEntity> findByName(String name) {
        return entities.stream().filter(tpEntity -> tpEntity.getName().equals(name)).collect(Collectors.toList());
    }

    @Override
    public List<TpEntity> all() {
        return entities;
    }

    @Override
    public TpEntity findById(String id) {
        return entities.stream().filter(tpEntity -> tpEntity.getId() == id).findFirst().orElseThrow(() -> new RuntimeException("Tp Not Found"));
    }
}
