public class Employee {
      int id;
      String name;
      int age;
      String password;

      Employee(int id, String name, int age, String password){
            this.id = id;
            this.name = name;
            this.age = age;
            this.password = password;
      }

      int getId(){ return id;}
      String getName(){ return name;}
      int getAge() { return age;}
      String getPassword(){ return password;}
      
      public String toString(){
            return "Employee [ id = " + id + ", Name = " + name + ", Age = " + age + ", Password = " + password + " ]";
      }
}
