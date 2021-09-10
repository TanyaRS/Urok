public class Bank {
    public static void main(String[] args) throws AgeException {
        try {
            try {
                Client Tanya = new Client("Tanya", -56);
                if (Tanya.age < 0) {
                    throw new Exception("Oops");
                }
            } catch (Exception e) {
                throw new Exception("Неверное значение",e);
            }
            } catch (Exception e) {
            throw new AgeException("Возраст не может быть меньше 0",e);
            }
            System.out.println();
        }
    }
