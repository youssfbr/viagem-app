package com.github.youssfbr.cliente;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Cliente extends PanacheEntity {

    public String nome;

}
