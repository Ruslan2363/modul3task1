public class  Phone {
    private String name;
    private String model;
    private String color;
    private int ram;
    private int storage;

    public Phone(String name, String model, String color, int ram, int storage) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.storage = storage;

    }


    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }
}
