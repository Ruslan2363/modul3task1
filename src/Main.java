public class Main {
    public static void main(String[] args) {
        getingphone(new SamsungPhone("Samsung","a23","red",220,8));
        getingphone(new NokiaPhone("Nokia","3310","black",24,2));
        getingphone(new Phone("Samsung","22Ultra","red",220,8));


    }

    private static void getingphone(Phone phone) {
        System.out.println(phone);
    }





}
