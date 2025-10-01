package hierarchical;

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Manager man = new Manager("Budi", 8000000, 5); 
        Programmer prog = new Programmer("Ani", 6000000, "Java");

        // Manager
        man.kerja();
        man.infoGaji();
        man.kelolaTim();

        System.out.println();

        // Programmer
        prog.kerja();
        prog.infoGaji();
        prog.coding();
    }
}
