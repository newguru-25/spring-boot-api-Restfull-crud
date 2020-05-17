package com.ssisoluciones.app.service;

import java.util.List;
import java.util.Optional;

import com.ssisoluciones.app.entity.ProductoEntity;

public interface ProductoService {

	public List<ProductoEntity> getAllproduct();
	
	public Optional<ProductoEntity> obtenerProducto(Integer id);
	
	public ProductoEntity crearProducto(ProductoEntity producto);
	
	public ProductoEntity actualizarProducto(ProductoEntity producto) throws Exception;
	
	public void eliminarProducto(Integer id);
	
}
