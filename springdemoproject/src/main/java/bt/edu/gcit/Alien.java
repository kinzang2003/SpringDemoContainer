package bt.edu.gcit;

public class Alien {

    private Computer comp;
    // private Computer desktop;
        // private Computer comp;
    
        // private int age;
    
        // private int salary;
    
        // public int getAge() {
        //     return age;
        // }
    
        // public void setAge(int age) {
        //     System.out.println("Set Alien Called");
        //     this.age = age;
        // }
     
        // public Alien(Computer lap) {
        //     System.out.println("Alien Object created");
        //     // this.age = age;
        //     this.lap = lap;
        //     // this.salary = salary;
        //     // this.desktop = desktop;
        //     // this.comp = comp;
        // }

        public Alien() {
            System.out.println("Alien Object created 2");
        }

        public void code() {
            System.out.println("I'm coding");
             comp.compile();
            // desktop.compile();
        }
    
        // public Computer getLap() {
        //     return lap;
        // }
    
        // public void setLap(Laptop lap) {
        //     System.out.println("From setLap");
        //     this.lap = lap;
        // }
    
        public Computer getComp() {
            return comp;
        }
    
        public void setComp(Computer comp) {
            this.comp = comp;
    }
}
