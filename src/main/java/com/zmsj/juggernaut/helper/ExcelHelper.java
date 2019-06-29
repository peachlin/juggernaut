package com.zmsj.juggernaut.helper;

import com.google.common.collect.Lists;
import com.zmsj.juggernaut.model.FirstADto;
import com.zmsj.juggernaut.model.FirstBDto;
import com.zmsj.juggernaut.model.FirstCDto;
import com.zmsj.juggernaut.model.FirstEDto;
import com.zmsj.juggernaut.model.FirstFDto;
import com.zmsj.juggernaut.model.FirstGDto;
import java.io.File;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author wang.kun
 */
public class ExcelHelper {

  public static String PATH = "/root/jindu/数字平台表格.xlsx";
//  public static String PATH = "C:\\数字平台表格.xlsx";
//  public static String PATH = "C:\\Users\\wangk\\Desktop\\数字平台表格.xlsx";

  public static List<FirstFDto> read1Sheet() throws Exception {

    List<FirstFDto> list = Lists.newArrayList();

    File file = new File(PATH);
    //判断文件是否存在
    if (!file.isFile() || !file.exists()) {
      return null;
    }
    //获取文件的后缀名 \\ .是特殊字符
    Workbook wb = new XSSFWorkbook(file);

    //开始解析
    Sheet sheet = wb.getSheet("管控率");
    //从第三行开始
    int firstRowNum = sheet.getFirstRowNum() + 2;
    int lastRowNum = sheet.getLastRowNum();

    //遍历行
    for (int rIndex = firstRowNum; rIndex <= lastRowNum; rIndex++) {
      //获取当前行的内容
      Row row = sheet.getRow(rIndex);
      if (row != null) {
        FirstFDto firstFDto = new FirstFDto();
        firstFDto.setYear((int) row.getCell(0).getNumericCellValue() + "");
        firstFDto.setA((int) row.getCell(1).getNumericCellValue());
        firstFDto.setB((int) row.getCell(2).getNumericCellValue());
        firstFDto.setC((int) row.getCell(3).getNumericCellValue());
        firstFDto.setD((int) row.getCell(4).getNumericCellValue());
        firstFDto.setE((int) row.getCell(5).getNumericCellValue());
        firstFDto.setF((int) row.getCell(6).getNumericCellValue());
        firstFDto.setG((int) row.getCell(7).getNumericCellValue());
        firstFDto.setH(row.getCell(8).getNumericCellValue());
        list.add(firstFDto);
      }
    }
    return list;
  }

  public static List<FirstADto> read2Sheet() throws Exception {

    List<FirstADto> list = Lists.newArrayList();

    File file = new File(PATH);
    //判断文件是否存在
    if (!file.isFile() || !file.exists()) {
      return null;
    }
    //获取文件的后缀名 \\ .是特殊字符
    Workbook wb = new XSSFWorkbook(file);

    //开始解析
    Sheet sheet = wb.getSheet("易制毒化学品管理");
    //从第三行开始
    int firstRowNum = sheet.getFirstRowNum() + 2;
    int lastRowNum = sheet.getLastRowNum();

    //遍历行
    for (int rIndex = firstRowNum; rIndex <= lastRowNum; rIndex++) {
      //获取当前行的内容
      Row row = sheet.getRow(rIndex);
      if (row != null) {
        FirstADto firstADto = new FirstADto();
        firstADto.setYear((int) row.getCell(0).getNumericCellValue() + "");
        firstADto.setA((int) row.getCell(1).getNumericCellValue());
        firstADto.setB((int) row.getCell(2).getNumericCellValue());
        firstADto.setC((int) row.getCell(3).getNumericCellValue());
        firstADto.setPunishDetail(row.getCell(4).getStringCellValue());
        list.add(firstADto);
      }
    }
    return list;
  }

  public static List<FirstBDto> read3Sheet() throws Exception {

    List<FirstBDto> list = Lists.newArrayList();

    File file = new File(PATH);
    //判断文件是否存在
    if (!file.isFile() || !file.exists()) {
      return null;
    }
    //获取文件的后缀名 \\ .是特殊字符
    Workbook wb = new XSSFWorkbook(file);

    //开始解析
    Sheet sheet = wb.getSheet("刑拘人员本辖区占比");
    //从第三行开始
    int firstRowNum = sheet.getFirstRowNum() + 2;
    int lastRowNum = sheet.getLastRowNum();

    //遍历行
    for (int rIndex = firstRowNum; rIndex <= lastRowNum; rIndex++) {
      //获取当前行的内容
      Row row = sheet.getRow(rIndex);
      if (row != null) {
        FirstBDto firstBDto = new FirstBDto();
        firstBDto.setYear((int) row.getCell(0).getNumericCellValue() + "");
        firstBDto.setA((int) row.getCell(1).getNumericCellValue());
        firstBDto.setB((int) row.getCell(2).getNumericCellValue());
        firstBDto.setC(row.getCell(3).getNumericCellValue());
        firstBDto.setD((int) row.getCell(4).getNumericCellValue());
        firstBDto.setE(row.getCell(5).getNumericCellValue());
        list.add(firstBDto);
      }
    }
    return list;
  }

  public static List<FirstCDto> read4Sheet() throws Exception {

    List<FirstCDto> list = Lists.newArrayList();

    File file = new File(PATH);
    //判断文件是否存在
    if (!file.isFile() || !file.exists()) {
      return null;
    }
    //获取文件的后缀名 \\ .是特殊字符
    Workbook wb = new XSSFWorkbook(file);

    //开始解析
    Sheet sheet = wb.getSheet("本辖区抓获涉毒比");
    //从第三行开始
    int firstRowNum = sheet.getFirstRowNum() + 2;
    int lastRowNum = sheet.getLastRowNum();

    //遍历行
    for (int rIndex = firstRowNum; rIndex <= lastRowNum; rIndex++) {
      //获取当前行的内容
      Row row = sheet.getRow(rIndex);
      if (row != null) {
        FirstCDto firstCDto = new FirstCDto();
        firstCDto.setTime(row.getCell(0).getStringCellValue());
        firstCDto.setA((int) row.getCell(1).getNumericCellValue());
        firstCDto.setB((int) row.getCell(2).getNumericCellValue());
        firstCDto.setC(row.getCell(3).getNumericCellValue());
        list.add(firstCDto);
      }
    }
    return list;
  }

  public static FirstEDto read5Sheet() throws Exception {

    File file = new File(PATH);
    //判断文件是否存在
    if (!file.isFile() || !file.exists()) {
      return null;
    }
    //获取文件的后缀名 \\ .是特殊字符
    Workbook wb = new XSSFWorkbook(file);

    //开始解析
    Sheet sheet = wb.getSheet("禁毒管控数据");
    FirstEDto firstEDto = new FirstEDto();
    firstEDto.setTotalNum((int) sheet.getRow(1).getCell(1).getNumericCellValue());
    firstEDto.setMaleNum((int) sheet.getRow(2).getCell(1).getNumericCellValue());
    firstEDto.setFemaleNum((int) sheet.getRow(3).getCell(1).getNumericCellValue());
    firstEDto.setEighteenNum((int) sheet.getRow(4).getCell(1).getNumericCellValue());
    firstEDto.setThirtyFirstNum((int) sheet.getRow(5).getCell(1).getNumericCellValue());
    firstEDto.setFiftyNum((int) sheet.getRow(6).getCell(1).getNumericCellValue());
    firstEDto.setA((int) sheet.getRow(7).getCell(1).getNumericCellValue());
    firstEDto.setB(sheet.getRow(8).getCell(1).getNumericCellValue());
    firstEDto.setC((int) sheet.getRow(9).getCell(1).getNumericCellValue());
    firstEDto.setD((int) sheet.getRow(10).getCell(1).getNumericCellValue());
    firstEDto.setE((int) sheet.getRow(11).getCell(1).getNumericCellValue());
    firstEDto.setF(sheet.getRow(12).getCell(1).getNumericCellValue());
    firstEDto.setG((int) sheet.getRow(13).getCell(1).getNumericCellValue());
    firstEDto.setH((int) sheet.getRow(14).getCell(1).getNumericCellValue());
    firstEDto.setI((int) sheet.getRow(15).getCell(1).getNumericCellValue());
    firstEDto.setJ(sheet.getRow(16).getCell(1).getNumericCellValue());
    firstEDto.setK(sheet.getRow(17).getCell(1).getNumericCellValue());
    firstEDto.setL((int) sheet.getRow(18).getCell(1).getNumericCellValue());
    firstEDto.setM((int) sheet.getRow(19).getCell(1).getNumericCellValue());
    return firstEDto;
  }

  public static List<FirstGDto> read6Sheet() throws Exception {

    List<FirstGDto> list = Lists.newArrayList();

    File file = new File(PATH);
    //判断文件是否存在
    if (!file.isFile() || !file.exists()) {
      return null;
    }
    //获取文件的后缀名 \\ .是特殊字符
    Workbook wb = new XSSFWorkbook(file);

    //开始解析
    Sheet sheet = wb.getSheet("禁毒宣传");
    //从第三行开始
    int firstRowNum = sheet.getFirstRowNum() + 2;
    int lastRowNum = sheet.getLastRowNum();

    //遍历行
    for (int rIndex = firstRowNum; rIndex <= lastRowNum; rIndex++) {
      //获取当前行的内容
      Row row = sheet.getRow(rIndex);
      if (row != null) {
        FirstGDto firstGDto = new FirstGDto();
        firstGDto.setYear(row.getCell(0).getNumericCellValue() + "");
        firstGDto.setA((int) row.getCell(1).getNumericCellValue());
        firstGDto.setB((int) row.getCell(2).getNumericCellValue());
        firstGDto.setC((int) row.getCell(3).getNumericCellValue());
        list.add(firstGDto);
      }
    }
    return list;
  }
}
