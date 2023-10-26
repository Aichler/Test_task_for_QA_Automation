public class Test2 {

    String firstName = "Вячеслав";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        if(firstName.equals(name)){
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
        this.firstName = name;
    }
}
