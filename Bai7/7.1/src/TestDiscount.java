import java.util.Date;

public class TestDiscount {
    public static void main(String[] args) {

        Visit v1 = new Visit("An", new Date());
        v1.setServiceExpense(200);
        v1.setProductExpense(100);
        System.out.println(v1);
        System.out.println("Tong tien: " + v1.getTotalExpense());


        Visit v2 = new Visit("Binh", new Date());
        v2.getCustomer().setMember(true);
        v2.getCustomer().setMemberType("Premium");
        v2.setServiceExpense(200);
        v2.setProductExpense(100);
        System.out.println(v2);
        System.out.println("Tong tien: " + v2.getTotalExpense());


        Visit v3 = new Visit("Chi", new Date());
        v3.getCustomer().setMember(true);
        v3.getCustomer().setMemberType("Gold");
        v3.setServiceExpense(200);
        v3.setProductExpense(100);
        System.out.println("Tong tien: " + v3.getTotalExpense());


        Visit v4 = new Visit("Dung", new Date());
        v4.getCustomer().setMember(true);
        v4.getCustomer().setMemberType("Silver");
        v4.setServiceExpense(200);
        v4.setProductExpense(100);
        System.out.println("Tong tien: " + v4.getTotalExpense());
    }
}