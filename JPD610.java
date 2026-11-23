import java.util.Scanner;
 
class Part {
    int cost;
 
    Part() {
        cost = 0;
    }
 
    public int getcost() {
        return cost;
    }
 
    public void setCost(int cost) {
        this.cost = cost;
    }
}
 
// TO DO
class LCD extends Part {
    int size;
 
    public LCD(int size) throws Exception {
        this.size = size;
        if(this.size==10) {
            this.setCost(1500);
        } else if(this.size==15) {
            this.setCost(2500);
        } else if(this.size==17) {
            this.setCost(3500);
        } else {
            throw new Exception();
        }
       
    }
 
 
   
 
 
}
 
class CPU extends Part {
    double speed;
 
    public CPU(double speed) throws Exception {
        this.speed = speed;
        if(this.speed==1.66) {
            this.setCost(7000);
        } else if(this.speed==2.2) {
            this.setCost(8500);
        } else if (this.speed==2.4) {
            this.setCost(13000);
        } else {
            throw new Exception();
        }
    }
   
}
 
class HD extends  Part {
    int size;
 
    public HD(int size) throws Exception {
        this.size = size;
        if(this.size==256) {
            this.setCost(1800);
        } else if(this.size==512) {
            this.setCost(2500);
        } else {
            throw new Exception();
        }
    }
   
}
 
class Notebook {
    LCD lcd;
    CPU cpu;
    HD hd;
    double profit;
   
    public void setProfit(double profit) {
        this.profit = profit;
    }
 
    public Notebook() throws Exception{
		this(10, 1.66, 256);
      
    }
 
    public Notebook(int size, double speed, int vol) throws Exception  {
        this.lcd = new LCD(size);
		this.cpu = new CPU(speed);
		this.hd = new HD(vol);

    }
   
    public int getCost() {
        return this.lcd.getcost()+this.cpu.getcost()+this.hd.getcost();
    }
 
    public double getPrice() {
		return this.getCost() * this.profit;
    }
 
}
 
public class JPD610 {
    public static void main(String args[]) {
        // TO DO
 
        try {
            // TO DO
            Scanner sc = new Scanner(System.in);
            String[] a = sc.nextLine().split(" ");
            if(a.length==2){
                int n = Integer.parseInt(a[0]);
                double p = Double.parseDouble(a[1]);
                Notebook notebook = new Notebook();
                notebook.setProfit(p);
                System.out.println("NB:"+n+",Cost:"+notebook.getCost()*n+",Total:"+Math.round(notebook.getPrice()*n));
            } else if(a.length==5) {
                int n = Integer.parseInt(a[0]);
                double p = Double.parseDouble(a[1]);
                Notebook notebook = new Notebook(Integer.parseInt(a[2]), Double.parseDouble(a[3]), Integer.parseInt(a[4]));
                notebook.setProfit(p);
                System.out.println("NB:"+n+",Cost:"+notebook.getCost()*n+",Total:"+Math.round(notebook.getPrice()*n));
            } else {
                throw new Exception();
            }
 
        } catch (Exception e) {
            System.out.print("error");
            return;
        }
        // TO DO
 
    }
}
 