package com.zmsj.juggernaut.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import lombok.Data;

/**
 * @author wang.kun
 */
@Data
@ApiModel("中间饼状图")
public class FirstDDto {

  @ApiModelProperty("最外层饼状图")
  private Map<String, Integer> aMap;
  @ApiModelProperty("中间饼状图")
  private Map<String, Integer> bMap;
  @ApiModelProperty("最内层饼状图")
  private Map<String, Integer> cMap;
}
