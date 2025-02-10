package Data_Object;

/*
Dieses Pattern wird verwendet, um Daten zwischen Schichten einer Anwendung zu übertragen.
 */
public class UserDataTransferObject {
    private String name;
    private int age;

    public UserDataTransferObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
}
