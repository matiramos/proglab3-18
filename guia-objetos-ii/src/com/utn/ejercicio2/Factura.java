package com.utn.ejercicio2;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class Factura {

    private UUID uuid;
    private LocalDateTime fecha;
    private Cliente cliente;
    private ItemVenta[] items;

    public Factura(Cliente cliente, ItemVenta[] items) {
        this.uuid = UUID.randomUUID();
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
        this.items = items;
    }

    public UUID getUuid() {
        return uuid;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public double getMontoTotal() {
        double total = 0.0;
        for (ItemVenta itemVenta : items) {
            if (itemVenta != null) {
                total += itemVenta.getTotal();
            }
        }
        return total - (total * (cliente.getDescuento() / 100));
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ItemVenta[] getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "uuid=" + uuid +
                ", fecha=" + fecha +
                ", monto=" + getMontoTotal() +
                ", cliente=" + cliente +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
