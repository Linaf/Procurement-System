/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.service.impl;

import edu.mum.domain.Item;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.springframework.web.servlet.view.document.AbstractExcelView;

/**
 *
 * @author Toshiba
 */
public class ExcelView extends AbstractExcelView {

    @Override
    protected void buildExcelDocument(Map map, HSSFWorkbook workbook, HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        HSSFSheet excelSheet = workbook.createSheet("Item List");
        // Build the title and date headers
        buildTitle(excelSheet, 0, 0);
        setExcelHeader(excelSheet);

        List<Item> itemlList = (List<Item>) map.get("itemList");
        setExcelRows(excelSheet, itemlList);

    }

    public static void buildTitle(HSSFSheet worksheet, int startRowIndex, int startColIndex) {
        // Create font style for the report title
        Font fontTitle = worksheet.getWorkbook().createFont();
        fontTitle.setBoldweight(Font.BOLDWEIGHT_BOLD);
        fontTitle.setFontHeight((short) 280);

        // Create cell style for the report title
        HSSFCellStyle cellStyleTitle = worksheet.getWorkbook().createCellStyle();
        cellStyleTitle.setAlignment(CellStyle.ALIGN_CENTER);
        cellStyleTitle.setWrapText(true);
        cellStyleTitle.setFont(fontTitle);

        // Create report title
        HSSFRow rowTitle = worksheet.createRow((short) startRowIndex);
        rowTitle.setHeight((short) 500);
        HSSFCell cellTitle = rowTitle.createCell(startColIndex);
        cellTitle.setCellValue("items Purchased  Report");
        cellTitle.setCellStyle(cellStyleTitle);

        // Create merged region for the report title
        worksheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 5));

        // Create date header
        HSSFRow dateTitle = worksheet.createRow((short) startRowIndex + 1);
        HSSFCell cellDate = dateTitle.createCell(startColIndex);
        cellDate.setCellValue("This report was generated at " + new Date());
    }

    public void setExcelHeader(HSSFSheet excelSheet) {

        HSSFRow excelHeader = excelSheet.createRow(2);
        excelHeader.createCell(0).setCellValue("Id");
        excelHeader.createCell(1).setCellValue("Name");
        excelHeader.createCell(2).setCellValue("Id");
        excelHeader.createCell(3).setCellValue("Serial No");

    }

    public void setExcelRows(HSSFSheet excelSheet, List<Item> itemlList) {
        int record = 2;
        for (Item item : itemlList) {
            HSSFRow excelRow = excelSheet.createRow(record++);
            excelRow.createCell(0).setCellValue(item.getId());
            excelRow.createCell(1).setCellValue(item.getName());
            excelRow.createCell(2).setCellValue(item.getId());
            excelRow.createCell(3).setCellValue(item.getSerialNo());

        }
    }

}
