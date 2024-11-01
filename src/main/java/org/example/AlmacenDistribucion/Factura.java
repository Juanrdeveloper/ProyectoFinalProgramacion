package org.example.AlmacenDistribucion;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Factura {

    public static void generarFactura(String nombreUsuario, List<Producto> productos, String rutaArchivo) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Factura");

        // Encabezado
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Nombre de la Tienda");
        headerRow.createCell(1).setCellValue("Fecha de Emisión");
        headerRow.createCell(2).setCellValue("Cliente");

        Row dataRow = sheet.createRow(1);
        dataRow.createCell(0).setCellValue("Mi Tienda");
        dataRow.createCell(1).setCellValue(LocalDate.now().toString());
        dataRow.createCell(2).setCellValue(nombreUsuario);

        // Encabezado de la tabla de productos
        Row productosHeaderRow = sheet.createRow(3);
        productosHeaderRow.createCell(0).setCellValue("Producto");
        productosHeaderRow.createCell(1).setCellValue("Cantidad");
        productosHeaderRow.createCell(2).setCellValue("Precio Unitario");
        productosHeaderRow.createCell(3).setCellValue("Precio Total");

        // Agregar productos a la factura
        double totalVenta = 0;
        int rowNum = 4;
        for (Producto producto : productos) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(producto.getNombreProducto());
            row.createCell(1).setCellValue(producto.getCantidadStock());
            row.createCell(2).setCellValue(producto.getPrecio());
            double precioTotal = producto.getPrecio() * producto.getCantidadStock();
            row.createCell(3).setCellValue(precioTotal);
            totalVenta += precioTotal; // Sumar al total
        }

        // Fila de total
        Row totalRow = sheet.createRow(rowNum);
        totalRow.createCell(2).setCellValue("Total");
        totalRow.createCell(3).setCellValue(totalVenta);

        // Establecer el ancho de las columnas
        for (int i = 0; i < 4; i++) {
            sheet.autoSizeColumn(i);
        }

        // Guardar el archivo
        try (FileOutputStream fileOut = new FileOutputStream(rutaArchivo)) {
            workbook.write(fileOut);
            System.out.println("Factura generada: " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


