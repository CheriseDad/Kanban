package org.dc.kanban;

public class Stage {
  private String name;
  private int status;
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setStatus(int status) {
    this.status = status;
  }
  
  public String getName() {
    return this.name;
  }
  
  public int getStatus() {
    return this.status;
  }
}
