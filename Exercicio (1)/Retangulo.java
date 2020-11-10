public class Retangulo extends Forma{
    private double base;
    private double altura;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    
    
    
    
    @Override
    public String getNome() {
        return "Retangulo";
    }
    
    
    @Override
    double calcularPerimetro() {
       return (base * 2) + (altura * 2);
    }
    
    @Override
    public double getArea() {

        return base * altura;
    }
}