public class Quadrado extends Forma{
    
   private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }
    

    @Override
    public String getNome() {
        return "Quadrado";
    }
    
    @Override
    double calcularPerimetro() {
       return lado * 4;
    }
    
    @Override
    public double getArea() {

        return lado * lado;
    }
    
    
}