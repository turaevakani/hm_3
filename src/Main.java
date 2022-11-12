public class Main {
    public static void main(String[] args) {
        BankAccount user = new BankAccount();
        user.deposit(20000);

        while (true) {
            try {
                user.withDraw(6000);
                System.out.println("Успешно снято");
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    user.withDraw((int) e.getRemainingAmount());
                } catch (LimitException ex) {
                    System.out.println(ex.getMessage());
                }
                break;

            }


        }


    }

}
