package com.sast.atSast.model;

import lombok.Data;

@Data
public class StudentInfo {

  private long uid;
  private String realName;
  private String stuId;
  private String phone;
  private String faculty;
  private String personId;
  private String major;
  private String qqId;
  private String wxId;
  private Byte enable;

}
