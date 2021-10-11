package ExcelOs;

import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.ss.usermodel.Workbook;


/*
* 使用Java 的代码生产excel表格
* 1- 先创建空的excel表格
* 2- 创建出工作区
* 3- 创建行
* 4- 创建单元格
* 5- 把单元格设置内容
* 6- 把内存中单元格生成到本地的d盘上
* */

public class ExcelDemo {

    public static void main(String[] args) {
        //先创建空的excel表格

        Workbook book = new HSSFWorkbook();
    }
}
