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

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
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
