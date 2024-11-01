package org.example.TiendaElectronica;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public class Factura {
    private Usuario usuario;
    private Producto[] productos;
    private double total;

    public Factura(Usuario usuario, Producto[] productos) {
        this.usuario = usuario;
        this.productos = productos;
        calcularTotal();
    }

    private void calcularTotal() {
        total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
    }

    public void generarPDF(String path) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Factura");

        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Nombre Tienda");
        header.createCell(1).setCellValue("Fecha");
        header.createCell(2).setCellValue("Usuario");

        Row row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("Tienda Ejemplo");
        row1.createCell(1).setCellValue(LocalDate.now().toString());
        row1.createCell(2).setCellValue(usuario.getNombreUsuario());

        Row headerProductos = sheet.createRow(3);
        headerProductos.createCell(0).setCellValue("Producto");
        headerProductos.createCell(1).setCellValue("Precio");

        int rowNum = 4;
        for (Producto producto : productos) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(producto.getNombre());
            row.createCell(1).setCellValue(producto.getPrecio());
        }

        Row totalRow = sheet.createRow(rowNum);
        totalRow.createCell(0).setCellValue("Total");
        totalRow.createCell(1).setCellValue(total);

        try (FileOutputStream outputStream = new FileOutputStream(path)) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
