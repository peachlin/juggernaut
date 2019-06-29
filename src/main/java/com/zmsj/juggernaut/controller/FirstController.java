package com.zmsj.juggernaut.controller;

import com.google.common.collect.Maps;
import com.zmsj.juggernaut.helper.ExcelHelper;
import com.zmsj.juggernaut.model.FirstDDto;
import com.zmsj.juggernaut.model.FirstEDto;
import com.zmsj.juggernaut.model.FirstPageDto;
import io.swagger.annotations.ApiOperation;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang.kun
 */
@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/first")
public class FirstController {

  @GetMapping("/all")
  @ApiOperation("查询第一页数据")
  public FirstPageDto queryAll() {

    FirstPageDto firstPageDto = new FirstPageDto();
    try {

      firstPageDto.setFirstADto(ExcelHelper.read2Sheet());
      firstPageDto.setFirstBDto(ExcelHelper.read3Sheet());
      firstPageDto.setFirstCDto(ExcelHelper.read4Sheet());

      FirstDDto firstDDto = new FirstDDto();
      FirstEDto firstEDto = ExcelHelper.read5Sheet();
      Map<String, Integer> aMap = Maps.newHashMap();
      Map<String, Integer> bMap = Maps.newHashMap();
      Map<String, Integer> cMap = Maps.newHashMap();
      if (null != firstEDto) {
        aMap.put("吸食传统毒品人数", firstEDto.getL());
        aMap.put("吸食新型毒品人数", firstEDto.getM());
        bMap.put("18岁-30岁吸毒人数", firstEDto.getEighteenNum());
        bMap.put("31岁-50岁吸毒人数", firstEDto.getThirtyFirstNum());
        bMap.put("50岁以上吸毒人数", firstEDto.getFiftyNum());
        cMap.put("男性吸毒人数", firstEDto.getMaleNum());
        cMap.put("女性吸毒人数", firstEDto.getFemaleNum());

      }
      firstDDto.setAMap(aMap);
      firstDDto.setBMap(bMap);
      firstDDto.setCMap(cMap);

      firstPageDto.setFirstDDto(firstDDto);
      firstPageDto.setFirstEDto(firstEDto);
      firstPageDto.setFirstFDto(ExcelHelper.read1Sheet());
      firstPageDto.setFirstGDto(ExcelHelper.read6Sheet());
    } catch (Exception e) {
      log.error("queryAll error:", e);
    }
    return firstPageDto;
  }
}
