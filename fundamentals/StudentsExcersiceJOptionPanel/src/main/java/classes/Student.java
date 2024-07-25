package classes;

import javax.swing.JOptionPane;

public class Student {
  private int age;
  private String account;
  private String firstName;
  private String lastName;
  private String carrer;
  
  public Student () {}
  
  public Student (String account) {}

  public Student(String account, String firstName, String lastName, int age, String carrer) {
    this.account = account;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.carrer = carrer;
  }
  
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCarrer() {
    return carrer;
  }

  public void setCarrer(String carrer) {
    this.carrer = carrer;
  }
  
  public void addNewStudent () {
    System.out.println("===ADDING NEW STUDENT===");
    this.account = JOptionPane.showInputDialog("Write the student account: ", this.account);
    this.firstName = JOptionPane.showInputDialog("Write the student first name: ", this.firstName);
    this.lastName = JOptionPane.showInputDialog("Write the student last name: ", this.lastName);
    this.age = Integer.parseInt(JOptionPane.showInputDialog("Write the student age: ", this.age));
    this.carrer = JOptionPane.showInputDialog("Write the student carrer: ", this.carrer);
  }

  @Override
  public String toString() {
    return "Student{" + "account=" + account + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", carrer=" + carrer + '}';
  }
}