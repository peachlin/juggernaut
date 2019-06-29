package com.zmsj.juggernaut.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wang.kun
 */
@Data
@ApiModel("禁毒宣传")
public class FirstGDto {

  @ApiModelProperty("年份")
  private String year;
  @ApiModelProperty("社区禁毒宣传活动场数")
  private Integer a;
  @ApiModelProperty("进学校上禁毒课次数")
  private Integer b;
  @ApiModelProperty("禁毒宣传栏")
  private Integer c;
}
