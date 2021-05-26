package com.deepak.springbootapimongodb.utils;

import com.deepak.springbootapimongodb.model.NACEDetail;

public class DataUtils {

    public static NACEDetail getTestNACEDetail() {
      return  NACEDetail.builder()
              .order("359889")
              .code("A")
              .level("1")
              .build();
    }
}
