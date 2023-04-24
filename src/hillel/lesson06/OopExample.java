package hillel.lesson06;

import hillel.lesson06.Phone.IPhone;
public class OopExample {
    public static void main(String[] args) {
//
//        IPhone phone = new IPhone();
//        phone.makeCall("1111");
//        phone.receiveSms("12222", "text");

Cat cat1 = new Cat();
cat1.setName("Lucifer");
cat1.setAge(1);
cat1.setColor("black");

String name = cat1.getName();
        System.out.println(cat1);
//        System.out.println(cat2.name);
    }
}
