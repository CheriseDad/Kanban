package org.dc.kanban;

/**
 * Root Entrance of Application.
 * 
 * @author ScottWang
 */
 
public class Main {
  public static void main(String[] args) {
    Person p = new Person();
    p.setName("Zhangsan");
    p.setAge(88);
    
    System.out.println(p);
    
  }
}
