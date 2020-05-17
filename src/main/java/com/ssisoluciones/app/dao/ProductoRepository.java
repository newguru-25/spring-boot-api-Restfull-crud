package com.ssisoluciones.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssisoluciones.app.entity.ProductoEntity;



public interface ProductoRepository  extends JpaRepository<ProductoEntity, Integer>{


}
