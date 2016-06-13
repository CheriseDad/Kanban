package org.dc.kanban;

class Person {
  private String name;
  private int age;
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public String getName() {
    return this.name;
  }
  
  public int getAge() {
    return this.age;
  }
  
  public boolean equals(Object obj) {
    if (this == obj ) return true;
    
    if (obj instanceof Person) {
      Person anotherPerson = (Person)obj;
      if (this.getName().equals(anotherPerson.getName()) && this.getAge() == anotherPerson.getAge() ) {
        return true;
      }
    }
    
    return false;
  }
  
}
