package com.zmsj.juggernaut.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wang.kun
 */
@Data
@ApiModel("禁毒管控数据")
public class FirstEDto {

  @ApiModelProperty("在册吸毒人员总数")
  private Integer totalNum;
  @ApiModelProperty("男性吸毒人数")
  private Integer maleNum;
  @ApiModelProperty("女性吸毒人数")
  private Integer femaleNum;
  @ApiModelProperty("18岁-30岁吸毒人数")
  private Integer eighteenNum;
  @ApiModelProperty("31岁-50岁吸毒人数")
  private Integer thirtyFirstNum;
  @ApiModelProperty("50岁以上吸毒人数")
  private Integer fiftyNum;
  @ApiModelProperty("见面核查人数")
  private Integer a;
  @ApiModelProperty("完成率")
  private Double b;
  @ApiModelProperty("社区戒毒人数")
  private Integer c;
  @ApiModelProperty("社区康复人数")
  private Integer d;
  @ApiModelProperty("管控人数")
  private Integer e;
  @ApiModelProperty("管控率")
  private Double f;
  @ApiModelProperty("高风险人数")
  private Integer g;
  @ApiModelProperty("中风险人数")
  private Integer h;
  @ApiModelProperty("低风险人数")
  private Integer i;
  @ApiModelProperty("高风险管控率")
  private Double j;
  @ApiModelProperty("中风险管控率")
  private Double k;
  @ApiModelProperty("吸食传统毒品人数")
  private Integer l;
  @ApiModelProperty("吸食新型毒品人数")
  private Integer m;


}
