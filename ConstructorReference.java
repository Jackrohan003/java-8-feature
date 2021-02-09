

class Person {
    String firstName;
    String lastName;

    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}


class Main {  
  public static void main(String args[]) { 
 
 PersonFactory<Person> personFactory = Person::new;
Person person = personFactory.create("Peter", "Parker");

System.out.println(person.firstName);
System.out.println(person.lastName);

  } 
}

