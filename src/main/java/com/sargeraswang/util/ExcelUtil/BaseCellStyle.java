package com.sargeraswang.util.ExcelUtil;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * Created by Administrator on 2016/11/4.
 */
public abstract class BaseCellStyle {

    public abstract void setCellStyle(HSSFCell cell,HSSFWorkbook workbook);
}
