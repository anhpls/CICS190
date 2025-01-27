public class Person {
    private String name;
    public Person(String theName) {
      this.name = theName;
    }
  }
  
  public class Student extends Person {
    private int id;
    public static int nextId = 1;
    public Student(String theName) {
      super(theName);
      id = nextId++;
    }
  
    public static void main(String[] args) {
      Person e1 = new Student("Alice");
      Person e2 = new Student("Bob");
      Person e3 = new Student("Carol");
      Person arrayOfPeople[] = {e1, e2, e3};
    }
  }