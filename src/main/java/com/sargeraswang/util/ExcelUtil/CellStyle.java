package com.sargeraswang.util.ExcelUtil;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;


/**
 * Created by Administrator on 2016/11/4.
 */
public class CellStyle extends  BaseCellStyle {
    @Override
    public void setCellStyle(HSSFCell cell,HSSFWorkbook workbook) {
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        style.setFillBackgroundColor(HSSFColor.RED.index);
        style.setFillForegroundColor(HSSFColor.RED.index);
        cell.setCellStyle(style);
    }
}
