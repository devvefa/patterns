package company.structural.builder.ex1;

public class Customer {

 private final String firstName; 	
 private final String lastName; 		
 private final int age; 				
 private final String phone; 		
 private final String address; 		
 private final String email; 		

 private Customer(CustomerBuilder builder) {
  this.firstName = builder.firstName;
  this.lastName = builder.lastName;
  this.age = builder.age;
  this.phone = builder.phone;
  this.address = builder.address;
  this.email = builder.email;
 }

 public String getFirstName() {
  return firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public int getAge() {
  return age;
 }

 public String getPhone() {
  return phone;
 }

 public String getAddress() {
  return address;
 }

 public String getEmail() {
  return email;
 }

 public String toString() {
  return "Customer: " + this.firstName + ", " + this.lastName + ", " + this.age + ", " + this.phone + ", "
          + this.address + ", " + this.email;
 }


 public static class CustomerBuilder {

  private String firstName;
  private String lastName;
  private int age;
  private String phone;
  private String address;
  private String email;

  public CustomerBuilder(String firstName, String lastName, String address) {
   this.firstName = firstName;
   this.lastName = lastName;
   this.address = address;
  }

  public CustomerBuilder age(int age) {
   this.age = age;
   return this;
  }

  public CustomerBuilder phone(String phone) {
   this.phone = phone;
   return this;
  }

  public CustomerBuilder email(String email) {
   this.email = email;
   return this;
  }

  //Return the final User object
  public Customer build()
  {
   Customer cust =  new Customer(this);
   return cust;
  }

 }

}