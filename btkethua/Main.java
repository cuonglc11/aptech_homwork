package com.aptect.btkethua;

public class Main {
    public static void main(String[] args) {
        Student st = new Student("Cuong" , 12 , "Hà Nội" , 10);
        st.display();
        System.out.println("Giang vien");
        Teacher teacher = new Teacher("Hieu" , 23 , "Hà nội" , 1200);
        teacher.display();
    }
}
