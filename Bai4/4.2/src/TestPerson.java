
public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("An", "Ha Noi");
        System.out.println(p);

        Student s = new Student("Binh", "Da Nang", "Game Technology", 1, 15000000.0);
        System.out.println(s);
        s.setYear(2);
        s.setFee(16000000.0);
        s.setAddress("Hue");
        System.out.println(s);
        System.out.println("Ten sinh vien: " + s.getName());

        Staff st = new Staff("Cuong", "TP.HCM", "IT School", 20000000.0);
        System.out.println(st);
        st.setPay(25000000.0);
        st.setSchool("Game School");
        System.out.println(st);


        Person[] people = { p, s, st };
        for (Person x : people) {
            System.out.println(x.toString());   // goi dung toString() cua tung lop
        }
    }
}
