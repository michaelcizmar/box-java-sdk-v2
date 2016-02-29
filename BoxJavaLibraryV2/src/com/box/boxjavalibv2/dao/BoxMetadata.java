package com.box.boxjavalibv2.dao;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

public class BoxMetadata extends BoxBase {
  
  protected Map<String, String> metadata = new HashMap<String,String>();
  
  /**
   * Constructor.
   */
  public BoxMetadata() {
  }
  
  public String getMetadataValue(String name) {
    return metadata.get(name);
  }
  
  @JsonAnyGetter
  public Map<String, String> getMetadata() {
    return metadata;
  }
  
  @JsonAnySetter
  public void set(String name, Object value) {
    metadata.put(name, value.toString());
  }
}
