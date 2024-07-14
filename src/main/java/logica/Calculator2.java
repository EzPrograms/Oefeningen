package logica;

public class Calculator2 {

    int a;
    int b;
    public Calculator2(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int Add(){
        int c = a + b;
        return c;
    }
    public int Min(){
        int c = a - b;
        return c;
    }
    public int Multi(){
        int c = a * b;
        return c;
    }
    public int Divide(){
        int c = a / b;
        return c;
    }
    public double Pow(){
        double c = Math.pow(a,b);
        return c;
    }
    public double Square(int keuze){
        double c;
        if (keuze == 1){
            return c = Math.sqrt(a);
        } else {
            return c = Math.sqrt(b);
        }
    }
}

