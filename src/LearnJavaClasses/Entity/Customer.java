package LearnJavaClasses.Entity;

public class Customer {

  private int id;
  private String lastName;
  private String firstName;
  private String middleName;
  private String address;
  private long creditCardNumber;
  private int bankAccountNumber;

  public Customer(int id, String firstName, String lastName) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
  }

  public Customer(int id, String lastName, String firstName, String middleName, long creditCardNumber) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
    this.creditCardNumber = creditCardNumber;
  }

  public Customer(int id, String firstName, String lastName, long creditCardNumber) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
    this.creditCardNumber = creditCardNumber;
  }

  public Customer(int id, String lastName, String firstName, String middleName, String address, long creditCardNumber, int bankAccountNumber) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
    this.address = address;
    this.creditCardNumber = creditCardNumber;
    this.bankAccountNumber = bankAccountNumber;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public long getCreditCardNumber() {
    return creditCardNumber;
  }

  public void setCreditCardNumber(long creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }

  public int getBankAccountNumber() {
    return bankAccountNumber;
  }

  public void setBankAccountNumber(int bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "id=" + id +
            ", lastName='" + lastName + '\'' +
            ", firstName='" + firstName + '\'' +
            ", middleName='" + middleName + '\'' +
            ", address='" + address + '\'' +
            ", creditCardNumber=" + creditCardNumber +
            ", bankAccountNumber=" + bankAccountNumber +
            '}';
  }
}
