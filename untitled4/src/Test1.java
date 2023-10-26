public class Test1 {
    int namber;

    public int getNamber() {
        return namber;
    }

    public void setNamber(int namber) {
        if(namber > 7){
            System.out.println("Привет!");
            this.namber = namber;
        }


    }
}
