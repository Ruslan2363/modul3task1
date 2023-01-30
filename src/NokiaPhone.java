public class NokiaPhone extends Phone implements PhoneConnection{
    private String numNokia;
    private String processor;
    public NokiaPhone(String name, String model, String color, int ram, int storage,String numNokia,String processor) {
        super(name, model, color, ram, storage);
        this.processor=processor;
        this.numNokia=numNokia;

    }

    public String getNumNokia() {
        return numNokia;
    }

    public void setNumNokia(String numNokia) {
        this.numNokia = numNokia;
    }

    public String getProcessor(){
        return processor ;
    }

    public void setProcesor(String procesor) {
        this.processor = procesor;
    }


    @Override
    public void call() {

        System.out.println( numNokia+"Телефонуємо");

    }

    @Override
    public void sendMassage() {
        System.out.println( numNokia+"Надсилаємо");

    }

    @Override
    public String toString() {
        return super.toString()+"NokiaPhone{" +
                "numNokia='" + numNokia + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }




}
