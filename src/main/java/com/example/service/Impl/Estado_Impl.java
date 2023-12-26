package com.example.service.Impl;

import com.example.model.DAO.estadosDAO;
import com.example.model.entity.Estado;
import com.example.service.IEstado;
import io.micronaut.context.annotation.Property;
import io.micronaut.data.annotation.AutoPopulated;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.transaction.Transactional;

//@Property(name = "my.property", defaultValue = "default value")
@Singleton
public class Estado_Impl implements IEstado {
    @Inject
    private estadosDAO estadodao;
    @Transactional
    @Override
    public Estado findById(Integer Id_Estado) {
        return estadodao.findById(Id_Estado).orElse(null);
    }
}
