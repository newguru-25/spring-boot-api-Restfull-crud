package com.ssisoluciones.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssisoluciones.app.entity.ProductoEntity;
import com.ssisoluciones.app.service.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	ProductoService productservice;

	@ResponseBody
	@RequestMapping("/listarproducto")
	public Map<String, Object> getAllProduct() {
		Map<String, Object> rest = new HashMap<String, Object>();
		try {
			rest.put("data", productservice.getAllproduct());
			rest.put("success", Boolean.TRUE);
		} catch (Exception e) {
			rest.put("data", e);
			rest.put("success", Boolean.FALSE);
		}
		return rest;
	}

	@ResponseBody
	@RequestMapping("/obtenerproducto")
	public Map<String, Object> obtenerProductos(Integer id) {
		Map<String, Object> rest = new HashMap<String, Object>();
		try {
			rest.put("data", productservice.obtenerProducto(id));
			rest.put("success", Boolean.TRUE);
		} catch (Exception e) {
			rest.put("data", e.getMessage());
			rest.put("success", Boolean.FALSE);
		}
		return rest;
	}

	@ResponseBody
	@RequestMapping("/crearproducto")
	public Map<String, Object> crearProducto(@RequestBody ProductoEntity producto) {
		Map<String, Object> rest = new HashMap<String, Object>();
		try {
			rest.put("data", productservice.crearProducto(producto));
			rest.put("success", Boolean.TRUE);
		} catch (Exception e) {
			rest.put("data", e.getMessage());
			rest.put("success", Boolean.FALSE);
		}
		return rest;
	}

	
	@RequestMapping("/actualizarproducto")
	@ResponseBody public Map<String, Object> actualizarProducto(@RequestBody ProductoEntity producto) {
		Map<String, Object> rest = new HashMap<String, Object>();
		try {
			rest.put("data", productservice.actualizarProducto(producto));
			rest.put("success", Boolean.TRUE);
		} catch (Exception e) {
			rest.put("data", e.getMessage());
			rest.put("success", Boolean.FALSE);
		}
		return rest;
	}

	@ResponseBody
	@RequestMapping("/eliminarproducto")
	public Map<String, Object> deleteProducto(Integer id) {
		Map<String, Object> rest = new HashMap<String, Object>();
		try {
			productservice.eliminarProducto(id);
			rest.put("data", "Producto Eliminado !");
			rest.put("success", Boolean.TRUE);
		} catch (Exception e) {
			rest.put("data", e.getMessage());
			rest.put("success", Boolean.FALSE);
		}
		return rest;
	}

}