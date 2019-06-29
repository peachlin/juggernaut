package com.zmsj.juggernaut.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wang.kun
 */
@Data
@ApiModel("管控率")
public class FirstFDto {

  @ApiModelProperty("年份")
  private String year;
  @ApiModelProperty("在册吸毒人员总数")
  private Integer a;
  @ApiModelProperty("高风险")
  private Integer b;
  @ApiModelProperty("中风险")
  private Integer c;
  @ApiModelProperty("低风险")
  private Integer d;
  @ApiModelProperty("死亡")
  private Integer e;
  @ApiModelProperty("失控人数")
  private Integer f;
  @ApiModelProperty("已找到（含死亡人员）")
  private Integer g;
  @ApiModelProperty("管控率（含死亡人数）")
  private Double h;
}
