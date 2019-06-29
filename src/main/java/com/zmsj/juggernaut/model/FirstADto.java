package com.zmsj.juggernaut.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wang.kun
 */
@Data
@ApiModel("易制毒化学品管理")
public class FirstADto {

  @ApiModelProperty("年份")
  private String year;
  @ApiModelProperty("办理第二类、第三类易制毒化学品购买设备案数")
  private Integer a;
  @ApiModelProperty("办理第三类易制毒化学品运输备案数")
  private Integer b;
  @ApiModelProperty("办理第二类易制毒化学品运输许可数")
  private Integer c;
  @ApiModelProperty("处罚情况")
  private String punishDetail;
}
