package com.zmsj.juggernaut.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wang.kun
 */
@Data
@ApiModel("刑拘人员本辖区占比")
public class FirstBDto {

  @ApiModelProperty("年份")
  private String year;
  @ApiModelProperty("刑拘人员")
  private Integer a;
  @ApiModelProperty("本辖区抓获人数")
  private Integer b;
  @ApiModelProperty("占比")
  private Double c;
  @ApiModelProperty("户籍洪山")
  private Integer d;
  @ApiModelProperty("占比")
  private Double e;
}
