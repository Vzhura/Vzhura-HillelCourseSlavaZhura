package hillel.lesson07;

import hillel.lesson06.Phone.Filming;
import hillel.lesson06.Phone.IPhone;

public class myMethodLib {
    // access_mod return_type name(params) {
    // }

    // isStatusActive


    public int methodWithIntReturn() {

        return 0;
    }

    public void methodWithoutReturn1() {

    }

    public Filming methodWitIntReturn() {
        new IPhone().makeCall("s");
        return new IPhone();
    }

    public void methodWithParams(String s, Integer i, boolean b) {
    }
    public int convertInt(int i) {
        i = i+10;
        return i;
    }

    public static Cat1 updateCat(Cat1 cat) {
        cat.setAge(cat.getAge() + 2);
        return cat;
//        Cat innerCat = new Cat();
//        innerCat.setName(cat.getName());
//        innerCat.setColor(cat.get);
    }
        public void createProducts(String... products){
            System.out.println(products[0]);
            System.out.println(products[1]);
            System.out.println(products[2]);
    }
    public static void giveDiscount(int discount) {

    }
    public static void giveDiscount(double discount){

    }
}


