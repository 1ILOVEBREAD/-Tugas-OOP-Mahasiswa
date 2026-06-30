package simakademi.model;

/*
 * Model dasar Person.
 */
public class Person {
    protected String nim;
    protected String name;

    // Constructor with nim first, then name (matches Student's super(nim, name))
    public Person(String nim, String name) {
        this.nim = nim;
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method yang bisa di-override oleh child class
    public String getInfo() {
        return "NIM: " + nim + " | Nama: " + name;
    }

    @Override
    public String toString() {
        return name;
    }
}