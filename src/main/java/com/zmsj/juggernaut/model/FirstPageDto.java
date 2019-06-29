package com.zmsj.juggernaut.model;

import java.util.List;
import lombok.Data;

/**
 * @author wang.kun
 */
@Data
public class FirstPageDto {

  private List<FirstADto> firstADto;
  private List<FirstBDto> firstBDto;
  private List<FirstCDto> firstCDto;
  private FirstDDto firstDDto;
  private FirstEDto firstEDto;
  private List<FirstFDto> firstFDto;
  private List<FirstGDto> firstGDto;
}
