package com.zmsj.juggernaut.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wang.kun
 */
@Data
@ApiModel("本辖区抓获涉毒比")
public class FirstCDto {

  @ApiModelProperty("时间")
  private String time;
  @ApiModelProperty("抓获涉毒人员")
  private Integer a;
  @ApiModelProperty("本辖区")
  private Integer b;
  @ApiModelProperty("占比")
  private Double c;
}
