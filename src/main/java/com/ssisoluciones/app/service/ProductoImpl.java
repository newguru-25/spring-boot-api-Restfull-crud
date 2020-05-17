package com.ssisoluciones.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.ssisoluciones.app.dao.ProductoRepository;
import com.ssisoluciones.app.entity.ProductoEntity;

@Service
public class ProductoImpl implements ProductoService {

	@Autowired 
	ProductoRepository productorepository;	
	
	@Override
	public List<ProductoEntity> getAllproduct() {
		// TODO Auto-generated method stub				
		return productorepository.findAll();
	}
	
	@Override
	public Optional<ProductoEntity> obtenerProducto(Integer id){
		// TODO Auto-generated method stub	
		return productorepository.findById(id);
	}
	
	@Override
	public ProductoEntity crearProducto(ProductoEntity producto){
		// TODO Auto-generated method stub	
		return productorepository.save(producto);
	}
	
	@Override
	public ProductoEntity actualizarProducto(ProductoEntity producto) throws Exception{
		// TODO Auto-generated method stub		    
		Optional<ProductoEntity> product=productorepository.findById(producto.getId());	
		
		if(!product.isPresent()) {
			throw new Exception("no se encuentra el id del producto");	
		}		
		
		return productorepository.save(producto);
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub		
		productorepository.deleteById(id);		
		
	}

}
