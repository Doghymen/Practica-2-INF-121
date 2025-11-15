/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Doghy
 */
public class Inventario {

    private Producto[] productos;
    private int indice;

    public Inventario(int tam) {
        productos = new Producto[tam];
        indice = 0;
    }

    // c)
    public void agregarProducto(Producto p) throws Exception {

        if (p.getPrecio() < 0 || p.getStock() < 0) {
            throw new Exception("Precio o stock no pueden ser negativos.");
        }

        for (int i = 0; i < indice; i++) {
            if (productos[i].getCodigo().equals(p.getCodigo())) {
                throw new Exception("El codigo '" + p.getCodigo() + "' ya existe.");
            }
        }

        if (indice < productos.length) {
            productos[indice] = p;
            indice++;
        }
    }

    // d)
    public Producto buscarProducto(String codigo) throws ProductoNoEncontradoException {
        for (int i = 0; i < indice; i++) {
            if (productos[i].getCodigo().equals(codigo)) {
                return productos[i];
            }
        }
        throw new ProductoNoEncontradoException("Producto con codigo '" + codigo + "' no encontrado.");
    }

    // e)
    public void venderProducto(String codigo, int cantidad)
            throws ProductoNoEncontradoException, StockInsuficienteException {

        Producto p = buscarProducto(codigo);

        if (p.getStock() < cantidad) {
            throw new StockInsuficienteException(
                    "Stock insuficiente. Disponible: " + p.getStock() + ", solicitado: " + cantidad
            );
        }

        p.reducirStock(cantidad);
    }
}
