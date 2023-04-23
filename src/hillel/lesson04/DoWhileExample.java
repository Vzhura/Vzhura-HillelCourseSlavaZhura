package hillel.lesson04;

public class DoWhileExample {
    public static void main(String[] args) {
        int attempt = 0;
        boolean cond = true;

        do {
            if (attempt > 6) {
                cond = false;
            }
            System.out.println("Attempt " + attempt++);
        }while (cond) ;
        }

//        String user1 = getRandomUserFromConfig();
//        String user2;
//        do {
//            user2 = getRandomUserFromConfig();
//            while (user1.equals(user2)) ;
//        }
//
//        private static String getRandomUserFromConfig () {
//            return "";
//        }
    }



