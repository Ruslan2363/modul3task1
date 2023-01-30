public class SamsungPhone extends Phone implements PhoneConnection,PhoneMedia {
    private String numSamsung;
    public SamsungPhone(String name, String model, String color, int ram, int storage,String numSamsung) {
        super(name, model, color, ram, storage);
        this.numSamsung=numSamsung;
    }
    public String getNumSamsung() {
        return numSamsung;
    }

    public void setNumSumsung(String numSumsung) {
        this.numSamsung = numSumsung;
    }


    @Override
    public void call() {
        System.out.println( numSamsung+"Телефонуємо");

    }

    @Override
    public void sendMassage() {
        System.out.println( numSamsung+"Надсилаємо");
    }

    @Override
    public void photo() {
        System.out.println( numSamsung+"Фотографуємо");
    }

    @Override
    public void video() {
        System.out.println( numSamsung+"Відео");
    }

    @Override
    public String toString() {
        return super.toString()+ "SamsungPhone{" +
                "numSamsung='" + numSamsung + '\'' +
                '}';
    }


}
