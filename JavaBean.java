
public class JavaBean {
    public static void main(String[] args) {
        PersonBean person = new PersonBean();
        person.setName("naveen k");
        person.setAge(22);
        person.setAddress("D.no:737 mecher,mettur,salem.");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}
