package hillel.lesson07;

public class MethodEx {
    public static void main(String[] args) {
        myMethodLib myMethodlib = new myMethodLib();
//          myMethodLib().methodWithParams(s: "string", i: 2, b: true);
//
//        new myMethodLib().methodWithParams(s: "string", i: 2, b: true);


        int input = 10;

        int output = myMethodlib.convertInt(input);

        System.out.println(input + " " + output);

        Cat1 cat = new Cat1();
        cat.setAge(10);

        Cat1 cat1 = myMethodLib.updateCat(cat);
        System.out.println(cat);
        System.out.println(cat1);

        myMethodlib.createProducts();
        myMethodlib.createProducts("p1");
        myMethodlib.createProducts("p1", "p2");
        myMethodlib.createProducts("p1", "p2");

        myMethodLib.giveDiscount(1);
        myMethodLib.giveDiscount(1.2);

    }
}
